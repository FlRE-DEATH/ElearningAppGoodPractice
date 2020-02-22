package com.example.elearningappgoodpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MathActivity extends AppCompatActivity {
    Button clk;
    VideoView videov;
    MediaController mediac;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

    clk = (Button) findViewById(R.id.play);
    videov = (VideoView) findViewById(R.id.videoView);
    mediac = new MediaController(this);




        VideoView videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }

    //todo make the video playable as in the youtube video: https://www.youtube.com/watch?v=SrPHLj_q_OQ
    //make this screen exit-able


    public void videoplay(){
    String videopath = "android.resource://com.example.elearningappgoodpractice"+R.raw.video;
    Uri uri = Uri.parse(videopath);
    videov.setVideoURI(uri);
    videov.setMediaController(mediac);
    mediac.setAnchorView(videov);
    //todo make video scrollable. now it restarts when you try to move the slider. also try to
        //make the video playable from the play button.a
        // right now, the play button gives an error upon being pressed:
        // can't play video right now (or something like that)
    videov.start();
//test

    }

}
