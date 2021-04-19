package com.asst.assignment5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Q4ImgAdapter extends RecyclerView.Adapter<Q4ImgAdapter.ViewHolder> {
    ArrayList<Q4Model> list;
    Context context;

    public Q4ImgAdapter(ArrayList<Q4Model> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public Q4ImgAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.q4displayimages, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Q4ImgAdapter.ViewHolder holder, int position) {
        Q4Model model = list.get(position);
        holder.fImg.setImageResource(model.getImage());
        holder.fName.setText(model.getfName());
    }

    @Override
    public int getItemCount() {
        return list.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView fImg;
        TextView fName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fImg = itemView.findViewById(R.id.q4fImg);
            fName = itemView.findViewById(R.id.q4fName);
        }
    }
}
