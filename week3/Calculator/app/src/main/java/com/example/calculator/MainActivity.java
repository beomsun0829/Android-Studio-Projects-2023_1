package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//2019038058 홍범순
public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private Button addButton;
    private Button diffButton;
    private Button multiButton;
    private Button divButton;
    private Button modButton;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        addButton = findViewById(R.id.addButton);
        diffButton = findViewById(R.id.diffButton);
        multiButton = findViewById(R.id.multiButton);
        divButton = findViewById(R.id.divButton);
        modButton = findViewById(R.id.modButton);
        resultView = findViewById(R.id.resultView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1String = editTextNumber1.getText().toString();
                String num2String = editTextNumber2.getText().toString();
                if (num1String.isEmpty() || num2String.isEmpty()) {
                    resultView.setText("Please enter both numbers.");
                    return;
                }
                double num1 = Double.parseDouble(num1String);
                double num2 = Double.parseDouble(num2String);
                double result = num1 + num2;
                resultView.setText(Double.toString(result));
            }
        });

        diffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1String = editTextNumber1.getText().toString();
                String num2String = editTextNumber2.getText().toString();
                if (num1String.isEmpty() || num2String.isEmpty()) {
                    resultView.setText("Please enter both numbers.");
                    return;
                }
                double num1 = Double.parseDouble(num1String);
                double num2 = Double.parseDouble(num2String);
                double result = num1 - num2;
                resultView.setText(Double.toString(result));
            }
        });

        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1String = editTextNumber1.getText().toString();
                String num2String = editTextNumber2.getText().toString();
                if (num1String.isEmpty() || num2String.isEmpty()) {
                    resultView.setText("Please enter both numbers.");
                    return;
                }
                double num1 = Double.parseDouble(num1String);
                double num2 = Double.parseDouble(num2String);
                double result = num1 * num2;
                resultView.setText(Double.toString(result));
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1String = editTextNumber1.getText().toString();
                String num2String = editTextNumber2.getText().toString();
                if (num1String.isEmpty() || num2String.isEmpty()) {
                    resultView.setText("Please enter both numbers.");
                    return;
                }
                double num1 = Double.parseDouble(num1String);
                double num2 = Double.parseDouble(num2String);
                if (num2 == 0) {
                    resultView.setText("Cannot divide by zero.");
                    return;
                }
                double result = num1 / num2;
                resultView.setText(Double.toString(result));
            }
        });

        modButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String num1String = editTextNumber1.getText().toString();
                String num2String = editTextNumber2.getText().toString();
                if (num1String.isEmpty() || num2String.isEmpty()) {
                    resultView.setText("Please enter both numbers.");
                    return;
                }

                double num1 = Double.parseDouble(num1String);
                double num2 = Double.parseDouble(num2String);
                if (num2 == 0) {
                    resultView.setText("Cannot divide by zero.");
                    return;
                }
                double result = num1 % num2;
                resultView.setText(Double.toString(result));

            }
        });
    }
}