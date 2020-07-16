package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.data.SummaryData;
import com.example.recyclerview.R;
import com.example.recyclerview.data.Word;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SummaryAdapter extends RecyclerView.Adapter<SummaryAdapter.MyViewHolder> {
    Context context;
    ArrayList<Word> words ;


    public SummaryAdapter(Context context, ArrayList<Word> words) {
        this.context = context;
        this.words = words;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_topic_word_list, null);
        SummaryAdapter.MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Word word = words.get(position);
        holder.wordValue.setText(word.getValue());
        holder.wordMeaning.setText(word.getMeaning());
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView wordValue;
        private final TextView wordMeaning;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            wordValue = itemView.findViewById(R.id.txtWordValue);
            wordMeaning = itemView.findViewById(R.id.txtWordMeaning);
        }
    }
}
