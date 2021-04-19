package com.asst.assignment5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Q2BaseAdapter extends BaseAdapter {
    Context context;
    int logos[];
    LayoutInflater inflter;

    public Q2BaseAdapter(Context applicationContext, int[] logos) {
        this.context = applicationContext;
        this.logos = logos;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return logos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflter.inflate(R.layout.gridview, null);
        ImageView icon = (ImageView) convertView.findViewById(R.id.icon);
        icon.setImageResource(logos[position]);
        return convertView;
    }
}
