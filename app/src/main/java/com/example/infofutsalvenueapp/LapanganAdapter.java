package com.example.infofutsalvenueapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class LapanganAdapter extends RecyclerView.Adapter<LapanganAdapter.CardViewViewHolder> {
    private ArrayList<LapanganModel> listHero;
    private Context context;

    public LapanganAdapter(ArrayList<LapanganModel> list, Context context) {
        this.listHero = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rv_lapangan, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        LapanganModel lapanganModel = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(lapanganModel.getGambar())
                .into(holder.imgPhoto);
        holder.tvName.setText(lapanganModel.getNama());
        holder.tvPrice.setText(lapanganModel.getHarga());
        holder.tvLocation.setText(lapanganModel.getLokasi());

        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " +
                        listHero.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share " +
                        listHero.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailLapanganActivity.class);
                intent.putExtra("nama",  lapanganModel.getNama());
                intent.putExtra("harga",  lapanganModel.getHarga());
                intent.putExtra("gambar",  lapanganModel.getGambar());
                intent.putExtra("lokasi",  lapanganModel.getLokasi());
                context.startActivity(intent);
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listHero.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPhoto;
        private TextView tvName, tvPrice, tvLocation;
        private Button btnFavorite, btnShare;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            tvLocation = itemView.findViewById(R.id.tvLocation);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
