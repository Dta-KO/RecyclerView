package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.data.Topic;
import com.example.recyclerview.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CourseTopicAdapter extends RecyclerView.Adapter<CourseTopicAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Topic> topics;
    private OnItemClickListener listener;

    public CourseTopicAdapter(Context context, ArrayList<Topic> topics, OnItemClickListener listener) {
        this.context = context;
        this.topics = topics;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_english_catalog, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final Topic topic = topics.get(position);
        holder.txtCourseName.setText(topic.getCourseName());
        holder.txtTopicName.setText(topic.getName());
        holder.txtNumberOfWords.setText(topic.getNumberOfWords() + " word");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(topic);
            }
        });
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }

    public interface OnItemClickListener {
        void onItemClick(Topic topic);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView txtCourseName;
        private TextView txtTopicName;
        private TextView txtNumberOfWords;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCourseName = itemView.findViewById(R.id.txtTitleEnglishCatalog);
            txtTopicName = itemView.findViewById(R.id.txtContentEnglishCatalog);
            txtNumberOfWords = itemView.findViewById(R.id.txtTotalWordEnglishCatalog);
        }
    }
//    public interface OnItemClickListener {
//        void onItemClick(CourseTopic courseTopic);
//    }

}
