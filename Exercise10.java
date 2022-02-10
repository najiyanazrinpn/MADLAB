package com.example.exercise10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void select(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.check1:
                if(checked)
                    Toast.makeText(MainActivity.this, "India Selected", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "India Removed", Toast.LENGTH_LONG).show();
                break;
            case R.id.check2:
                if(checked)
                    Toast.makeText(MainActivity.this, "South Korea Selected", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "South Korea Removed", Toast.LENGTH_LONG).show();
                break;
            case R.id.check3:
                if(checked)
                    Toast.makeText(MainActivity.this, "Switzerland Selected", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Switzerland Removed", Toast.LENGTH_LONG).show();
                break;

        }
    }

}
