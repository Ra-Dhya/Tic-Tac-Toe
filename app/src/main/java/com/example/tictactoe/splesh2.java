package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class splesh2 extends AppCompatActivity {
    TextView t1;
    Button b1,b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh2);

        t1=findViewById(R.id.result);
        b1=findViewById(R.id.home);
        b2=findViewById(R.id.restart);
        Intent get=getIntent();
        String a=get.getStringExtra("first");
        t1.setText(a);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext=new Intent(splesh2.this,MainActivity2.class);
                startActivity(inext);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(splesh2.this, MainActivity.class);
                startActivity(in);
                finish();
            }
        });
    }
}