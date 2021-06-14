package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DataActivity extends AppCompatActivity {
    ListView myListView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    String userName, password, email, mobileNo, hobbies, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        myListView = findViewById(R.id.myListView);

        arrayList = new ArrayList<>();
        Intent intent = getIntent();
        userName = intent.getStringExtra("UserName");
        password = intent.getStringExtra("Password");
        email = intent.getStringExtra("Email");
        mobileNo = intent.getStringExtra("MobileNo");
        hobbies = intent.getStringExtra("Hobbies");
        gender = intent.getStringExtra("Gender");

        arrayList.add("Username: "+userName);
        arrayList.add("Password: "+password);
        arrayList.add("Email: "+email);
        arrayList.add("MobileNo: "+mobileNo);
        arrayList.add("Gender: "+gender);
        arrayList.add("Hobbies: "+hobbies);


        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        myListView.setAdapter(arrayAdapter);



    }
}