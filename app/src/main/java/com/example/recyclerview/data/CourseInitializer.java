package com.example.recyclerview.data;

import android.content.Context;

import com.example.recyclerview.R;

import java.util.ArrayList;

public class CourseInitializer implements DataInitializable {
    public static final String BASIC_ENGLISH = "Basic English";
    public static final String ENGLISH_FOR_CHILDREN = "English for Children";
    public static final String ENGLISH_FOR_HIGH_SCHOOL = "English for High School";
    public static final String ENGLISH_FOR_OFFICE = "English for Office";
    public static final String ENGLISH_FOR_PROGRAMMING = "English for Programming";
    public static final String ENGLISH_FOR_TRAVEL = "English for Travel";
    public static final String IELTS = "Ielts";
    public static final String TOEIC = "Toeic";

    @Override
    public void runInitialization(Context context) {
        ArrayList<Course> arrayListCourse = initializeCourses();
        DatabaseHelper db = new DatabaseHelper(context);
        CourseDAO courseDAO = new CourseDAO(db);
        courseDAO.addCourses(arrayListCourse);
    }

    private ArrayList<Course> initializeCourses() {
        ArrayList<Course> arrayListCourse = new ArrayList<>();
        arrayListCourse.add(new Course(R.drawable.icon_tienganhcoban, BASIC_ENGLISH));
        arrayListCourse.add(new Course(R.drawable.icon_tienganhtreem, ENGLISH_FOR_CHILDREN));
        arrayListCourse.add(new Course(R.drawable.icon_tienganhtrunghocphothong, ENGLISH_FOR_HIGH_SCHOOL));
        arrayListCourse.add(new Course(R.drawable.icon_tienganhvanphong, ENGLISH_FOR_OFFICE));
        arrayListCourse.add(new Course(R.drawable.icon_tienganhlaptrinh, ENGLISH_FOR_PROGRAMMING));
        arrayListCourse.add(new Course(R.drawable.icon_tienganhdulich, ENGLISH_FOR_TRAVEL));
        arrayListCourse.add(new Course(R.drawable.icon_ielts, IELTS));
        arrayListCourse.add(new Course(R.drawable.icon_toeic, TOEIC));
        return arrayListCourse;
    }
}
