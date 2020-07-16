package com.example.recyclerview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.TopicWordAdapter;
import com.example.recyclerview.data.DatabaseHelper;
import com.example.recyclerview.data.Word;
import com.example.recyclerview.data.WordDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class WordListActivity
        extends AppCompatActivity
        implements TopicWordAdapter.OnItemClickListener {

    public static final String WORD_ID = "word_id";
    public static final String TOPIC = "TopicWordListActivity.TOPIC";
    public static final String COURSE = "TopicWordListActivity.COURSE";
    private static final int SETTING_ACTIVITY_REQUEST = 1000;
    private static final int LEARNING_AND_PRACTICE_ACTIVITY = 1002;
    private static final int FAST_LEARNING_ACTIVITY = 1001;

    private String topicName;
    private TopicWordAdapter topicWordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_word_list);

        final Intent intent = getIntent();
        topicName = intent.getStringExtra(TopicActivity.TOPIC_NAME);

        ((TextView) findViewById(R.id.tv_topic_name)).setText(topicName + " Topic");

        InitializeRecyclerView();
        setTitle(topicName);

        final View actionGroup = handleClickFloatingButton();
        handleLearningAndPracticeButtonClicked(actionGroup);
        handleFastLearningButtonClicked(actionGroup);
        InitializeData();
    }

    private void InitializeRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.topicWordRecyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        topicWordAdapter = new TopicWordAdapter(
                WordListActivity.this,
                new ArrayList<Word>(),
                this
        );
        recyclerView.setAdapter(topicWordAdapter);
    }

    private void InitializeData() {
        topicWordAdapter.SetWordList(getWordLists(topicName));
        handleProgressReport();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_setting) {
            Intent intent = new Intent(WordListActivity.this, SettingActivity.class);
            startActivityForResult(intent, WordListActivity.SETTING_ACTIVITY_REQUEST);
        }
        return super.onOptionsItemSelected(item);
    }

    private void handleProgressReport() {
        TextView progress = findViewById(R.id.tv_progress);
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        WordDAO wordDAO = new WordDAO(databaseHelper);
        int totalWordsInThisTopic = wordDAO.getNumberOfWordsByCategory(topicName);
        int totalLearnedWordsInThisTopic = wordDAO.getNumberOfLearnedWordsByCategory(topicName);
        progress.setText(
                "Learned words: "
                + totalLearnedWordsInThisTopic
                + "/"
                + totalWordsInThisTopic
        );
    }

    private View handleClickFloatingButton() {
        final View actionGroup = findViewById(R.id.actionGroup);
        FloatingActionButton floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int visibility = actionGroup.getVisibility();
                if (visibility == View.VISIBLE) {
                    actionGroup.setVisibility(View.INVISIBLE);
                } else {
                    actionGroup.setVisibility(View.VISIBLE);
                }
            }
        });
        return actionGroup;
    }

    private void handleFastLearningButtonClicked(final View actionGroup) {
        actionGroup.findViewById(R.id.actionFastLearning).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WordListActivity.this, FastLearningActivity.class);
                intent.putExtra(TOPIC, topicName);
                startActivityForResult(intent, FAST_LEARNING_ACTIVITY);
                actionGroup.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void handleLearningAndPracticeButtonClicked(final View actionGroup) {
        actionGroup.findViewById(R.id.actionTraining).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WordListActivity.this, LearningAndPracticeActivity.class);
                intent.putExtra(TOPIC, topicName);
                startActivityForResult(intent, LEARNING_AND_PRACTICE_ACTIVITY);
                actionGroup.setVisibility(View.INVISIBLE);
            }
        });
    }

    private ArrayList<Word> getWordLists(String topicName) {
        Log.d(WordListActivity.class.toString(), topicName);

        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        WordDAO wordDAO = new WordDAO(databaseHelper);
        return wordDAO.getWordsByCategory(
                topicName,
                WordDAO.CORRECT_ANSWER_TIMES,
                false
        );
    }

    @Override
    public void onItemClick(Word word) {
        Intent intent = new Intent(WordListActivity.this, WordDetailActivity.class);
        intent.putExtra(WORD_ID, word.getId());
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FAST_LEARNING_ACTIVITY) {
            InitializeData();
        }
    }
}
