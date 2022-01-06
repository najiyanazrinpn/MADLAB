package com.example.naj_exercise8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plusbtn = (Button)findViewById(R.id.plusbtn);
        Button minusbtn = (Button)findViewById(R.id.minusbtn);
        TextView count = (TextView) findViewById(R.id.count);
        Button reset = (Button) findViewById(R.id.reset);

        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 c++;
                 count.setText(c +"");
            }
        });
        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c--;
                count.setText(c+"");
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=0;
                count.setText(0+"");
            }
        });
    }
}
