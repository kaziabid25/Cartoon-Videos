package com.kaziabid.webview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout lay1,lay2,lay3;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lay1= findViewById(R.id.lay1);
        lay2= findViewById(R.id.lay2);
        lay3= findViewById(R.id.lay3);

        lay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.url="https://www.youtube.com/embed/AGBjI0x9VbM";
                Intent myIntent= new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);

            }
        });

        lay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.url="https://www.youtube.com/embed/dvVvm6nGxTI";
                Intent myIntent= new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);

            }
        });


        lay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.url="https://www.youtube.com/watch?v=5T1qtBIjYHo&ab_channel=VootKids";
                Intent myIntent= new Intent(MainActivity.this, VideoPlayer.class);
                startActivity(myIntent);

            }
        });







    }
}