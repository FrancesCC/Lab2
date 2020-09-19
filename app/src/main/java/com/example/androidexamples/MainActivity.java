package com.example.androidexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_grid);
        //setContentView(R.layout.activity_main_linear);
        setContentView(R.layout.activity_main_relative);


        CheckBox cb = (CheckBox) findViewById(R.id.checkBtn);
        cb.setChecked(true);


        Switch sw = findViewById(R.id.switchBtn);


    }
}