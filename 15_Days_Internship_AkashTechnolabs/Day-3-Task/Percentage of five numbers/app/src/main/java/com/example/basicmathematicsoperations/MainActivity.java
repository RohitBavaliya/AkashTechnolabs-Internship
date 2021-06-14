package com.example.basicmathematicsoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText num1,num2,num3,num4,num5;
    Button result;
    TextView percentage,grade;
    double sum,percentageStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        result = findViewById(R.id.result);
        percentage = findViewById(R.id.percentage);
        grade = findViewById(R.id.grade);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum = Integer.parseInt(num1.getText().toString()) +
                        Integer.parseInt(num2.getText().toString())+
                        Integer.parseInt(num3.getText().toString())+
                        Integer.parseInt(num4.getText().toString())+
                        Integer.parseInt(num5.getText().toString());

                percentageStudent = sum/5;
                percentage.setText(Double.toString(percentageStudent));
                if(percentageStudent>=80)
                {
                    grade.setText("A");
                }
                else if(percentageStudent<80 && percentageStudent>=70)
                {
                    grade.setText("B");
                }
                else if (percentageStudent<70 && percentageStudent>=60)
                {
                    grade.setText("C");
                }
                else
                    grade.setText("D");
            }
        });


    }

}