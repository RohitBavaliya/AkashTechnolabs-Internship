package com.example.customlistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvName;
    int[] image = {R.drawable.bmw,R.drawable.bugatti,R.drawable.faraari,R.drawable.jagor,R.drawable.mercedes};
    String[] name = {"BMW","BUGATTI","FARAARI","JAGOR","MERCEDES"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvName = findViewById(R.id.lvName);

        Myadpter myadpter = new Myadpter(image,name,MainActivity.this);
        lvName.setAdapter(myadpter);

        lvName.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),ListData.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });
    }
}