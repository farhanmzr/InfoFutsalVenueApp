package com.example.infofutsalvenueapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailLapanganActivity extends AppCompatActivity {

    private ImageView img_profile_mitra;
    private TextView tvNama;
    private TextView tvPrice;
    private TextView tvLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_lapangan);

        img_profile_mitra = findViewById(R.id.img_profile_mitra);
        tvNama = findViewById(R.id.tvNama);
        tvPrice = findViewById(R.id.tvPrice);
        tvLocation = findViewById(R.id.tvLocation);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String harga = intent.getStringExtra("harga");
        String gambar = intent.getStringExtra("gambar");
        String lokasi = intent.getStringExtra("lokasi");
        Glide.with(getApplicationContext())
                .load(gambar)
                .into(img_profile_mitra);
        tvNama.setText(nama);
        tvPrice.setText(harga);
        tvLocation.setText(lokasi);
    }
}