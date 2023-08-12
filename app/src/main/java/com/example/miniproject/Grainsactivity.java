package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grainsactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grainsactivity);

        Button button9=findViewById(R.id.button10);
        Button button10=findViewById(R.id.button11);
        Button button11=findViewById(R.id.button12);
        Button button12=findViewById(R.id.button13);
        Button button13=findViewById(R.id.button14);
        Button button14=findViewById(R.id.button15);
        Button button15=findViewById(R.id.button16);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Grainsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Grainsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Grainsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Grainsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Grainsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Grainsactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Grainsactivity.this,mycart.class);
                startActivity(intent);
            }
        });

    }
}