package com.example.squareofnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number;
    TextView result;
    Button button;
    int enteredNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        result = findViewById(R.id.sqr_result);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enteredNumber = Integer.parseInt(number.getText().toString());
                if (enteredNumber<10){
                    result.setText(Integer.toString(enteredNumber*enteredNumber));
                }else {
                    result.setText("Entered number is greater than 10");
                }

            }
        });


    }
}