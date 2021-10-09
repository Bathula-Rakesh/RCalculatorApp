package com.example.rcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double no1, no2, total;
    char operator;
    boolean equalcheck = false;


    DecimalFormat dForm = new DecimalFormat("0.############");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = findViewById(R.id.button0);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);
        Button btndot = findViewById(R.id.buttonDot);


        Button btnClear = findViewById(R.id.buttonClear);
        Button btnpercentage = findViewById(R.id.percentage);
        Button btnDelete = findViewById(R.id.buttonDelete);
        Button btnDivide = findViewById(R.id.buttondiv);
        Button btnMultiply = findViewById(R.id.buttonMul);
        Button btnMinus = findViewById(R.id.buttonMinus);
        Button btnPlus = findViewById(R.id.buttonPlus);
        Button btnEquals = findViewById(R.id.buttonEqual);
        Button btnDot = findViewById(R.id.buttonDot);

        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.result_textview);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn0Text = btn0.getText().toString();
                editText.setText(editText.getText() + btn0Text);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn1Text = btn1.getText().toString();
                editText.setText(editText.getText() + btn1Text);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn2Text = btn2.getText().toString();
                editText.setText(editText.getText() + btn2Text);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn3Text = btn3.getText().toString();
                editText.setText(editText.getText() + btn3Text);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn4Text = btn4.getText().toString();
                editText.setText(editText.getText() + btn4Text);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn5Text = btn5.getText().toString();
                editText.setText(editText.getText() + btn5Text);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn6Text = btn6.getText().toString();
                editText.setText(editText.getText() + btn6Text);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn7Text = btn7.getText().toString();
                editText.setText(editText.getText() + btn7Text);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn8Text = btn8.getText().toString();
                editText.setText(editText.getText() + btn8Text);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btn9Text = btn9.getText().toString();
                editText.setText(editText.getText() + btn9Text);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                textView.setText("");
            }
        });

        btnpercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(editText.getText().toString());
                operator = btnpercentage.getText().charAt(0);
                editText.setText("");
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                s=s.substring(0,s.length()-1);
                editText.setText(s);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(editText.getText().toString());
                operator = btnDivide.getText().charAt(0);
                editText.setText("");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(editText.getText().toString());
                operator = btnMultiply.getText().charAt(0);
                editText.setText("");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(editText.getText().toString());
                operator = btnMinus.getText().charAt(0);
                editText.setText("");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Double.parseDouble(editText.getText().toString());
//                no2 = Double.parseDouble(editText.getText().toString());
                operator = btnPlus.getText().charAt(0);
                editText.setText("");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(equalcheck == true ){
                    editText.setText("");
                    equalcheck = false;
                }
                editText.setText(editText.getText()+".");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operator) {
                    case '+':
                        no2 = Double.parseDouble(editText.getText().toString());
                        total = no1 + no2;
                        break;
                    case '-':
                        no2 = Double.parseDouble(editText.getText().toString());
                        total = no1 - no2;
                        break;
                    case '*':
                        no2 = Double.parseDouble(editText.getText().toString());
                        total = no1 * no2;
                        break;
                    case '%':
                        total = (no1/100.0f);
                        break;
                    case '/':
                        no2 = Double.parseDouble(editText.getText().toString());
                        total = no1 / no2;
                        break;
                }
                textView.setText(dForm.format(total));
                no1 = 0;
                no2 = 0;
            }
        });
    }
}