package com.example.greatestnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    Button button;
    TextView equality,greatest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        button = findViewById(R.id.button);
        equality = findViewById(R.id.equales);
        greatest = findViewById(R.id.greatest);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(number1.getText().toString())>Integer.parseInt(number2.getText().toString())){
                    greatest.setText(number1.getText().toString());
                }
                else {
                    greatest.setText(number2.getText().toString());
                }
                if(Integer.parseInt(number1.getText().toString())==Integer.parseInt(number2.getText().toString())){
                    equality.setText("Yes Both are equals..");
                }
                else {
                    equality.setText("Both are different");
                }
            }
        });



    }
}