package com.example.nolifesim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LevelSelector extends AppCompatActivity implements View.OnClickListener{
    private static boolean first = false;
    private static boolean second = false;
    private static boolean third = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selector);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button level1 = findViewById(R.id.level1);
        Button level2 = findViewById(R.id.level2);
        Button level3 = findViewById(R.id.level3);
        Button level4 = findViewById(R.id.level4);
        Button level5 = findViewById(R.id.level5);

        level1.setOnClickListener(LevelSelector.this);
        level2.setOnClickListener(LevelSelector.this);
        level3.setOnClickListener(LevelSelector.this);
        level4.setOnClickListener(LevelSelector.this);
        level5.setOnClickListener(LevelSelector.this);

    }
    public boolean getFirst(){
        return first;
    }
    public boolean getSecond(){
        return second;
    }
    public boolean getThird(){
        return third;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.level1:
                Toast.makeText(LevelSelector.this, "Beginning", Toast.LENGTH_SHORT).show();
                first = true;
                Intent firstlevel = new Intent(this, GameActivity.class);
                startActivity(firstlevel);
                break;
            case R.id.level2:
                if(first){
                    Toast.makeText(LevelSelector.this, "New People", Toast.LENGTH_SHORT).show();
                    second = true;
                    break;
                }
                else {
                    Toast.makeText(LevelSelector.this, "Level 1 not yet completed", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.level3:
                if(first){
                    Toast.makeText(LevelSelector.this, "Family", Toast.LENGTH_SHORT).show();
                    third = true;
                    break;
                }
                else {
                    Toast.makeText(LevelSelector.this, "Level 1 not yet completed", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.level4:
                if(second){
                    Toast.makeText(LevelSelector.this, "Friendships", Toast.LENGTH_SHORT).show();
                    break;
                }
                else {
                    Toast.makeText(LevelSelector.this, "Level 2 not yet completed", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.level5:
                if(third){
                    Toast.makeText(LevelSelector.this, "Vacation", Toast.LENGTH_SHORT).show();
                    break;
                }
                else {
                    Toast.makeText(LevelSelector.this, "Level 3 not yet completed", Toast.LENGTH_SHORT).show();
                    break;
                }
        }
    }
}