package com.example.workshop.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pwd;
    Button b;
    String uname,pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText) findViewById(R.id.username);
        pwd=(EditText) findViewById(R.id.pswd);
        b=(Button) findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uname=user.getText().toString();
                pw=pwd.getText().toString();
                if((uname.equals("admin")) && (pw.equals("admin")))
                {
                    Intent intent=new Intent(MainActivity.this, OptionsActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Incorrect username/password", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}
