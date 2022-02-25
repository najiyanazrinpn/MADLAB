package com.WorkShop.workshopday1app1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, alertbtn;
    EditText edt;
    private Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//R=>Resource
        //drawable consists of images
//        b1=(Button) findViewById(R.id.toast_btn);

        alertbtn = (Button) findViewById(R.id.alertbtn);
//        edt=(EditText) findViewById(R.id.edt);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = edt.getText().toString();
//                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//            }
//        });
        alertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(context);
                alert.setTitle("Alert Box");
                alert.setMessage("Do you want to close").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog obj = alert.create();
                obj.show();
            }
        });

    }
}
