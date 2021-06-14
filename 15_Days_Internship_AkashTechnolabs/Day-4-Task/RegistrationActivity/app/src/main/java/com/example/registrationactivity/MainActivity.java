package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName, password, email, mobileNo, hobbies;
    Button submit;
    RadioButton male,female;
    RadioButton genderradioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        email = findViewById(R.id.emailid);
        mobileNo = findViewById(R.id.mobileNumber);
        hobbies = findViewById(R.id.hobbies);

        submit = findViewById(R.id.submit);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                genderradioButton = findViewById(selectedId);

                if(selectedId==-1){
                    Log.d("selectedGender","Plase select any one gender");
                }
                else{
                    Log.d("selectedGender",genderradioButton.getText().toString());
                }

                Intent intent = new Intent(MainActivity.this,DataActivity.class);
                intent.putExtra("UserName",userName.getText().toString());
                intent.putExtra("Password",password.getText().toString());
                intent.putExtra("Email",email.getText().toString());
                intent.putExtra("MobileNo",mobileNo.getText().toString());
                intent.putExtra("Gender",genderradioButton.getText().toString());
                intent.putExtra("Hobbies",hobbies.getText().toString());
                startActivity(intent);
            }
        });
    }
}