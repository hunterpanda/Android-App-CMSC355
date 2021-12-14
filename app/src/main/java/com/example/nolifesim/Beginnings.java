package com.example.nolifesim;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Beginnings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginnings);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}