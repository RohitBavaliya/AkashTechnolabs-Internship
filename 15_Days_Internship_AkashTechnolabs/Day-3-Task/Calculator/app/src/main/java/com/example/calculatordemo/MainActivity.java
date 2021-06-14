package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button eql, dot,clr, add, sub, mul, div, mod, exit;
    boolean addition, subtraction, divison, multiplication, clear, modulo, con;

    private TextView calculation;
    private TextView result;
    private String screen;
    
    private String cinfo = "Clear calculation!!!";
    private String info = "Invalid Input!!!";

    private double var1, var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero  =  findViewById(R.id.btn0);
        one   =  findViewById(R.id.btn1);
        two   =  findViewById(R.id.btn2);
        three =  findViewById(R.id.btn3);
        four  =  findViewById(R.id.btn4);
        five  =  findViewById(R.id.btn5);
        six   =  findViewById(R.id.btn6);
        seven =  findViewById(R.id.btn7);
        eight =  findViewById(R.id.btn8);
        nine  =  findViewById(R.id.btn9);

        dot   =  findViewById(R.id.btndot);
        eql   =  findViewById(R.id.btneql);
        clr   =  findViewById(R.id.btnclr);
        add   =  findViewById(R.id.btnadd);
        sub   =  findViewById(R.id.btnsub);
        mul   =  findViewById(R.id.btnmul);
        div   =  findViewById(R.id.btndiv);
        mod   =  findViewById(R.id.btnmod);
        exit  =  findViewById(R.id.btnoff);

        calculation = findViewById(R.id.calculationtable);
        result = findViewById(R.id.result);

        calculation.setText(null);
        clear = true;

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
                calculation.setText(null);
                addition = divison = multiplication = subtraction = modulo = false;
                clear = true;
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+"0");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+"1");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+"2");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+"3");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+"4");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+"5");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+"6");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+"7");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+"8");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clear == true) calculation.setText(calculation.getText()+"9");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_SHORT).show();
            }
        });
        dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (clear == true) calculation.setText(calculation.getText()+".");
                else Toast.makeText(getApplicationContext(), cinfo, Toast.LENGTH_LONG).show();
            }
        });

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {

                String num = calculation.getText().toString();

                if(!(num.equals("")) && con!=true)
                {
                    calculation.setText(calculation.getText().toString());
                    var1 = Double.parseDouble(calculation.getText().toString());
                    addition = true;
                    calculation.setText(null);
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                clear = true;
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {

                String num = calculation.getText().toString();

                if(!(num.equals("")) && con!=true)
                {
                    var1 = Double.parseDouble(calculation.getText()+"");
                    subtraction = true;
                    calculation.setText(null);
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                clear = true;
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String num = calculation.getText().toString();
                if(!(num.equals("")) && con!=true)
                {
                    var1 = Double.parseDouble(calculation.getText()+"");
                    multiplication = true;
                    calculation.setText(null);
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                clear = true;
            }
        });
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String num = calculation.getText().toString();
                if(!(num.equals("")) && con!=true)
                {
                    var1 = Double.parseDouble(calculation.getText()+"");
                    divison = true;
                    calculation.setText(null);
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                clear = true;
            }
        });
        mod.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String num = calculation.getText().toString();
                if(!(num.equals("")) && con!=true)
                {
                    var1 = Double.parseDouble(calculation.getText()+"");
                    modulo = true;
                    calculation.setText(null);
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
                clear = true;
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = calculation.getText().toString();
                var2 = var1;
                if (!(str.equals("")) && con == false)
                {
                    var1 = Double.parseDouble(calculation.getText().toString());
                    if (addition == true)
                    {
                        var1 += var2;
                        addition = false;
                    }

                    if (subtraction == true)
                    {
                        var1 = var2 - var1;
                        subtraction = false;
                    }
                    if (multiplication == true)
                    {
                        var1 *= var2;
                        multiplication = false;
                    }

                    if (divison == true)
                    {
                        var1 = var2 / var1;
                        divison = false;
                    }
                    if(modulo == true)
                    {
                        var1  = var2 % var1;
                        modulo = false;
                    }
                    calculation.setText(null);
                    result.setText("Result: "+var1 + "");
                    clear = false;
                }
                else Toast.makeText(getApplicationContext(), info, Toast.LENGTH_LONG).show();
            }
        });

    }
}