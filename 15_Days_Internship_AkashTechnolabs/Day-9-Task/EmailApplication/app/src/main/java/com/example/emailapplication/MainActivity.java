package com.example.emailapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eTo, eSubject, eMessage;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTo = (EditText) findViewById(R.id.editTextEmail);
        eSubject = (EditText) findViewById(R.id.editTextSubject);
        eMessage = (EditText) findViewById(R.id.editTextMessage);

        btnSend = (Button) findViewById(R.id.send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = eTo.getText().toString();
                String subject = eSubject.getText().toString();
                String message = eMessage.getText().toString();

                // use implicit Intent
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);

                // Add below code to prompt email client only
                intent.setType("message/rfc822");

                // Intent.createChooser() method used to choose email client
                startActivity(Intent.createChooser(intent,"Send Email:"));
            }
        });



    }
}