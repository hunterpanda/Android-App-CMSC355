package com.example.nolifesim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SwitchCase extends AppCompatActivity{
    int points  = 10;
    int lives = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switchcase);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void makeDecisions(int points, int lives){

        int decisions = calculator(points);
        switch (decisions) {
            case 1:
                System.out.println("Your mom");
                break;
            case 2:
                System.out.println("your father");
                break;
            case 3:
                System.out.println("Your sister");
                break;
        }

    }
    public int calculator(int points){
        if(points <= 10){
            return 1;}
        else if (points <=20){
            return 2;
        }
        else if (points <= 30){
            return 3;
        }
        return 0;
    }
}


