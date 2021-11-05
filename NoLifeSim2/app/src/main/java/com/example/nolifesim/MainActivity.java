package com.example.nolifesim;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.RuleBasedCollator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button buttonLevel = findViewById(R.id.buttonLevel);
        Button buttonInventory = findViewById(R.id.buttonInventory);
        Button buttonRoll = findViewById(R.id.buttonRoll);

        buttonLevel.setOnClickListener(MainActivity.this);
        buttonInventory.setOnClickListener(MainActivity.this);
        buttonRoll.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonLevel:
                Toast.makeText(MainActivity.this, "Button Level selected", Toast.LENGTH_SHORT).show();
                Intent levels = new Intent(this, LevelSelector.class);
                startActivity(levels);
                break;
            case R.id.buttonInventory:
                Toast.makeText(MainActivity.this, "Button Inventory", Toast.LENGTH_SHORT).show();
                Intent Inventory = new Intent(this, Inventory.class);
                startActivity(Inventory);
                break;
            case R.id.buttonRoll:
                Toast.makeText(MainActivity.this, "Button Rolls", Toast.LENGTH_SHORT).show();
                Intent Roll = new Intent(this, Roll.class);
                startActivity(Roll);
                break;
        }
    }

}