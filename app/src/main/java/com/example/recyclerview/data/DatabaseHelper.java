package com.example.recyclerview.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "po-english-db";
    private static final String TAG = "Database";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG, "Database.onCreate start ");
        Log.i(TAG, "Database.onCreate end ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i(TAG, "Database.onUpgrade start ");

        db.execSQL("DROP TABLE IF EXISTS " + WordDAO.TABLE_NAME);

        Log.i(TAG, "Database.onUpgrade end ");

    }

    public void dropTables() {
        dropWordTable();
        dropTopicTable();
        dropCourseTable();
    }

    private void dropCourseTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "DROP TABLE IF EXISTS " + CourseDAO.TABLE_NAME;
        db.execSQL(sql);
        db.close();
    }

    private void dropTopicTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "DROP TABLE IF EXISTS " + TopicDAO.TABLE_NAME;
        db.execSQL(sql);
        db.close();
    }

    private void dropWordTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "DROP TABLE IF EXISTS " + WordDAO.TABLE_NAME;
        db.execSQL(sql);
        db.close();
    }

    public void createTables() {
        createCourseTable();
        createTopicTable();
        createWordTable();
    }

    private void createTopicTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        String createTableScript = "CREATE TABLE IF Not EXISTS " + TopicDAO.TABLE_NAME + "("
                + TopicDAO.ID + " INTEGER PRIMARY KEY,"
                + TopicDAO.COURSE_ID + " INTEGER,"
                + TopicDAO.NAME + " TEXT"
                + ")";
        db.execSQL(createTableScript);
        db.close();
    }

    private void createCourseTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        String createTableScript = "CREATE TABLE IF Not EXISTS " + CourseDAO.TABLE_NAME + "("
                + CourseDAO.ID + " INTEGER PRIMARY KEY,"
                + CourseDAO.IMAGE + " INTEGER,"
                + CourseDAO.TITLE + " TEXT"
                + ")";
        db.execSQL(createTableScript);
        db.close();
    }

    public void createWordTable() {
        SQLiteDatabase db = this.getWritableDatabase();
        String createTableScript = "CREATE TABLE IF Not EXISTS " + WordDAO.TABLE_NAME + "("
                + WordDAO.ID + " INTEGER PRIMARY KEY,"
                + WordDAO.CATEGORY + " TEXT,"
                + WordDAO.VALUE + " TEXT,"
                + WordDAO.MEANING + " TEXT,"
                + WordDAO.EXAMPLE + " TEXT,"
                + WordDAO.LEARN_TIMES + " TEXT,"
                + WordDAO.CORRECT_ANSWER_TIMES + " TEXT" +
                ")";
        db.execSQL(createTableScript);
        db.close();
    }
}