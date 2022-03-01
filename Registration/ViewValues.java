package com.practice.intentformvaluedisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewValues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_values);

        Bundle extras = getIntent().getExtras();

        String values = extras.getString("values");

        TextView details = (TextView) findViewById(R.id.details);

        details.setText(details.getText()+""+values);

    }
}
