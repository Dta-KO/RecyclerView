package com.example.recyclerview.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class CourseDAO {
    public static final String TABLE_NAME = "course";
    public static final String ID = "id";
    public static final String IMAGE = "image";
    public static final String TITLE = "title";
    private final DatabaseHelper databaseHelper;

    public static CourseDAO fromContext(Context context) {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        return new CourseDAO(databaseHelper);
    }

    public CourseDAO(DatabaseHelper databaseHelper) {
        this.databaseHelper = databaseHelper;
    }

    private void addCourse(Course course, SQLiteDatabase db) {
        ContentValues values = getContentValues(course);
        db.insert(TABLE_NAME, null, values);
    }

    public Course getCourseByTitle(String courseTitle) {
        Course course = null;
        String selectQuery = "SELECT * FROM " + TABLE_NAME + " where " + TITLE + "='" + courseTitle + "'";

        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            course = new Course(
                cursor.getInt(0),
                cursor.getInt(1),
                cursor.getString(2)
            );
        }

        cursor.close();
        return course;
    }

    public ContentValues getContentValues(Course course) {
        ContentValues values = new ContentValues();
        values.put(ID, course.getId());
        values.put(IMAGE, course.getImage());
        values.put(TITLE, course.getTitle());
        return values;
    }

    public ArrayList<Course> getAllCourses() {
        ArrayList<Course> courses = new ArrayList<>();

        String selectQuery = "SELECT * FROM " + TABLE_NAME;

        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                courses.add(new Course(
                        cursor.getInt(0),
                        cursor.getInt(1),
                        cursor.getString(2)
                ));
            } while (cursor.moveToNext());
        }

        cursor.close();
        return courses;
    }

    public void addCourses(ArrayList<Course> arrayListCourse) {
        SQLiteDatabase db = this.databaseHelper.getWritableDatabase();
        for (Course course : arrayListCourse) {
            addCourse(course, db);
        }
        db.close();
    }
}
