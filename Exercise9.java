package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "OnCreate called", Toast.LENGTH_LONG).show();
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "OnStart called", Toast.LENGTH_LONG).show();
    }
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "OnPause called", Toast.LENGTH_LONG).show();
    }
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "OnResume called", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "OnStop called", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "OnRestart called", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "OnDestroy called", Toast.LENGTH_LONG).show();
    }
}
