package com.example.recyclerview.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class TopicDAO {
    public static final String FAMILY = "FAMILY";
    public static final String ANIMAL = "ANIMAL";
    public static final String CLOTHES = "CLOTHES";
    public static final String COLOR = "COLOR";
    public static final String FRUIT = "FRUIT";
    public static final String COOKING = "COOKING";
    public static final String MUSIC = "MUSIC";
    public static final String NUMBER = "NUMBER";
    public static final String SCHOOL = "SCHOOL";
    public static final String SPORT = "SPORT";
    public static final String TRAFFIC = "TRAFFIC";
    public static final String VEGETABLE = "VEGETABLE";
    public static final String WEATHER = "WEATHER";
    public static final String HOSPITAL = "HOSPITAL";
    public static final String RESTAURANT = "RESTAURANT";
    public static final String ADJECTIVE = "ADJECTIVE";
    public static final String ACTION = "ACTION";
    public static final String CLASS1 = "CLASS1";
    public static final String CLASS2 = "CLASS2";
    public static final String CLASS3 = "CLASS3";
    public static final String CLASS4 = "CLASS4";
    public static final String CLASS5 = "CLASS5";
    public static final String CLASS6 = "CLASS6";
    public static final String CLASS7 = "CLASS7";
    public static final String CLASS8 = "CLASS8";
    public static final String CLASS9 = "CLASS9";
    public static final String CLASS10 = "CLASS10";
    public static final String CLASS11 = "CLASS11";
    public static final String CLASS12 = "CLASS12";
    public static final String POSITION = "POSITION";
    public static final String DEPARTMENT = "DEPARTMENT";
    public static final String SUPPLY = "SUPPLY";
    public static final String BENEFIT = "BENEFIT";
    public static final String CONFERENCE = "CONFERENCE";
    public static final String MACHINES = "MACHINES";
    public static final String COMMON = "COMMON";
    public static final String STRUCTURE = "STRUCTURE";
    public static final String JOBS = "JOBS";
    public static final String PERIPHERALS = "PERIPHERALS";
    public static final String MEETING = "MEETING";
    public static final String EQUIPMENT = "EQUIPMENT";
    public static final String TECHNOLOGY = "TECHNOLOGY";
    public static final String TOUR_GUIDE = "TOUR_GUIDE";
    public static final String AGENCY = "AGENCY";
    public static final String HOTEL = "HOTEL";
    public static final String SEA = "SEA";
    public static final String PLANE = "PLANE";
    public static final String OVERVIEW = "OVERVIEW";
    public static final String LISTENING = "LISTENING";
    public static final String SPEAKING = "SPEAKING";
    public static final String READING = "READING";
    public static final String WRITING = "WRITING";
    public static final String CONTRACTS = "CONTRACTS";
    public static final String SHOPPING = "SHOPPING";
    public static final String MARKETING = "MARKETING";
    public static final String ACCOUNTING = "ACCOUNTING";
    public static final String MOVIES = "MOVIES";
    public static final String TABLE_NAME = "topic";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String COURSE_ID = "course_id";
    private final DatabaseHelper databaseHelper;

    public static TopicDAO fromContext(Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        return new TopicDAO(databaseHelper);
    }

    public TopicDAO(DatabaseHelper databaseHelper) {
        this.databaseHelper = databaseHelper;
    }

    public ContentValues getContentValues(Topic topic) {
        ContentValues values = new ContentValues();
        values.put(ID, topic.getId());
        values.put(COURSE_ID, topic.getCourseId());
        values.put(NAME, topic.getName());
        return values;
    }

    private void addTopic(Topic topic, SQLiteDatabase db) {
        ContentValues values = getContentValues(topic);
        db.insert(TABLE_NAME, null, values);
    }

    public void addTopics(ArrayList<Topic> topics) {
        SQLiteDatabase db = this.databaseHelper.getWritableDatabase();
        for (Topic topic : topics) {
            addTopic(topic, db);
        }
        db.close();
    }

    public ArrayList<Topic> getTopicsByCourseId(int courseId) {
        ArrayList<Topic> topics = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + TABLE_NAME + " where " + COURSE_ID + "=" + courseId;
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                topics.add(new Topic(
                    cursor.getInt(0),
                    cursor.getInt(1),
                    cursor.getString(2)
                ));
            } while (cursor.moveToNext());
        }
        cursor.close();
        return topics;
    }
}
