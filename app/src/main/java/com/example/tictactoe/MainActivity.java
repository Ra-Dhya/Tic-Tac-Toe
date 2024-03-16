package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
 Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
 String b1,b2,b3,b4,b5,b6,b7,b8,b9,one,two,a,b;
 TextView t1,t2;
 int count=0;
 int add=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.first);
        t2=findViewById(R.id.second);


        Intent inext=getIntent();

        SharedPreferences getShared=getSharedPreferences("player",MODE_PRIVATE);
        String player1=getShared.getString("player1","player1");
        String player2=getShared.getString("player2","player2");


//        one=inext.getStringExtra("name1");
//        two=inext.getStringExtra("name2");
        t1.setText(player1);
        t2.setText(player2);


        ini();


    }

    private void ini() {

        btn1=findViewById(R.id.but1);
        btn2=findViewById(R.id.but2);
        btn3=findViewById(R.id.but3);
        btn4=findViewById(R.id.but4);
        btn5=findViewById(R.id.but5);
        btn6=findViewById(R.id.but6);
        btn7=findViewById(R.id.but7);
        btn8=findViewById(R.id.but8);
        btn9=findViewById(R.id.but9);
    }

    public void check (View view) {
        Button btncureent = (Button) view;
        if (btncureent.getText().toString().equals("")) {
            add++;
            if (count == 0) {
                btncureent.setText("X");


                count = 1;
            } else {
                btncureent.setText("O");
                count = 0;
            }

            if (add > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                Intent move=new Intent(MainActivity.this,splesh2.class);

                 a=t1.getText().toString();
                 b=t2.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {

                    if(b1.equals("X")){
                        move.putExtra("first",a);
                    }else {
                        move.putExtra("first",b);
                    }
                    startActivity(move);

                    new_game();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    if(b4.equals("X")){
                        move.putExtra("first",a);
                    }else {
                        move.putExtra("first",b);
                    }
                    startActivity(move);

                    new_game();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    if(b7.equals("X")){
                        move.putExtra("first",a);
                    }else {
                        move.putExtra("first",b);
                    }
                    startActivity(move);

                    new_game();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    if(b1.equals("X")){
                        move.putExtra("first",a);
                    }else {
                        move.putExtra("first",b);
                    }
                    startActivity(move);

                    new_game();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    if(b2.equals("X")){
                        move.putExtra("first",a);
                    }else {
                        move.putExtra("first",b);
                    }
                    startActivity(move);

                    new_game();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    if(b3.equals("X")){
                        move.putExtra("first",a);
                    }else {
                        move.putExtra("first",b);
                    }
                    startActivity(move);

                    new_game();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    if(b1.equals("X")){
                        move.putExtra("first",a);
                    }else {
                        move.putExtra("first",b);
                    }
                    startActivity(move);


                    new_game();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    if(b3.equals("X")){
                        move.putExtra("first",a);
                    }else {
                        move.putExtra("first",b);
                    }
                    startActivity(move);

                    new_game();
                }else if(!b1.equals("" ) &&!b2.equals("" ) && !b3.equals("" ) &&!b4.equals("" ) &&!b5.equals("" ) && !b6.equals("" ) && !b7.equals("" ) &&!b8.equals("" ) && !b9.equals("" )   ) {
                    move.putExtra("first","match draw");
                    startActivity(move);

                    new_game();
                }


            }
        }
    }
    public void new_game(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count=0;
        add=0;
    }




}