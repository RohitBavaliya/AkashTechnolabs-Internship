package com.example.customlistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListData extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String text = intent.getStringExtra("name");
        textView.setText(text);

        imageView.setImageResource(intent.getIntExtra("image",R.drawable.bmw));
    }
}