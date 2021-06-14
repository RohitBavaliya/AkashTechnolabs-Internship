package com.example.customgridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GridData extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_data);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("image",R.drawable.bmw));
        textView.setText(intent.getStringExtra("name"));
    }
}