package com.example.english_qaida_and_quiz_app_mc_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class abc_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc_page);
    }

    public void a_click(View view) {
        Intent i = new Intent(this, a.class);
        startActivity(i);
    }

    public void b_click(View view) {
        Intent i = new Intent(this, b.class);
        startActivity(i);
    }

    public void c_click(View view) {
        Intent i = new Intent(this, c.class);
        startActivity(i);
    }

    public void d_click(View view) {
        Intent i = new Intent(this, d.class);
        startActivity(i);
    }

    public void e_click(View view) {
        Intent i = new Intent(this, E.class);
        startActivity(i);
    }
}