package com.example.checknumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number;
    TextView result;
    Button click;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = findViewById(R.id.number);
        result = findViewById(R.id.result);
        click = findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.parseInt(number.getText().toString());
                if (num>0)
                    result.setText("Positive Number");
                else if (num==0)
                    result.setText("Zero");
                else
                    result.setText("Negative Number");
            }
        });

    }
}