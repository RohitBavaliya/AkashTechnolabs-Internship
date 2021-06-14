package com.example.customgridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gvName;
    int[] image = {R.drawable.bmw,R.drawable.bugatti,R.drawable.faraari,R.drawable.jagor,R.drawable.mercedes};
    String[] name = {"BMW","BUGATTI","FARAARI","JAGOR","MERCEDES"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvName = findViewById(R.id.gvName);

        MyAdpter myAdpter = new MyAdpter(image,name,MainActivity.this);
        gvName.setAdapter(myAdpter);

        gvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,GridData.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });
    }
}