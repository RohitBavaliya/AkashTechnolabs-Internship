package com.example.sharedpreferencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView outputName, outputEmail, outputContact;
    Button logout;

    public static final String main_key = "myPref";
    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String password_key = "passwordKey";
    public static final String contact_key = "contactKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        outputName = findViewById(R.id.outputName);
        outputEmail = findViewById(R.id.outputEmail);
        outputContact = findViewById(R.id.outputContact);

        logout = findViewById(R.id.logout);

        Intent intent = getIntent();
        String login_name = intent.getStringExtra("outputName");
        String login_email = intent.getStringExtra("outputEmail");
        String login_contact = intent.getStringExtra("outputContact");

        outputName.setText(login_name);
        outputEmail.setText(login_email);
        outputContact.setText(login_contact);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();

                editor.clear();
                editor.commit();
                finish();
                moveTaskToBack(true);
            }
        });

    }
}