package com.example.recyclerview.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.LearningAndPracticeActivity;
import com.example.recyclerview.data.Word;
import com.example.recyclerview.utils.TextToSpeedUtils;

import java.util.Locale;

public class ListeningFragment extends Fragment {
    public final OnListeningFragmentNextListener listener;
    private TextToSpeech textToSpeech;
    private TextView wordName, wordMean;

    public ListeningFragment(OnListeningFragmentNextListener listener) {
        this.listener = listener;
    }

    public void setTextToSpeech() {
        textToSpeech = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.ENGLISH);
                } else {
                    Toast.makeText(getContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_listening, container, false);
        Button button = v.findViewById(R.id.btnNext);
        ImageView imageView = v.findViewById(R.id.img_listening);
        wordName = v.findViewById(R.id.txt_word_name);
        wordMean = v.findViewById(R.id.tv_mean);
        getData();
        setTextToSpeech();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextToSpeedUtils.speak(wordName.getText().toString(), getContext(), textToSpeech);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnListeningFragmentNext();
            }
        });
        return v;
    }

    private void getData() {
        LearningAndPracticeActivity activity = (LearningAndPracticeActivity) getActivity();
        wordName.setText(activity.getWordName());
        wordMean.setText(activity.getWordMean());
    }

    @Override
    public void onPause() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onPause();
    }

    public interface OnListeningFragmentNextListener {
        void OnListeningFragmentNext();
    }
}
