package com.example.recyclerviewdemo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;
import com.example.recyclerviewdemo.modals.modalClass;

import java.util.ArrayList;

public class wAdapter extends RecyclerView.Adapter<wAdapter.viewHolder> {

    ArrayList<modalClass> list;
    Context context;

    public wAdapter(ArrayList<modalClass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        modalClass modal = list.get(position);
        holder.imageView.setImageResource(modal.getImage());
        holder.textView1.setText(modal.getName());
        holder.textView2.setText(modal.getMsg());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1,textView2;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }
}
