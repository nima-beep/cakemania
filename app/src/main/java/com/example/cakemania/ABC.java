package com.example.cakemania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ABC extends AppCompatActivity {

    Button Recape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abc);

        Recape=findViewById(R.id.recapeid);
        Recape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ABC.this,login.class);
                startActivity(intent);
                finish();


            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(ABC.this,BackgroundService.class));
        finish();
    }
}
