package com.example.customgridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdpter extends BaseAdapter {
    int image[];
    String name[];
    Context context;
    LayoutInflater layoutInflater;

    public MyAdpter(int[] image, String[] name, Context context) {
        this.image = image;
        this.name = name;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return name.length;
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
        convertView = layoutInflater.inflate(R.layout.row_grid,null);
        ImageView imageView = convertView.findViewById(R.id.myImageView);
        TextView textView = convertView.findViewById(R.id.ImageText);

        textView.setText(name[position]);
        imageView.setImageResource(image[position]);
        return convertView;
    }
}
