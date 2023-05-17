package com.example.simplejavacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    TextView result,operator;
    EditText Number1, Number2;
    Button plus,minus,multiply,divide,equality;
    Float sum,dif,product,quotient;
    char Operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        operator=findViewById(R.id.operator);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.cross);
        divide=findViewById(R.id.over);
        equality=findViewById(R.id.equal);
        result=findViewById(R.id.result);
        Number1=findViewById(R.id.num1);
        Number2 =findViewById(R.id.num2);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                operator.setText("+");
                Operator='+';
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator.setText("-");
                Operator='-';
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator.setText("*");
                //operator.getText().toString();
                Operator='*';
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator.setText("/");
                Operator='/';
            }
        });
        equality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1String=Number1.getText().toString();
                String num2String=Number2.getText().toString();
                // String operator=operator.get
                Float num1
                        =Float.parseFloat(num1String);
                Float num2=Float.parseFloat(num2String);
                switch (Operator) {
                    case '+':
                        sum= num1 + num2;
                        result.setText(String.valueOf(sum));
                        break;
                    case '-':
                        dif= num1 - num2;
                        result.setText(String.valueOf(dif));
                        break;
                    case '*':
                        product= num1 * num2;
                        result.setText(String.valueOf(product));
                        break;
                    case '/':
                        quotient=num1 / num2;
                        result.setText(String.valueOf(quotient));
                        break;
                    default:
                        result.setText("error");

                }

            }
        });


    }
}