package com.example.messagedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    EditText etMobileNo, etMessage;
    Button messageButton;
    String phoneNo;
    String sentMessage;
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMobileNo = findViewById(R.id.mobileNo);
        etMessage = findViewById(R.id.userMessage);

        messageButton = findViewById(R.id.sendMessage);

       messageButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               phoneNo = etMobileNo.getText().toString();
               sentMessage = etMessage.getText().toString();
               
               SmsManager sms = SmsManager.getDefault();
               sms.sendTextMessage(phoneNo,null,sentMessage,null,null);
               Toast.makeText(MainActivity.this, "Message sent Successfully..", Toast.LENGTH_SHORT).show();
           }
       });
    }

   
   
}