package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pulsesactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsesactivity);

        Button button16=findViewById(R.id.button17);
        Button button17=findViewById(R.id.button18);
        Button button18=findViewById(R.id.button19);
        Button button19=findViewById(R.id.button20);
        Button button20=findViewById(R.id.button21);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Pulsesactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Pulsesactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Pulsesactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Pulsesactivity.this,mycart.class);
                startActivity(intent);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Pulsesactivity.this,mycart.class);
                startActivity(intent);
            }
        });
    }
}