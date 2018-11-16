package com.example.arya.jakarta.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.arya.jakarta.R;
import com.example.arya.jakarta.detailwisata;
import com.example.arya.jakarta.model.WisataItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.MyViewHolder>{

    Context context;
    List<WisataItem>wisata;
    public WisataAdapter (Context context,List<WisataItem> data){
        this.context=context;
        this.wisata=data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.wisataitem, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, final int position ) {
        holder.nama.setText(wisata.get(position).getNama());
        final String urlGambar = "http://milanisti12.000webhostapp.com/index.php/images/" + wisata.get(position).getGambar();
        Picasso.with(context).load(urlGambar).into(holder.foto);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent varIntent = new Intent(context, detailwisata.class);
               varIntent.putExtra("NAMA", wisata.get(position).getNama());
               varIntent.putExtra("JAM", wisata.get(position).getJam());
               varIntent.putExtra("DESC",wisata.get(position).getDeskripsi());
               varIntent.putExtra("FOTO", urlGambar);
               varIntent.putExtra("LAT", wisata.get(position).getLatitude());
               varIntent.putExtra("LONG", wisata.get(position).getLongitude());

               context.startActivity(varIntent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return wisata.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        CircleImageView foto;
        TextView nama;

        public MyViewHolder(View itemView) {
            super(itemView);
            foto = (CircleImageView) itemView.findViewById((R.id.logo));
            nama = (TextView) itemView.findViewById(R.id.namawisata);
        }
    }

}
