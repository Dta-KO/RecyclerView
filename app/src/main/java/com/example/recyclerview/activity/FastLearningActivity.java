package com.example.recyclerview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerview.R;
import com.example.recyclerview.data.ConstSaveData;
import com.example.recyclerview.data.DatabaseHelper;
import com.example.recyclerview.data.Word;
import com.example.recyclerview.data.WordDAO;
import com.example.recyclerview.fragment.ChooseAnswerFragment;
import com.example.recyclerview.fragment.ListeningFragment;
import com.example.recyclerview.fragment.SpeechToTextFragment;
import com.example.recyclerview.fragment.SummaryFragment;
import com.example.recyclerview.fragment.WritingFragment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class FastLearningActivity
        extends AppCompatActivity
        implements
        ChooseAnswerFragment.OnChooseAnswerFragmentNextListener,
        SummaryFragment.OnSummaryFragmentNextListener
        {

    private String topicName;
    ArrayList<Word> words;
    ArrayList<Word> learningWords;
    Menu menu;
    int currentLearningWord = 0;
    int wrongTimes = 0;
    DatabaseHelper databaseHelper;
    WordDAO wordDAO;
    private int numberOfCorrectWords = 0;
    private int numberOfWrongWords = 0;
    private ArrayList<Word> wrongWords = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        settingUpActionBar();

        topicName = getIntent().getStringExtra(WordListActivity.TOPIC);
        databaseHelper = new DatabaseHelper(this);
        wordDAO = new WordDAO(databaseHelper);

        setupWords();
        nextFragment(createChooseAnswerFragment(), R.id.trainingFragmentLayout);
    }

    class WordCorrectionTimeComparator implements Comparator<Word> {
        public int compare(Word s1, Word s2) {
            if (s1.getCorrectAnswerTimes() < ConstSaveData.NUMBER_CORRECT_TIME_TO_BE_LEARNED &&
                s2.getCorrectAnswerTimes() < ConstSaveData.NUMBER_CORRECT_TIME_TO_BE_LEARNED) {
                // If that words are not learned, we still want to make question
                // about that word for learning again
                return 0;
            }
            return Integer.compare(s1.getCorrectAnswerTimes(), s2.getCorrectAnswerTimes());
        }
    }

    private void setupWords() {
        DatabaseHelper helper = new DatabaseHelper(this);
        WordDAO wordDAO = new WordDAO(helper);
        words = wordDAO.getWordsByCategory(topicName);
        Collections.sort(words, new WordCorrectionTimeComparator());
        learningWords = new ArrayList<>();
        for (int i = 9; i >= 0; i--) {
            learningWords.add(words.get(i));
            words.remove(i);
        }
    }

    public ChooseAnswerFragment createChooseAnswerFragment() {
        if (currentLearningWord >= learningWords.size()) {
            return null;
        }
        ArrayList<Word> words = wordDAO.getWordsByCategory(topicName);
        if (words.size() < 4) {
            return null;
        }
        return new ChooseAnswerFragment(this, this, learningWords.get(currentLearningWord), words);
    }

    private void settingUpActionBar() {
        getSupportActionBar().setTitle(null);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close_black);
    }

    public void nextFragment(androidx.fragment.app.Fragment fragment, int id) {
        if (fragment == null || wrongTimes >= 3) {
            fragment = createSummaryFragment();
        }
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(id, fragment);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        transaction.commit();
    }

    private SummaryFragment createSummaryFragment() {
        return new SummaryFragment(this, numberOfCorrectWords, numberOfWrongWords, wrongWords);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fast_learning_menu, menu);
        this.menu = menu;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void OnSummaryFragmentNext() {
        finish();
    }

    @Override
    public void OnChooseAnswerFragmentNext(boolean isCorrect) {
        if (!isCorrect) {
            this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    inCreaseWrongTime();
                }
            });
        }

        Word currentWord = learningWords.get(currentLearningWord);
        if (isCorrect) {
            currentWord.setCorrectAnswerTimes(currentWord.getCorrectAnswerTimes() + 1);
            wordDAO.updateWord(currentWord);
            numberOfCorrectWords++;
        } else {
            numberOfWrongWords++;
            wrongWords.add(currentWord);
        }
        currentLearningWord++;
        nextFragment(createChooseAnswerFragment(), R.id.trainingFragmentLayout);
    }

    private void inCreaseWrongTime() {
        wrongTimes++;
        MenuItem it = null;
        if (wrongTimes == 1) {
            it = menu.findItem(R.id.heart3);
        } else if (wrongTimes == 2) {
            it = menu.findItem(R.id.heart2);
        } else if (wrongTimes == 3) {
            it = menu.findItem(R.id.heart1);
        }

        if (it != null) {
            it.setIcon(R.drawable.ic_hear_black);
        }
    }

}
