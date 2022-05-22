package com.example.english_qaida_and_quiz_app_mc_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class q2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

    }


    public void nextquestion3(View view) {
        Intent i = new Intent(this, q3.class);
        startActivity(i);
    }
}