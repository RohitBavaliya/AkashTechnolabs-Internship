package com.example.sharedpreferencedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText loginEmailId, loginPassword;
    Button signin, signup;

    public static final String main_key = "myPref";
    public static final String name_key = "nameKey";
    public static final String email_key = "emailKey";
    public static final String password_key = "passwordKey";
    public static final String contact_key = "contactKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmailId = findViewById(R.id.yourEmailId);
        loginPassword = findViewById(R.id.yourPassword);

        signin = findViewById(R.id.signIn);
        signup = findViewById(R.id.signUp);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String signinEmail, signinPassword;
                signinEmail = loginEmailId.getText().toString();
                signinPassword = loginPassword.getText().toString();

                SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);
                String email = preferences.getString(email_key,"");
                String password = preferences.getString(password_key,"");
                String name = preferences.getString(name_key,"");
                String contact = preferences.getString(contact_key,"");

                if (signinEmail.equals(email) && signinPassword.equals(password))
                {
                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                    intent.putExtra("outputName",name);
                    intent.putExtra("outputEmail",email);
                    intent.putExtra("outputContact",contact);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this, "Envalid Login Details...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}