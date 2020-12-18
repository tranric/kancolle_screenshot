package com.example.chamara.kancollesoundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class KancolleSB extends AppCompatActivity {

    private Button fubuki, kisaragi, akebono, ayanami, isonami, mikazuki, mutsuki, shikinami;
    private Button ushio, kagerou, fuso;
    private Button bonus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kancolle_sb);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        Button favs = (Button) findViewById(R.id.btnfav);
        fubuki = (Button)findViewById(R.id.btnfubuki);
        kisaragi = (Button)findViewById(R.id.btnkisaragi);
        akebono = (Button)findViewById(R.id.btnakebono);
        ayanami = (Button)findViewById(R.id.btnayanami);
        isonami = (Button)findViewById(R.id.btnisonami);
        mikazuki = (Button)findViewById(R.id.btnmikazuki);
        mutsuki = (Button)findViewById(R.id.btnmutsuki);
        shikinami = (Button)findViewById(R.id.btnshikinami);
        ushio = (Button)findViewById(R.id.btnushio);
        kagerou = (Button)findViewById(R.id.btnkagerou);
        fuso = (Button)findViewById(R.id.btnfuso);
        bonus = (Button)findViewById(R.id.btnbonus);
        favs.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), favorites.class);
                startActivityForResult(myIntent, 0);


            }

        });
        fubuki.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Fubuki");
                startActivityForResult(myIntent, 0);


            }

        });
        kisaragi.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    Intent myIntent = new Intent(v.getContext(), quotes.class);
                    myIntent.putExtra("outputtext", "Kisaragi");
                    startActivityForResult(myIntent, 0);


                }

        });

        akebono.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Akebono");
                startActivityForResult(myIntent, 0);


            }

        });

        ayanami.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Ayanami");
                startActivityForResult(myIntent, 0);


            }

        });

        isonami.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Isonami");
                startActivityForResult(myIntent, 0);


            }

        });

        mikazuki.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Mikazuki");
                startActivityForResult(myIntent, 0);


            }

        });

        mutsuki.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Mutsuki");
                startActivityForResult(myIntent, 0);


            }

        });


        shikinami.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Shikinami");
                startActivityForResult(myIntent, 0);


            }

        });

        ushio.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Ushio");
                startActivityForResult(myIntent, 0);


            }

        });

        kagerou.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Kagerou");
                startActivityForResult(myIntent, 0);


            }

        });

        fuso.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), quotes.class);
                myIntent.putExtra("outputtext", "Fuso");
                startActivityForResult(myIntent, 0);


            }

        });
        bonus.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), Poi.class);
                startActivityForResult(myIntent, 0);


            }

        });


    }
}
