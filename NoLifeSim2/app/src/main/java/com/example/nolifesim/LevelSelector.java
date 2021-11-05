package com.example.nolifesim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LevelSelector extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selector);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}