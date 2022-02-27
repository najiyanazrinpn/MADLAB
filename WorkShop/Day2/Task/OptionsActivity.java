package com.example.workshop.task1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class OptionsActivity extends AppCompatActivity {
    Button mp,vp,ab,tst;
    private Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        mp=(Button) findViewById(R.id.music);
        vp=(Button) findViewById(R.id.video);
        ab=(Button) findViewById(R.id.alert);
        tst=(Button) findViewById(R.id.toast);
        mp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer mpl=MediaPlayer.create(OptionsActivity.this, R.raw.kaisehua);
                mpl.start();
            }
        });
        vp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoView videoView=findViewById(R.id.vw);
                MediaController mediaController=new MediaController(OptionsActivity.this);
                mediaController.setAnchorView(videoView);
                Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();
            }
        });

        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alert=new AlertDialog.Builder(context);
                alert.setTitle("Alert Box");
                alert.setMessage("Do you want to close?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        OptionsActivity.this.finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog obj=alert.create();
                obj.show();
            }
        });

        tst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(OptionsActivity.this, "You have created toast button", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
