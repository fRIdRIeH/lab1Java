package com.example.lab1java1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText sentence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sentence = findViewById(R.id.editTextSentence);
    }

    public void addPlus(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "+";
        sentence.setText(newSentence);
    }

    public void addMinus(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "-";
        sentence.setText(newSentence);
    }

    public void addMulti(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "*";
        sentence.setText(newSentence);
    }

    public void addDivision(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "/";
        sentence.setText(newSentence);
    }

    public void addSeven(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "7";
        sentence.setText(newSentence);
    }

    public void addEight(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "8";
        sentence.setText(newSentence);
    }

    public void addNine(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "9";
        sentence.setText(newSentence);
    }

    public void addOpen(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "(";
        sentence.setText(newSentence);
    }

    public void addClose(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + ")";
        sentence.setText(newSentence);
    }

    public void addFour(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "4";
        sentence.setText(newSentence);
    }

    public void addFive(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "5";
        sentence.setText(newSentence);
    }

    public void addSix(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "6";
        sentence.setText(newSentence);
    }

    public void addOne(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "1";
        sentence.setText(newSentence);
    }

    public void addTwo(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "2";
        sentence.setText(newSentence);
    }

    public void addThree(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "3";
        sentence.setText(newSentence);
    }

    public void addZero(View view) {
        String newSentence = sentence.getText().toString();
        newSentence = newSentence + "0";
        sentence.setText(newSentence);
    }

    public void calculation(View view) {
    }

    public void sentenceClear(View view) {
        sentence.setText("");
    }

}