package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String courses[] = {"ANDROID","PHP","IOS","C","ANGULAR","WORDPRESS","C#","JAVA","PYTHON",
            "HTML","CSS","JAVASCRIPT","NODE","IONIC","DataScience","CloudComputing"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.myGridView);
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,courses);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,courses[position]+" is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}