package com.example.chamara.kancollesoundboard;


import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Poi extends AppCompatActivity {

    private ImageButton POI2,POI8;

    private SoundPool POISOUND2 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
    private SoundPool POISOUND8 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

    private int poipoi2, poipoi8;
    private Button adremove;
    private VideoView vods;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vods);
        Toast.makeText(this, "POI! Find the Ad-remove button. Have fun!", Toast.LENGTH_LONG).show();

        final AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);
        final String poipoipoi = "android.resource://" + getPackageName() + "/" + R.raw.poipoipoi;
        back = (Button) findViewById(R.id.btnback);
        POI2 = (ImageButton) findViewById(R.id.poi1);
        POI8 = (ImageButton) findViewById(R.id.poi2);
        adremove = (Button)findViewById(R.id.Adremove);
        poipoi2 = POISOUND2.load(this, R.raw.poisound2, 1);
        poipoi8 = POISOUND8.load(this, R.raw.poisound8, 1);

        vods = (VideoView) findViewById(R.id.vod);
        vods.setVisibility(View.VISIBLE);
        vods.setVideoURI(Uri.parse(poipoipoi));

        vods.start();

        POI2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    POI2.setImageResource(R.mipmap.poi2b);
                    POISOUND2.play(poipoi2, 1, 1, 1, 0, 1);
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    POI2.setImageResource(R.mipmap.poi2a);
                }
                return true;
            }
        });

        POI8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    POI8.setImageResource(R.mipmap.poi8b);
                    POISOUND8.play(poipoi8, 1, 1, 1, 0, 1);
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    POI8.setImageResource(R.mipmap.poi8a);
                }
                return true;
            }
        });

        adremove.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdView.setVisibility(View.INVISIBLE);
                Toast.makeText(Poi.this, "You found it! Ad have been removed!", Toast.LENGTH_LONG).show();
            }
        });
        vods.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (vods.isPlaying()) {
                        vods.pause();
                    } else {
                        vods.start();
                    }
                }
                return true;
            }
        });
        vods.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                vods.start();
            }
        });

        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
