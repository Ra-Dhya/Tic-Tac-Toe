package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splesh extends AppCompatActivity {
 TextView animtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);

        animtext=findViewById(R.id.logo);
        Animation move= AnimationUtils.loadAnimation(this,R.anim.sclar);
        animtext.startAnimation(move);

        new  Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent inext=new Intent(splesh.this, MainActivity2.class);
                startActivity(inext);
                finish();
            }
        },4000);
    }
}