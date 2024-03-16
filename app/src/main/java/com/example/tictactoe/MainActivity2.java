package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {
    Button move;
    EditText fir,sec;
    String one, two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        move=findViewById(R.id.start);
        fir=findViewById(R.id.first);
        sec=findViewById(R.id.second);

    move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one=fir.getText().toString();
                two=sec.getText().toString();
                Intent inext=new Intent(MainActivity2.this, MainActivity.class);
//                inext.putExtra("name1",one);
//                inext.putExtra("name2", two);
                SharedPreferences sharedPreferences=getSharedPreferences("player", MODE_PRIVATE );
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("player1", one);
                editor.putString("player2", two);

                editor.apply();

                startActivity(inext);
            }
        });




    }
}