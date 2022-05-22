package com.example.english_qaida_and_quiz_app_mc_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abc_qaida(View view) {
        Intent i = new Intent(this, abc_page.class);
        startActivity(i);
    }

    public void quiz_app(View view) {
        Intent i = new Intent(this, start_quiz.class);
        startActivity(i);
    }
}