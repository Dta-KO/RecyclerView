package com.example.recyclerview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.recyclerview.adapter.CourseTopicAdapter;
import com.example.recyclerview.data.Course;
import com.example.recyclerview.data.CourseDAO;
import com.example.recyclerview.data.Topic;
import com.example.recyclerview.data.TopicDAO;
import com.example.recyclerview.R;
import com.example.recyclerview.data.WordDAO;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TopicActivity extends AppCompatActivity implements CourseTopicAdapter.OnItemClickListener {

    public static final String TOPIC_NAME = "TOPIC_NAME";

    public static final String FAMILY = "Family";
    public static final String ANIMAL = "Animal";
    public static final String CLOTHES = "Clothes";
    public static final String COLOR = "Color";
    public static final String FRUIT = "Fruit";
    public static final String COOKING = "Cooking";
    public static final String MUSIC = "Music";
    public static final String NUMBER = "Number";
    public static final String SCHOOL = "School";
    public static final String SPORT = "Sport";
    public static final String TRAFFIC = "Traffic";
    public static final String VEGETABLES = "Vegetables";
    public static final String WEATHER = "Weather";
    public static final String HOSPITAL = "Hospital";
    public static final String RESTAURANT = "Restaurant";
    public static final String ADJECTIVE = "Adjective";
    public static final String ACTION = "Action";

    private static final int SETTING_ACTIVITY_REQUEST = 1000;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_basic_english);

        Intent parentIntent = getIntent();
        String courseTitle = parentIntent.getStringExtra(MainActivity.COURSE_DATA);

        ArrayList<Topic> topics = setupTopics(courseTitle);
        setupRecyclerView(topics);
        setTitle(courseTitle);
    }

    private void setupRecyclerView(ArrayList<Topic> topics) {
        RecyclerView recyclerView = findViewById(R.id.basicEnglishRecyclerView);
        CourseTopicAdapter courseTopicAdapter =
                new CourseTopicAdapter(TopicActivity.this, topics, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(courseTopicAdapter);
    }

    private ArrayList<Topic> setupTopics(String courseTitle) {
        Course course = CourseDAO.fromContext(this).getCourseByTitle(courseTitle);
        TopicDAO topicDAO = TopicDAO.fromContext(this);
        ArrayList<Topic> topics = topicDAO.getTopicsByCourseId(course.getId());
        WordDAO wordDAO = WordDAO.fromContext(this);
        for (Topic topic : topics) {
            topic.setNumberOfWords(wordDAO.getNumberOfWordsByCategory(topic.getName()));
        }
        return topics;
    }

    @Override
    public void onItemClick(Topic topic) {
        Intent intent = new Intent(TopicActivity.this, WordListActivity.class);
        intent.putExtra(TOPIC_NAME, topic.getName());
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_setting) {
            Intent intent = new Intent(TopicActivity.this, SettingActivity.class);
            startActivityForResult(intent, TopicActivity.SETTING_ACTIVITY_REQUEST);
        }
        return super.onOptionsItemSelected(item);
    }
}