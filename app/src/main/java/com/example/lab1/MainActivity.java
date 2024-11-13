package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    private String input = "";
    private String operator = "";
    private double firstValue = 0;
    private double memory = 0;
    private boolean key = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
    }

    public void clear(View view) {
        input = "";
        operator = "";
        firstValue = 0;
        key = true;
        display.setText("");
        display.setHint("");
    }

    public void seven(View view) {
        input = display.getText().toString();
        input = input + "7";
        display.setText(input);
    }

    public void eight(View view) {
        input = display.getText().toString();
        input = input + "8";
        display.setText(input);
    }

    public void nine(View view) {
        input = display.getText().toString();
        input = input + "9";
        display.setText(input);
    }

    public void four(View view) {
        input = display.getText().toString();
        input = input + "4";
        display.setText(input);
    }

    public void five(View view) {
        input = display.getText().toString();
        input = input + "5";
        display.setText(input);
    }

    public void six(View view) {
        input = display.getText().toString();
        input = input + "6";
        display.setText(input);
    }

    public void one(View view) {
        input = display.getText().toString();
        input = input + "1";
        display.setText(input);
    }

    public void two(View view) {
        input = display.getText().toString();
        input = input + "2";
        display.setText(input);
    }

    public void three(View view) {
        input = display.getText().toString();
        input = input + "3";
        display.setText(input);
    }

    public void zero(View view) {
        input = display.getText().toString();
        input = input + "0";
        display.setText(input);
    }

    public void dot(View view) {
        input = display.getText().toString();
        input = input + ".";
        display.setText(input);
    }

    public void division(View view) {
        operator = "/";
        if(key){
            firstValue = Double.parseDouble(display.getText().toString());
            display.setText("");
            display.setHint("/");
            key = false;
        }
    }

    public void multiplication(View view) {
        operator = "*";
        if(key){
            firstValue = Double.parseDouble(display.getText().toString());
            display.setText("");
            display.setHint("*");
            key = false;
        }
    }

    public void minus(View view) {
        operator = "-";
        if(key){
            firstValue = Double.parseDouble(display.getText().toString());
            display.setText("");
            display.setHint("-");
            key = false;
        }
    }

    public void plus(View view) {
        operator = "+";
        if(key){
            firstValue = Double.parseDouble(display.getText().toString());
            display.setText("");
            display.setHint("+");
            key = false;
        }
    }

    public void count(View view) {
        double buff = 0;

        switch (operator){
            case "+":
                buff = (firstValue + Double.parseDouble(display.getText().toString()));
                break;
            case "-":
                buff = (firstValue - Double.parseDouble(display.getText().toString()));
                break;
            case "*":
                buff = (firstValue * Double.parseDouble(display.getText().toString()));
                break;
            case "/":
                buff = (firstValue / Double.parseDouble(display.getText().toString()));
                break;
        }

        String ans = Double.toString(buff);
        display.setText(ans);
        input = "";
        operator = "";
        firstValue = 0;
        key = true;
        display.setHint("");
    }

    public void memorySave(View view) {
        memory = Double.parseDouble(display.getText().toString());
        display.setText("");
    }

    public void memoryClean(View view) {
        memory = 0;
    }

    public void memoryRead(View view) {
        display.setText(Double.toString(memory));
    }

    public void memoryPlus(View view) {
        firstValue = Double.parseDouble(display.getText().toString());
        double buff = firstValue + memory;
        String ans = Double.toString(buff);
        display.setText(ans);
        memory = buff;
    }

    public void memoryMinus(View view) {
        firstValue = Double.parseDouble(display.getText().toString());
        double buff = firstValue - memory;
        String ans = Double.toString(buff);
        display.setText(ans);
        memory = buff;
    }

    public void edit(View view) {
        input = display.getText().toString();
        if (input.length() > 0) {
            input = input.substring(0, input.length() - 1);
            display.setText(input);
        }
    }
}