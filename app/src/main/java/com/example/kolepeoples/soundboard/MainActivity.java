package com.example.kolepeoples.soundboard;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private Button[][] buttons = new Button[3][3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer baby = MediaPlayer.create(this,R.raw.babycry);
        final MediaPlayer doh = MediaPlayer.create(this,R.raw.doh);
        final MediaPlayer duck = MediaPlayer.create(this,R.raw.donaldduck);
        final MediaPlayer spongeBob = MediaPlayer.create(this,R.raw.ineedit);
        final MediaPlayer quavo = MediaPlayer.create(this,R.raw.mama);
        final MediaPlayer shaggy = MediaPlayer.create(this,R.raw.hereitcomes);
        final MediaPlayer dunk = MediaPlayer.create(this,R.raw.spaghetti);
        final MediaPlayer frieza = MediaPlayer.create(this,R.raw.hurtyourfeelings);
        final MediaPlayer silver = MediaPlayer.create(this, R.raw.itsnouse);

        final Button playBaby = (Button) this.findViewById(R.id.button_00);
        final Button playDoh = (Button) this.findViewById(R.id.button_01);
        final Button playDuck = (Button) this.findViewById(R.id.button_02);
        final Button playSpongBob = (Button) this.findViewById(R.id.button_10);
        final Button playQuavo = (Button) this.findViewById(R.id.button_11);
        final Button playShaggy = (Button) this.findViewById(R.id.button_12);
        final Button playDunk = (Button) this.findViewById(R.id.button_20);
        final Button playFrieza = (Button) this.findViewById(R.id.button_21);
        final Button playSilver = (Button) this.findViewById(R.id.button_22);

        playBaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baby.start();
            }
        });

        playDoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doh.start();
            }
        });

        playDuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duck.start();
            }
        });

        playDunk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dunk.start();
            }
        });

        playFrieza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frieza.start();
            }
        });

        playQuavo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quavo.start();
            }
        });

        playShaggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shaggy.start();
            }
        });

        playSilver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                silver.start();
            }
        });

        playSpongBob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spongeBob.start();
            }
        });
    }
}
