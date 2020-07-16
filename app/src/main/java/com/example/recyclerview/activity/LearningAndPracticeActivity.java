package com.example.recyclerview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.recyclerview.R;
import com.example.recyclerview.data.DatabaseHelper;
import com.example.recyclerview.data.Word;
import com.example.recyclerview.data.WordDAO;
import com.example.recyclerview.fragment.LearningAndTrainingFragment;
import com.example.recyclerview.fragment.LearningFragment;
import com.example.recyclerview.fragment.ListeningFragment;
import com.example.recyclerview.fragment.SpeechToTextFragment;
import com.example.recyclerview.fragment.WritingFragment;

import java.util.ArrayList;

public class LearningAndPracticeActivity
        extends AppCompatActivity
        implements
        LearningFragment.OnLearningFragmentNextListener,
        LearningAndTrainingFragment.OnLearningAndTrainingFragmentNextListener,
        ListeningFragment.OnListeningFragmentNextListener,
        WritingFragment.OnWritingFragmentNextListener,
        SpeechToTextFragment.OnSpeechFragmentNextListener,
        SpeechToTextFragment.OnSpeechFragmentVoiceListener {

    private static final int REQUEST_CODE_SPEECH_INPUT = 1;

    private DatabaseHelper helper = new DatabaseHelper(this);


    private int idBeginWord = 0;
    private String wordName, wordMean;

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public void setWordMean(String wordMean) {
        this.wordMean = wordMean;
    }

    public String getWordName() {
        return wordName;
    }

    public String getWordMean() {
        return wordMean;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_and_practice);

        nextFragment(new LearningFragment(this), R.id.learning_and_practiceFragmentLayout);

        getSupportActionBar().setTitle(null);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close_black);
        setWord();

    }

    public void nextFragment(androidx.fragment.app.Fragment fragment, int id) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(id, fragment);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        transaction.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.learning, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(
                    getApplicationContext(), "Clicked on ActionBar",
                    Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void OnLearningFragmentNext() {
        nextFragment(new ListeningFragment(this), R.id.learning_and_practiceFragmentLayout);
    }

    @Override
    public void OnLearningAndTrainingFragmentNext() {
        //    nextFragment(new LearningFragment(this), R.id.learning_and_practiceFragmentLayout);
    }

    @Override
    public void OnListeningFragmentNext() {
        nextFragment(new WritingFragment(this), R.id.learning_and_practiceFragmentLayout);
    }

    @Override
    public void OnWritingFragmentNext() {
        nextFragment(new SpeechToTextFragment(this, this), R.id.learning_and_practiceFragmentLayout);
    }

    @Override
    public void OnSpeechFragmentNext() {
        // nextFragment(new SummaryFragment(), R.id.learning_and_practiceFragmentLayout);
        idBeginWord+=1;
        setWord();
        nextFragment(new LearningFragment(this),R.id.learning_and_practiceFragmentLayout);
    }

    @Override
    public void OnSpeechFragmentVoice() {
        speak();

    }

    public interface OnClickItemHomeListener {
        void onClickItemHome();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView tvPress;
        tvPress = findViewById(R.id.tv_press);
        switch (requestCode) {
            case REQUEST_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {
                    // get text array from voice intent
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    // set to text view
                    tvPress.setText(result.get(0));
                    if (tvPress.getText().toString().toLowerCase().equals(getWordName())){
                        Toast.makeText(getApplicationContext(),"Wow, You speak like a native!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Sorry, You need to practice more!",Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            }
        }
    }

    private void setWord() {
        WordDAO wordDAO = new WordDAO(helper);
        Intent intent = getIntent();
        String topicName = intent.getStringExtra(WordListActivity.TOPIC);
        ArrayList<Word> words = wordDAO.getWordsByCategory(topicName);
        Word beginWord = words.get(idBeginWord);
        wordName = beginWord.getValue();
        wordMean = beginWord.getMeaning();
    }

    private void speak() {
        //intent to show speech to text dialog
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        //  intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Hi speech something");
        startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);

        //start intent
        try {
            // in there was no error, show dialog
            startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);
        } catch (Exception e) {
            //if there was some error. get message of error and show
            Toast.makeText(this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

}
