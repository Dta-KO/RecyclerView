package com.example.recyclerview.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LearningAndTrainingFragment extends Fragment {
    private final OnLearningAndTrainingFragmentNextListener listener;

    public LearningAndTrainingFragment(OnLearningAndTrainingFragmentNextListener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_learning_and_training, container, false);
        List<TextView> textViewList = new ArrayList<>();

        textViewList.add((TextView) v.findViewById(R.id.answer_1));
        textViewList.add((TextView) v.findViewById(R.id.answer_2));
        textViewList.add((TextView) v.findViewById(R.id.answer_3));
        textViewList.add((TextView) v.findViewById(R.id.answer_4));

        for (TextView tv : textViewList) {
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.OnLearningAndTrainingFragmentNext();
                }
            });
        }
        return v;
    }

    public interface OnLearningAndTrainingFragmentNextListener {
        void OnLearningAndTrainingFragmentNext();
    }
}
