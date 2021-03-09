package com.icin.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class final_score extends AppCompatActivity {

    private TextView result;
    private TextView txscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_final_score);

        String score = getIntent().getExtras().getString("score");
        result = findViewById(R.id.txscore);
        result.setText(score);
    }
}