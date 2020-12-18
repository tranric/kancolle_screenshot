package com.example.chamara.kancollesoundboard;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by leiroux on 11/5/2015.
 */
public class Splash extends AppCompatActivity {
    private ImageView leiroux;
    Context ctx= this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        DatabaseHandler DH = new DatabaseHandler(ctx);
        Cursor CR;
        CR = DH.getName(DH);
       // CR.moveToFirst();

        if (CR.moveToFirst() == false){
            DH.addName(DH, "tempnameset");
            CR = DH.getName(DH);
             CR.moveToFirst();
        }else{
            CR = DH.getName(DH);
            CR.moveToFirst();
            SharedPreferences sharedPrefs = getSharedPreferences("com.example.chamara.kancollesoundboard", MODE_PRIVATE);
            if (sharedPrefs.getBoolean("togglebutton", true)){
                if (CR.getString(0).equals("tempnameset")){
                    Toast.makeText(Splash.this, "Please set a name on the view clicks." , Toast.LENGTH_SHORT).show();

                }else{

                    Toast.makeText(Splash.this, "Welcome back " + CR.getString(0) , Toast.LENGTH_SHORT).show();
                }
            }
        }
        leiroux = (ImageView)findViewById(R.id.imageView);
        Animation fade = AnimationUtils.loadAnimation(this, R.anim.fader);
        leiroux.startAnimation(fade);

        Thread splasher = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2500);
                    Intent Kancolle = new Intent(getApplicationContext(), KancolleSB.class);
                    startActivity(Kancolle);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splasher.start();


    }

}
