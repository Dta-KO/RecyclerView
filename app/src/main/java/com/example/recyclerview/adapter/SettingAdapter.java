package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.R;
import com.example.recyclerview.data.Setting;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SettingAdapter extends RecyclerView.Adapter<SettingAdapter.MyViewHolder> {
    Context context;
    ArrayList<Setting> settings = new ArrayList<>();
    private OnItemClickListener listener;

    public SettingAdapter(Context context, ArrayList<Setting> settings, OnItemClickListener listener) {
        this.context = context;
        this.settings = settings;
        this.listener = listener;
    }

    @NonNull
    @Override
    public SettingAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_setting, null);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SettingAdapter.MyViewHolder holder, int position) {
        final Setting setting = settings.get(position);
       // Picasso.with(context).load(settings.get(position).getImage()).resize(150, 100).centerInside().into(holder.img_image);
        holder.img_image.setImageResource(settings.get(position).getImage());
        holder.tv_title.setText(settings.get(position).getTitle());
        holder.tv_meaning.setText(settings.get(position).getMeaning());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(setting);
            }
        });
    }

    @Override
    public int getItemCount() {
        return settings.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView img_image;
        private TextView tv_title;
        private TextView tv_meaning;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_image = itemView.findViewById(R.id.img_image);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_meaning = itemView.findViewById(R.id.tv_meaning);
        }
    }
    public interface OnItemClickListener {
        void onItemClick(Setting setting);
    }
}
