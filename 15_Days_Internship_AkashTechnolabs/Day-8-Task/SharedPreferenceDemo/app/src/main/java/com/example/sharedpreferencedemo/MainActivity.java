package com.example.sharedpreferencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText yourName, yourEmail, yourPassword, yourPhoneNo;
    Button signUp;
    Button login;

    public static final String main_key = "myPref";
    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String password_key = "passwordKey";
    public static final String contact_key = "contactKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yourName = findViewById(R.id.yourName);
        yourEmail = findViewById(R.id.yourEmailId);
        yourPassword = findViewById(R.id.yourPassword);
        yourPhoneNo = findViewById(R.id.yourPhoneNo);

        signUp = findViewById(R.id.Signup);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email, password, contact;
                name = yourName.getText().toString();
                email = yourEmail.getText().toString();
                password = yourPassword.getText().toString();
                contact = yourPhoneNo.getText().toString();

                SharedPreferences sharedPreferences = getSharedPreferences(main_key,MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(name_key,name);
                editor.putString(email_key,email);
                editor.putString(password_key,password);
                editor.putString(contact_key,contact);

                editor.commit(); // store data in SharedPreferences

                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });

    }
}