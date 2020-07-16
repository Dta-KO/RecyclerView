package com.example.recyclerview.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.recyclerview.adapter.SummaryAdapter;
import com.example.recyclerview.R;
import com.example.recyclerview.data.Word;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SummaryFragment extends Fragment {
    private final OnSummaryFragmentNextListener listener;
    private int numberOfCorrectWords;
    private int numberOfWrongWords;
    private ArrayList<Word> wrongWords;

    public SummaryFragment(OnSummaryFragmentNextListener listener,
                           int numberOfCorrectWords,
                           int numberOfWrongWords,
                           ArrayList<Word> wrongWords) {
        this.listener = listener;
        this.numberOfCorrectWords = numberOfCorrectWords;
        this.numberOfWrongWords = numberOfWrongWords;
        this.wrongWords = wrongWords;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_summary, container, false);

        TextView correctNumber = v.findViewById(R.id.tv_num_correct);
        correctNumber.setText(String.valueOf(numberOfCorrectWords));

        TextView wrongNumber = v.findViewById(R.id.tv_num_wrong);
        wrongNumber.setText(String.valueOf(numberOfWrongWords));

        handleRecyclerViewOfWrongWords(v);
        handleNextButtonClicked(v);
        return v;
    }

    private void handleRecyclerViewOfWrongWords(View v) {
        RecyclerView recyclerView = v.findViewById(R.id.summaryRecyclerview);
        recyclerView.setHasFixedSize(true);
        SummaryAdapter summaryAdapter = new SummaryAdapter(getContext(), wrongWords);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(summaryAdapter);
    }

    private void handleNextButtonClicked(View v) {
        Button button = v.findViewById(R.id.btnNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnSummaryFragmentNext();
            }
        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public interface OnSummaryFragmentNextListener {
        void OnSummaryFragmentNext();
    }
}
