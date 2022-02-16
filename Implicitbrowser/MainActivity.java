package com.naj.exercise14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.net.Uri;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
//                Set implicit uri intent
                Intent myintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in"));
                startActivity(myintent);
            }
        });
    }
}
