package com.example.arya.jakarta.Activity;


import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.arya.jakarta.MapsActivity;
import com.example.arya.jakarta.R;
import com.example.arya.jakarta.berita;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.monas, R.drawable.taman_mini, R.drawable.kota, R.drawable.ragunan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = findViewById(R.id.imageslider);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);

        }
    };

    public void tentang(View view) {
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.activity_about);
        dialog.setTitle("ABOUT");

        Button ok = (Button) dialog.findViewById(R.id.btnoke);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }

        });
        dialog.show();
    }

    public void csri(View view) {
        LinearLayout search = (LinearLayout) findViewById(R.id.cari);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), cari.class));
            }
        });
    }

    public void wisata(View view) {
        LinearLayout search = (LinearLayout) findViewById(R.id.wisata);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), wisata.class));
            }
        });
    }

    public void berita(View view) {
        LinearLayout news = (LinearLayout) findViewById(R.id.berita);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), berita.class));
            }
        });
    }

    public void lokasi(View view) {
        LinearLayout news = (LinearLayout) findViewById(R.id.kuliner);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
            }
        });
    }
}




