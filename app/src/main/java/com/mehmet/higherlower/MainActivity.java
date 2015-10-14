package com.mehmet.higherlower;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnLower = (Button)findViewById(R.id.btnLower);
        final Button btnEqual = (Button)findViewById(R.id.btnEqual);
        final Button btnHigher = (Button)findViewById(R.id.btnHigher);
        final TextView lblPreviousValue = (TextView)findViewById(R.id.lblPreviousValue);
        final TextView lblCurrentValue = (TextView)findViewById(R.id.lblCurrentValue);
        final TextView lblScore= (TextView)findViewById(R.id.lblScore);
        final TextView lblResult= (TextView)findViewById(R.id.lblResult);


        final Game game = new Game(Integer.parseInt(lblCurrentValue.getText().toString()));

        btnLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(game.play(Playtype.LOWER)) {
                    lblResult.setText("WON");
                }
                else{
                    lblResult.setText("LOST");
                }
                lblPreviousValue.setText(lblCurrentValue.getText());
                lblCurrentValue.setText(Integer.toString(game.getCurrent()));
                lblScore.setText("Score = " + Integer.toString(game.getScore()));
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(game.play(Playtype.EQUAL)) {
                    lblResult.setText("WON");
                }
                else{
                    lblResult.setText("LOST");
                }
                lblPreviousValue.setText(lblCurrentValue.getText());
                lblCurrentValue.setText(Integer.toString(game.getCurrent()));
                lblScore.setText("Score = " + Integer.toString(game.getScore()));
            }
        });

        btnHigher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(game.play(Playtype.HIGHER)) {
                    lblResult.setText("WON");
                }
                else{
                    lblResult.setText("LOST");
                }
                lblPreviousValue.setText(lblCurrentValue.getText());
                lblCurrentValue.setText(Integer.toString(game.getCurrent()));
                lblScore.setText("Score = " + Integer.toString(game.getScore()));
            }
        });

    }

}

