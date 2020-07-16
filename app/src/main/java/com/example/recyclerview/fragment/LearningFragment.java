package com.example.recyclerview.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.LearningAndPracticeActivity;

public class LearningFragment extends Fragment {
    private final OnLearningFragmentNextListener listener;
    private TextView tvTopicWordName;
    private ImageView imgImage;
    private TextView tvMean;

    public LearningFragment(OnLearningFragmentNextListener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_learn, container, false);

        LearningAndPracticeActivity activity = (LearningAndPracticeActivity) getActivity();
        tvTopicWordName = v.findViewById(R.id.tv_topic_word_name);
        imgImage = v.findViewById(R.id.img_image);
        tvMean = v.findViewById(R.id.tv_mean);
        tvTopicWordName.setText(activity.getWordName());
        tvMean.setText(activity.getWordMean());
        Button button = v.findViewById(R.id.btnNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnLearningFragmentNext();
            }
        });

        return v;


    }


    public interface OnLearningFragmentNextListener {
        void OnLearningFragmentNext();
    }


}
