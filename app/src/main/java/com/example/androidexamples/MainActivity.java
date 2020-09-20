package com.example.androidexamples;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;


//implements CompoundButton.OnCheckedChangeListener
public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_grid);
        setContentView(R.layout.activity_main_linear);
        //setContentView(R.layout.activity_main_relative);



        Button btn = findViewById(R.id.button1);
        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Toast.makeText(MainActivity.this,getResources().getString(R.string.toast_message),Toast.LENGTH_LONG).show();
                    }
                }
        );

        CheckBox cb = findViewById(R.id.checkBtn);
        cb.setChecked(true);

        Switch mySwitch =  findViewById(R.id.switchBtn);
        mySwitch.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        View v = findViewById(R.id.root_view);

        String messege = null;
        if(b){
            messege = getResources().getString(R.string.switchoff);
        }
        else
            messege = getResources().getString(R.string.snackMessage);

        Snackbar snack = Snackbar.make(v,messege,Snackbar.LENGTH_SHORT);
        snack.setAction(getResources().getString(R.string.undo), click -> compoundButton.setChecked(!b));
        snack.show();
    }

}