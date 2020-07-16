package com.example.recyclerview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.recyclerview.R;
import com.example.recyclerview.data.DatabaseHelper;
import com.example.recyclerview.data.Word;
import com.example.recyclerview.data.WordDAO;
import com.example.recyclerview.utils.TextToSpeedUtils;

import java.util.Locale;

public class WordDetailActivity extends AppCompatActivity {

    private TextToSpeech textToSpeech;
    private TextView tvTopicWordName;
    private TextView tvExample;
    private TextView tvMean;
    private DatabaseHelper helper = new DatabaseHelper(this);
    private int wordId;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_word_detail);

        tvTopicWordName = findViewById(R.id.tv_topic_word_name);
        tvExample = findViewById(R.id.tv_sentence);
        tvMean = findViewById(R.id.tv_mean);

        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.ENGLISH);
                } else {
                    Toast.makeText(WordDetailActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

        handleSpeakerClicked();
        settingActionBar();
        getWordInIntent();
        handleButtonNextClicked();

    }

    private void handleButtonNextClicked() {
        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wordId += 1;
                WordDAO wordDAO = new WordDAO(helper);
                Word word = wordDAO.getWordById(wordId);
                tvMean.setText(word.getMeaning());
                tvTopicWordName.setText(word.getValue());
                tvExample.setText(word.getExample());
            }
        });
    }

    private void handleSpeakerClicked() {
        ImageButton imgButtonSpeaker = findViewById(R.id.image_btnSpeaker);
        imgButtonSpeaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = tvTopicWordName.getText().toString().trim();
                TextToSpeedUtils.speak(text, WordDetailActivity.this, textToSpeech);
            }
        });
    }

    private void getWordInIntent() {
        Intent intent = getIntent();
        wordId = intent.getIntExtra(WordListActivity.WORD_ID, -1);
        if (wordId == -1) {
            Toast.makeText(this, "Wrong word id", Toast.LENGTH_SHORT).show();
            return;
        }
        WordDAO wordDAO = new WordDAO(helper);
        Word word = wordDAO.getWordById(wordId);
        tvMean.setText(word.getMeaning());
        tvTopicWordName.setText(word.getValue());
        tvExample.setText(word.getExample());
    }

    private void settingActionBar() {
        getSupportActionBar().setTitle(null);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.topic_word_detail, menu);
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
    protected void onPause() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onPause();
    }

    public void nextFragment(androidx.fragment.app.Fragment fragment, int id) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(id, fragment);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        transaction.commit();
    }

}
