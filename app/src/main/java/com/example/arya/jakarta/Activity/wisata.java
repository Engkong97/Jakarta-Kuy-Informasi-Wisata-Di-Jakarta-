package com.example.arya.jakarta.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.arya.jakarta.R;
import com.example.arya.jakarta.tampiljakbar;
import com.example.arya.jakarta.tampiljakpus;
import com.example.arya.jakarta.tampiljaksel;
import com.example.arya.jakarta.tampiljaktim;
import com.example.arya.jakarta.tampiljakut;

public class wisata extends AppCompatActivity {
    private ImageView jaksel,jakbar,jakut,jaktim,jakpus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        jaksel=(ImageView) findViewById(R.id.jaksel);
        jaksel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(getApplicationContext(), tampiljaksel.class));

            }
        });

        jakpus=(ImageView) findViewById(R.id.jakpus);
        jakpus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(getApplicationContext(), tampiljakpus.class));

            }
        });

        jaktim=(ImageView) findViewById(R.id.jaktim);
        jaktim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(getApplicationContext(), tampiljaktim.class));

            }
        });

        jakbar=(ImageView) findViewById(R.id.jakbar);
        jakbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(getApplicationContext(), tampiljakbar.class));

            }
        });

        jakut=(ImageView) findViewById(R.id.jakut);
        jakut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(getApplicationContext(), tampiljakut.class));

            }
        });






    }
}
