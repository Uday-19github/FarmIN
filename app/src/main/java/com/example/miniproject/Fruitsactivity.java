package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fruitsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruitsactivity);

        Button button24=findViewById(R.id.button25);
        Button button25=findViewById(R.id.button26);
        Button button26=findViewById(R.id.button27);
        Button button30=findViewById(R.id.button31);
        Button button29=findViewById(R.id.button30);
        Button button28=findViewById(R.id.button29);
        Button button27=findViewById(R.id.button28);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruitsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruitsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruitsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruitsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruitsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruitsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruitsactivity.this,mycart.class);
                startActivity(intent);
            }
        });

    }
}