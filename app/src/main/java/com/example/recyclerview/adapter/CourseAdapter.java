package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.data.Course;
import com.example.recyclerview.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {
    Context context;
    ArrayList<Course> courses = new ArrayList<>();
    private OnItemClickListener listener;


    public CourseAdapter(Context context, ArrayList<Course> courseData, OnItemClickListener listener) {
        this.context = context;
        this.courses = courseData;
        this.listener = listener;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View v;
       v = LayoutInflater.from(context).inflate(R.layout.item_course, null);
       MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Course course = courses.get(position);
        Picasso.with(context).load(courses.get(position).getImage()).resize(150, 100).centerInside().into(holder.image);
        holder.txtTitle.setText(courses.get(position).getTitle());
        holder.txtTotalWord.setText(String.valueOf(courses.get(position).getNumberOfWords()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(course);
            }
        });
    }


    @Override
    public int getItemCount() {
        return courses.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView txtTitle;
        private TextView txtTotalWord;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.itemImage);
            txtTitle = itemView.findViewById(R.id.itemtxtTitle);
            txtTotalWord = itemView.findViewById(R.id.itemtxtTotalWord);
        }
    }
}
