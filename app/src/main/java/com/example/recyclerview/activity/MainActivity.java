package com.example.recyclerview.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.OnItemClickListener;
import com.example.recyclerview.data.Course;
import com.example.recyclerview.data.DatabaseInitializer;
import com.example.recyclerview.fragment.CourseFragment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {
    public static final String COURSE_DATA = "COURSE_DATA";
    private static final int SETTING_ACTIVITY_REQUEST = 1000;
    private static final int REMIND_ACTIVITY_REQUEST = 1001;
    public static Context Context;
    boolean isVisible;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context = this;
        isVisible = true;

        GoToRemindActivityIfNecessary();
        InitDatabaseInThread();
    }

    private void GoToRemindActivityIfNecessary() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean isRemindAlreadyBeSet = sharedPreferences.getBoolean(RemindActivity.ALREADY_SET_REMIND, false);
        if (!isRemindAlreadyBeSet) {
            Intent intent = new Intent(MainActivity.this, RemindActivity.class);
            startActivityForResult(intent, REMIND_ACTIVITY_REQUEST);
        }
    }

    private void InitDatabaseInThread() {
        final MainActivity this_ = this;
        Thread initializeDatabaseThread = new Thread(new Runnable() {
            @Override
            public void run() {
                new DatabaseInitializer().runInitialization(this_);
                this_.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (isVisible) {
                            this_.nextFragment(new CourseFragment(this_), R.id.fragmentContent);
                            findViewById(R.id.database_loading_progress).setVisibility(View.INVISIBLE);
                        }
                    }
                });
            }
        });
        initializeDatabaseThread.start();
    }

    public void nextFragment(androidx.fragment.app.Fragment fragment, int id) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(id, fragment);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.commit();
    }

    @Override
    public void onItemClick(Course course) {
        Intent intent = new Intent(MainActivity.this, TopicActivity.class);
        intent.putExtra(COURSE_DATA, course.getTitle());
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
            Intent intent = new Intent(MainActivity.this, SettingActivity.class);
            startActivityForResult(intent, MainActivity.SETTING_ACTIVITY_REQUEST);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REMIND_ACTIVITY_REQUEST: {
                nextFragment(new CourseFragment(this), R.id.fragmentContent);
                findViewById(R.id.database_loading_progress).setVisibility(View.INVISIBLE);
                break;
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        isVisible = true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        isVisible = false;
    }
}
