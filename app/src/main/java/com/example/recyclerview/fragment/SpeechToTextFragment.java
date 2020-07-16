package com.example.recyclerview.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.LearningAndPracticeActivity;

public class SpeechToTextFragment extends Fragment {
    public final OnSpeechFragmentVoiceListener listenerVoice;
    public final OnSpeechFragmentNextListener listenerNext;

    public SpeechToTextFragment(OnSpeechFragmentVoiceListener listenerVoice, OnSpeechFragmentNextListener listenerNext) {
        this.listenerVoice = listenerVoice;
        this.listenerNext = listenerNext;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_speechtotext, container, false);
        LearningAndPracticeActivity activity = (LearningAndPracticeActivity) getActivity();

        TextView tvWord = v.findViewById(R.id.tv_word);
        tvWord.setText(activity.getWordName());
        TextView tvSpelling = v.findViewById(R.id.tv_spelling);
        TextView tvPress = v.findViewById(R.id.tv_press);
        ImageButton imageButtonMic = v.findViewById(R.id.img_btnMic);
        imageButtonMic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenerVoice.OnSpeechFragmentVoice();
            }
        });

        Button btnNext = v.findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenerNext.OnSpeechFragmentNext();
            }
        });
        return v;
    }

    public interface OnSpeechFragmentVoiceListener {
        void OnSpeechFragmentVoice();
    }

    public interface OnSpeechFragmentNextListener {
        void OnSpeechFragmentNext();
    }
}
