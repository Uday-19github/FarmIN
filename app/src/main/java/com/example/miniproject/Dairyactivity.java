package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dairyactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairyactivity);

        Button button31=findViewById(R.id.button32);
        Button button32=findViewById(R.id.button33);
        Button button33=findViewById(R.id.button34);
        Button button34=findViewById(R.id.button35);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dairyactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button32.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dairyactivity.this,mycart.class);
                startActivity(intent);
            }
        }));
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dairyactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Dairyactivity.this,mycart.class);
                startActivity(intent);
            }
        });

    }
}