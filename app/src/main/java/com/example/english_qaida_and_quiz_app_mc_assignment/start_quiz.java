package com.example.english_qaida_and_quiz_app_mc_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start_quiz extends AppCompatActivity {

    Button startbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
        startbtn = findViewById(R.id.quiz);
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(start_quiz.this,  q1.class);
                startActivity(i);
            }
        });
    }
}