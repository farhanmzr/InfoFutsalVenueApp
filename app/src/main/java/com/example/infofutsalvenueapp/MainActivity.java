package com.example.infofutsalvenueapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tvProfile;
    private RecyclerView rv_lapangan;
    private ArrayList<LapanganModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvProfile = findViewById(R.id.tvProfile);
        rv_lapangan = findViewById(R.id.rv_lapangan);
        rv_lapangan.setHasFixedSize(true);

        list.addAll(LapanganData.getListData());
        showProfile();
        showRv();

    }

    private void showProfile() {
        tvProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toProfile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(toProfile);
            }
        });
    }

    private void showRv(){
        rv_lapangan.setLayoutManager(new LinearLayoutManager(this));
        LapanganAdapter lapanganAdapter = new LapanganAdapter(list, this);
        rv_lapangan.setAdapter(lapanganAdapter);
    }
}