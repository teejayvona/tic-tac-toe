package com.example.andriod.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


public class three extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    int xScore, yScore;
    int turn;
    boolean end = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
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


    }
    public void endGame() {
        String a, b, c, d, e, f, g, h, i;

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

        if (a.equals(b) && a.equals(c) && a.equals("X") && b.equals("X") && c.equals("X")) {
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
        if (a.equals(e) && a.equals(i) && a.equals("X") && e.equals("X") && i.equals("X")) {
            if (xScore == 2){
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
            end = true;}
            else{
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins the set", Toast.LENGTH_LONG).show();
            end = false;
            setsGame();
            }
        }
        if (a.equals(d) && a.equals(g) && a.equals("X") && d.equals("X") && g.equals("X")) {
            if (xScore == 2){
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
            end = true;}
            else{
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins the set", Toast.LENGTH_LONG).show();
            end = false;
            setsGame();
            }
        }
        if (b.equals(e) && b.equals(h) && b.equals("X") && e.equals("X") && h.equals("X")) {
            if (xScore == 2){
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
            end = true;}
            else{
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins the set", Toast.LENGTH_LONG).show();
            end = false;
            setsGame();
            }
        }
        if (c.equals(f) && c.equals(i) && c.equals("X") && f.equals("X") && i.equals("X")) {
            if (xScore == 2){
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
            end = true;}
            else{
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins the set", Toast.LENGTH_LONG).show();
            end = false;
            setsGame();
            }
        }
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            if (xScore == 2){
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                xScore = xScore + 1;
                displayMessage();
                Toast.makeText(this, "Player X wins the set", Toast.LENGTH_LONG).show();
                end = false;
                setsGame();
            }
        }
        if (d.equals(e) && d.equals(f) && d.equals("X") && e.equals("X") && f.equals("X")) {
            if (xScore == 2){
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
            end = true;}
            else{
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins the set", Toast.LENGTH_LONG).show();
            end = false;
            setsGame();
            }
        }
        if (g.equals(h) && g.equals(i) && g.equals("X") && h.equals("X") && i.equals("X")) {
            if (xScore == 2){
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins Game", Toast.LENGTH_LONG).show();
            end = true;}
            else{
            xScore = xScore + 1;
            displayMessage();
            Toast.makeText(this, "Player X wins Set", Toast.LENGTH_LONG).show();
            end = false;
            setsGame();
            }
        }


        if (a.equals(b) && a.equals(c) && a.equals("O") && b.equals("O") && c.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_LONG).show();
                end = false;
                setsGame();
            }
        }
        if (a.equals(e) && a.equals(i) && a.equals("O") && e.equals("O") && i.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_LONG).show();
                end = false;
                setsGame();
            }
        }
        if (a.equals(d) && a.equals(g) && a.equals("O") && d.equals("O") && g.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_LONG).show();
                end = false;
                setsGame();
            }
        }
        if (b.equals(e) && b.equals(h) && b.equals("O") && e.equals("O") && h.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_LONG).show();
                end = false;
                setsGame();
            }
        }
        if (c.equals(f) && c.equals(i) && c.equals("O") && f.equals("O") && i.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_LONG).show();
                end = false;
                setsGame();
            }
        }
        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_LONG).show();
                end = false;
                setsGame();
            }
        }
        if (d.equals(e) && d.equals(f) && d.equals("O") && e.equals("O") && f.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins the set", Toast.LENGTH_LONG).show();
                end = false;
                setsGame();
            }
        }
        if (g.equals(h) && g.equals(i) && g.equals("O") && h.equals("O") && i.equals("O")) {
            if (yScore == 2){
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Game", Toast.LENGTH_LONG).show();
                end = true;}
            else{
                yScore = yScore + 1;
                displayMessage();
                Toast.makeText(this, "Player O wins Set", Toast.LENGTH_LONG).show();
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

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
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

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        return;

    }

    public void displayMessage(){
        TextView xScoreTextView = (TextView) findViewById(R.id.x_score);
        xScoreTextView.setText(String.valueOf("X = " + xScore));
        TextView yScoreTextView = (TextView) findViewById(R.id.y_score);
        yScoreTextView.setText(String.valueOf("O = " + yScore));
    }
}