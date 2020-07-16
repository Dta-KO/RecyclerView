package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.data.Word;
import com.example.recyclerview.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

public class TopicWordAdapter extends Adapter<TopicWordAdapter.TopicWordView> {
    private Context context;
    private ArrayList<Word> words;
    private TopicWordAdapter.OnItemClickListener listener;

    public TopicWordAdapter(
            Context context,
            ArrayList<Word> words,
            TopicWordAdapter.OnItemClickListener listener) {
        this.context = context;
        this.words = words;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TopicWordView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(context)
                .inflate(R.layout.item_topic_word_list, parent, false);
        return new TopicWordAdapter.TopicWordView(v);
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public void SetWordList(ArrayList<Word> words) {
        this.words = words;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull TopicWordView holder, int position) {
        final Word word = words.get(position);
        holder.wordValue.setText(word.getValue() + " (" + word.getCorrectAnswerTimes() + ")");
        holder.wordMeaning.setText(word.getMeaning());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(word);
            }
        });
    }

    public interface OnItemClickListener {
        void onItemClick(Word word);
    }

    public class TopicWordView extends RecyclerView.ViewHolder {

        private final TextView wordValue;
        private final TextView wordMeaning;

        public TopicWordView(@NonNull View itemView) {
            super(itemView);
            wordValue = itemView.findViewById(R.id.txtWordValue);
            wordMeaning = itemView.findViewById(R.id.txtWordMeaning);
        }
    }
}
