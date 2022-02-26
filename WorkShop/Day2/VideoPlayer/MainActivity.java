package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        //set media controller to enable play,pause,forward,etc options
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        //Location of media file
        Uri uri = Uri.parse("android.resource://" + getPackageName()+ "/"+ R.raw.video);
        //Starting video view by setting media controller and uri
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}
