package com.example.recyclerview.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.adapter.CourseAdapter;
import com.example.recyclerview.adapter.OnItemClickListener;
import com.example.recyclerview.data.Course;
import com.example.recyclerview.R;
import com.example.recyclerview.data.CourseDAO;
import com.example.recyclerview.data.DatabaseHelper;
import com.example.recyclerview.data.Topic;
import com.example.recyclerview.data.TopicDAO;
import com.example.recyclerview.data.WordDAO;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CourseFragment extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private ArrayList<Course> arrayListCourse;
    OnItemClickListener listener;

    public CourseFragment(OnItemClickListener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_course, container, false);
        recyclerView = v.findViewById(R.id.courseRecyclerView);
        recyclerView.setHasFixedSize(true);
        CourseAdapter courseAdapter = new CourseAdapter(getContext(), arrayListCourse, listener);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(courseAdapter);
        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arrayListCourse = calculateNumberOfWordsInEachCourse();
    }

    private ArrayList<Course> calculateNumberOfWordsInEachCourse() {
        CourseDAO courseDAO = CourseDAO.fromContext(getActivity());
        ArrayList<Course> allCourses = courseDAO.getAllCourses();

        TopicDAO topicDAO = TopicDAO.fromContext(getActivity());
        WordDAO wordDAO = WordDAO.fromContext(getActivity());
        for (Course course : allCourses) {
            int numberOfWords = 0;
            ArrayList<Topic> topics = topicDAO.getTopicsByCourseId(course.getId());
            for (Topic topic : topics) {
                numberOfWords += wordDAO.getNumberOfWordsByCategory(topic.getName());
            }
            course.setNumberOfWords(numberOfWords);
        }
        return allCourses;
    }
}
