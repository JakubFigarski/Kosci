package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivityy extends AppCompatActivity {
    private TextView textViewResult;

    public void rollDice(View view) {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        String resultText = "Wyrzucona liczba: " + randomNumber;
        textViewResult.setText(resultText);
    }
}
