package com.example.arya.jakarta;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class detailwisata extends AppCompatActivity {

    ImageView gambar;
    TextView jamops, deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailwisata);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentmaps();
            }
        });

        gambar = (ImageView)findViewById(R.id.foto);
        jamops = (TextView) findViewById(R.id.jam);
        deskripsi= (TextView) findViewById(R.id.desc);
        showDetail();
    }

    private void showDetail() {
        String foto = getIntent().getStringExtra("FOTO");
        String nama = getIntent().getStringExtra("NAMA");
        String time = getIntent().getStringExtra("JAM");
        String desk = getIntent().getStringExtra("DESC");

        getSupportActionBar().setTitle(nama);
        Picasso.with(this).load(foto).into(gambar);
        jamops.setText(time);
        deskripsi.setText(desk);
    }

    private void intentmaps(){
        String lat = getIntent().getStringExtra("LAT");
        String lng = getIntent().getStringExtra("LONG");
        Uri IntentUri=Uri.parse("google.navigation:q="+lat+","+lng+"");
        Intent mapintent = new Intent(Intent.ACTION_VIEW,IntentUri);
        mapintent.setPackage("com.google.android.apps.maps");
        startActivity(mapintent);
    }
}
