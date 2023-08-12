package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vegetableactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetableactivity);

        Button button6=findViewById(R.id.button7);
        Button button7=findViewById(R.id.button8);
        Button button8=findViewById(R.id.button9);
        Button button21=findViewById(R.id.button22);
        Button button22=findViewById(R.id.button23);
        Button button23=findViewById(R.id.button24);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vegetableactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vegetableactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vegetableactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vegetableactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vegetableactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vegetableactivity.this,mycart.class);
                startActivity(intent);
            }
        });
    }
}