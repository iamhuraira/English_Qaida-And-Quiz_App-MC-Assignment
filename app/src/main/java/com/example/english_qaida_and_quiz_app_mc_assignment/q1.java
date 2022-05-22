package com.example.english_qaida_and_quiz_app_mc_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class q1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
    }

    public void nextquestion2(View view) {
        Intent i = new Intent(this, q2.class);
        startActivity(i);
    }
}