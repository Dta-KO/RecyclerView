package com.example.recyclerview.fragment;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.MainActivity;
import com.example.recyclerview.data.Word;
import com.squareup.picasso.Downloader;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class ChooseAnswerFragment extends Fragment {

    private final OnChooseAnswerFragmentNextListener listener;
    private Word word;
    private ArrayList<Word> words;
    private ProgressBar pbPercent;
    private List<TextView> textViewList = new ArrayList<>();
    Activity activity;
    private Thread t;
    private boolean okForExit;


    public ChooseAnswerFragment(
            Activity activity,
            OnChooseAnswerFragmentNextListener listener,
            Word word,
            ArrayList<Word> words) {
        okForExit = false;
        this.listener = listener;
        this.words = words;
        this.word = word;
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_chooseanswer, container, false);

        handleProgressBar(v);

        TextView wordValueText = (TextView) v.findViewById(R.id.word_value);
        wordValueText.setText(word.getValue());

        TextView answer1 = (TextView) v.findViewById(R.id.answerTraining_1);
        TextView answer2 = (TextView) v.findViewById(R.id.answerTraining_2);
        TextView answer3 = (TextView) v.findViewById(R.id.answerTraining_3);
        TextView answer4 = (TextView) v.findViewById(R.id.answerTraining_4);

        textViewList.add(answer1);
        textViewList.add(answer2);
        textViewList.add(answer3);
        textViewList.add(answer4);
        int randNumber = ThreadLocalRandom.current().nextInt(0, 4);
        for (int i = 0; i < 4; i++) {
            if (i == randNumber) {
                textViewList.get(i).setText(word.getMeaning());
                textViewList.get(i).setTag(true);
            } else {
                int wordCount = ThreadLocalRandom.current().nextInt(0, words.size());
                textViewList.get(i).setText(words.get(wordCount).getMeaning());
            }
        }

        for (TextView tv : textViewList) {
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnChooseAnswer((TextView)v);
                }
            });
        }

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        return v;
    }

    private void handleProgressBar(View v) {
        final double maxSecond = 5.0;
        final double sleepSecond = 0.1;
        final ProgressBar progressBar = v.findViewById(R.id.progressTraining);
        t = new Thread() {
            public void run() {
                double totalSecond = 0;
                while (progressBar.getProgress() < 100) {
                    try {
                        final double finalTotalSecond = totalSecond;
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                int progress = (int) (finalTotalSecond * 100 / maxSecond);
                                progressBar.setProgress(Math.min(progress, 100));
                            }
                        });
                        Thread.sleep((int)(sleepSecond * 1000));
                        totalSecond += sleepSecond;
                        if (okForExit) {
                            break;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (progressBar.getProgress() == 100) {
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            listener.OnChooseAnswerFragmentNext(false);
                        }
                    });
                }
            }
        };
        t.start();
    }

    private void OnChooseAnswer(TextView tv) {
        for (TextView tmp: textViewList) {
            tmp.setBackgroundColor(0xffffffff);
            tmp.setTextColor(Color.rgb(0, 0, 0));
        }
        boolean isCorrect;
        if (tv.getTag() != null) {
            Toast.makeText(getActivity(), "Correct answer", Toast.LENGTH_SHORT).show();
            tv.setBackgroundColor(Color.rgb(0, 220, 0));
            isCorrect = true;
        } else {
            tv.setBackgroundColor(Color.rgb(220, 0, 0));
            isCorrect = false;
        }
        tv.setTextColor(Color.rgb(255, 255, 255));
        listener.OnChooseAnswerFragmentNext(isCorrect);
        okForExit = true;
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Log.d(ChooseAnswerFragment.class.toString(), "Can't join thread");
        }
    }

    public interface OnChooseAnswerFragmentNextListener {
        void OnChooseAnswerFragmentNext(boolean isCorrect);
    }
}
