package com.example.andriod.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    private Button button, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.three);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openThree();
            }
        });


        button = (Button) findViewById(R.id.five);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openFive();
            }
        });
    }
    public void openThree(){
        Intent intent = new Intent(this,three.class);
        startActivity(intent);
    }

    public void openFive(){
        Intent intent = new Intent(this,five.class);
        startActivity(intent);
    }




}
