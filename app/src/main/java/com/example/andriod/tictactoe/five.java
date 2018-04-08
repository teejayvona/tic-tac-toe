package com.example.andriod.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class five extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17;
    Button b18;
    Button b19;
    Button b20;
    Button b21;
    Button b22;
    Button b23;
    Button b24;
    Button b25;
    int xScore, yScore;
    int turn;
    boolean end = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);
        b18 = (Button) findViewById(R.id.b18);
        b19 = (Button) findViewById(R.id.b19);
        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);
        b24 = (Button) findViewById(R.id.b24);
        b25 = (Button) findViewById(R.id.b25);
        turn = 1;

        b1.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                endGame();

            }

        });

        b2.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                endGame();
            }

        });

        b3.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                endGame();
            }

        });

        b4.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                endGame();
            }

        });

        b5.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                endGame();
            }

        });

        b6.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                endGame();
            }

        });

        b7.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                endGame();
            }

        });

        b8.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                endGame();
            }

        });

        b9.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                endGame();
            }

        });

        b10.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b10.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b10.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b10.setText("O");
                    }
                }
                endGame();

            }

        });

        b11.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b11.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b11.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b11.setText("O");
                    }
                }
                endGame();

            }

        });

        b12.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b12.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b12.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b12.setText("O");
                    }
                }
                endGame();

            }

        });

        b13.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b13.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b13.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b13.setText("O");
                    }
                }
                endGame();

            }

        });

        b14.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b14.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b14.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b14.setText("O");
                    }
                }
                endGame();

            }

        });

        b15.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b15.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b15.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b15.setText("O");
                    }
                }
                endGame();

            }

        });

        b16.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b16.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b16.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b16.setText("O");
                    }
                }
                endGame();

            }

        });

        b17.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b17.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b17.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b17.setText("O");
                    }
                }
                endGame();

            }

        });

        b18.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b18.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b18.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b18.setText("O");
                    }
                }
                endGame();

            }

        });

        b19.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b19.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b19.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b19.setText("O");
                    }
                }
                endGame();

            }

        });

        b20.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b20.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b20.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b20.setText("O");
                    }
                }
                endGame();

            }

        });

        b21.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b21.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b21.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b21.setText("O");
                    }
                }
                endGame();

            }

        });

        b22.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b22.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b22.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b22.setText("O");
                    }
                }
                endGame();

            }

        });

        b23.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b23.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b23.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b23.setText("O");
                    }
                }
                endGame();

            }

        });

        b24.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b24.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b24.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b24.setText("O");
                    }
                }
                endGame();

            }

        });

        b25.setOnClickListener (new View.OnClickListener (){
            @Override
            public void onClick (View v){

                if (b25.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b25.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b25.setText("O");
                    }
                }
                endGame();

            }

        });


    }
    public void endGame() {
        String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y;

        if (xScore == 3 || yScore == 3)
        {xScore = 0; yScore = 0;}

        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();
        j = b10.getText().toString();
        k = b11.getText().toString();
        l = b12.getText().toString();
        m = b13.getText().toString();
        n = b14.getText().toString();
        o = b15.getText().toString();
        p = b16.getText().toString();
        q = b17.getText().toString();
        r = b18.getText().toString();
        s = b19.getText().toString();
        t = b20.getText().toString();
        u = b21.getText().toString();
        v = b22.getText().toString();
        w = b23.getText().toString();
        x = b24.getText().toString();
        y = b25 .getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X") && d.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (a.equals("X") && f.equals("X") && k.equals("X") && p.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (a.equals("X") && g.equals("X") && m.equals("X") && s.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (b.equals("X") && c.equals("X") && d.equals("X") && e.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (b.equals("X") && g.equals("X") && l.equals("X") && q.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (b.equals("X") && h.equals("X") && n.equals("X") && t.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (c.equals("X") && h.equals("X") && m.equals("X") && r.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (d.equals("X") && i.equals("X") && n.equals("X") && s.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (d.equals("X") && h.equals("X") && l.equals("X") && p.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (e.equals("X") && j.equals("X") && o.equals("X") && t.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (e.equals("X") && i.equals("X") && m.equals("X") && q.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (f.equals("X") && k.equals("X") && p.equals("X") && u.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (f.equals("X") && g.equals("X") && h.equals("X") && i.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (g.equals("X") && h.equals("X") && i.equals("X") && j.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (f.equals("X") && l.equals("X") && r.equals("X") && x.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (g.equals("X") && m.equals("X") && s.equals("X") && y.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (g.equals("X") && l.equals("X") && q.equals("X") && v.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (h.equals("X") && m.equals("X") && r.equals("X") && w.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (i.equals("X") && n.equals("X") && s.equals("X") && x.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (i.equals("X") && m.equals("X") && q.equals("X") && u.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (j.equals("X") && o.equals("X") && t.equals("X") && y.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (j.equals("X") && n.equals("X") && r.equals("X") && v.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (k.equals("X") && l.equals("X") && m.equals("X") && n.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (l.equals("X") && m.equals("X") && n.equals("X") && o.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (p.equals("X") && q.equals("X") && r.equals("X") && s.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (q.equals("X") && r.equals("X") && s.equals("X") && t.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (u.equals("X") && v.equals("X") && w.equals("X") && x.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (v.equals("X") && w.equals("X") && x.equals("X") && y.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }



        if (a.equals("O") && b.equals("O") && c.equals("O") && d.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (a.equals("O") && f.equals("O") && k.equals("O") && p.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (a.equals("O") && g.equals("O") && m.equals("O") && s.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (b.equals("O") && c.equals("O") && d.equals("O") && e.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (b.equals("O") && g.equals("O") && l.equals("O") && q.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (b.equals("O") && h.equals("O") && n.equals("O") && t.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (c.equals("O") && h.equals("O") && m.equals("O") && r.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (d.equals("O") && i.equals("O") && n.equals("O") && s.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (d.equals("O") && h.equals("O") && l.equals("O") && p.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (e.equals("O") && j.equals("O") && o.equals("O") && t.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (e.equals("O") && i.equals("O") && m.equals("O") && q.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (f.equals("O") && k.equals("O") && p.equals("O") && u.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (f.equals("O") && g.equals("O") && h.equals("O") && i.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (g.equals("O") && h.equals("O") && i.equals("O") && j.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (g.equals("O") && l.equals("O") && q.equals("O") && v.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (f.equals("O") && l.equals("O") && r.equals("O") && x.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (g.equals("O") && m.equals("O") && s.equals("O") && y.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (h.equals("O") && m.equals("O") && r.equals("O") && w.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (i.equals("O") && n.equals("O") && s.equals("O") && x.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (i.equals("O") && m.equals("O") && q.equals("O") && u.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (j.equals("O") && o.equals("O") && t.equals("O") && y.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (j.equals("O") && n.equals("O") && r.equals("O") && v.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (k.equals("O") && l.equals("O") && m.equals("O") && n.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (l.equals("O") && m.equals("O") && n.equals("O") && o.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (p.equals("O") && q.equals("O") && r.equals("O") && s.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (q.equals("O") && r.equals("O") && s.equals("O") && t.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (u.equals("O") && v.equals("O") && w.equals("O") && x.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }
        if (v.equals("O") && w.equals("O") && x.equals("O") && y.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_SHORT).show();
                end = false;
                setsGame();
            }
        }

        if (end){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);

            yScore = 0; xScore = 0;
        }

    }


    public void restart_btn(View view){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b16.setEnabled(true);
        b17.setEnabled(true);
        b18.setEnabled(true);
        b19.setEnabled(true);
        b20.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        b24.setEnabled(true);
        b25.setEnabled(true);

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");
        b15.setText("");
        b16.setText("");
        b17.setText("");
        b18.setText("");
        b19.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");
        b25.setText("");
        return;
    }

    public void setsGame(){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b16.setEnabled(true);
        b17.setEnabled(true);
        b18.setEnabled(true);
        b19.setEnabled(true);
        b20.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        b24.setEnabled(true);
        b25.setEnabled(true);

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");
        b15.setText("");
        b16.setText("");
        b17.setText("");
        b18.setText("");
        b19.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");
        b25.setText("");
        return;

    }

    public void displayMessage(){
        TextView xScoreTextView = (TextView) findViewById(R.id.x_score);
        xScoreTextView.setText(String.valueOf("X = " + xScore));
        TextView yScoreTextView = (TextView) findViewById(R.id.y_score);
        yScoreTextView.setText(String.valueOf("O = " + yScore));
    }
}