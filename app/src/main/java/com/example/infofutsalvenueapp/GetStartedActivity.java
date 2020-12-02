package com.example.infofutsalvenueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class GetStartedActivity extends AppCompatActivity {

    private MaterialButton btn_getstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        //inisialisasi button yg telah dibuat di xml
        btn_getstarted = findViewById(R.id.btn_getstarted);
        //method ketika button di klik
        btn_getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(GetStartedActivity.this, MainActivity.class);
                startActivity(main);
                finish();
            }
        });
    }
}