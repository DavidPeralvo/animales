package com.example.davidperalvogomez.gridlayout;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
     private ImageButton cabra1,cabra2,cabra3;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cabra1=(ImageButton)findViewById(R.id.imageButton);
        cabra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.cabra);
                mp.start();

            }
        });
        cabra2=(ImageButton)findViewById(R.id.imageButton2);
        cabra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.cabra2);
                mp.start();
            }
        });
        cabra3=(ImageButton)findViewById(R.id.imageButton3);
        cabra3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.cabra3);
                mp.start();


            }
        });
    }
}
