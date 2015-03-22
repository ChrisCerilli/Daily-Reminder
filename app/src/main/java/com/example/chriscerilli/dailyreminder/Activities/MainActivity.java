package com.example.chriscerilli.dailyreminder.Activities;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;

import com.example.chriscerilli.dailyreminder.R;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBrush = (Button)findViewById(R.id.btnBrush);
        btnBrush.setOnClickListener(this);

        Button btnBrush2 = (Button)findViewById(R.id.btnBrush2);
        btnBrush2.setOnClickListener(this);

        Button btnFloss = (Button)findViewById(R.id.btnFloss);
        btnFloss.setOnClickListener(this);

        Button btnVitamin = (Button)findViewById(R.id.btnVitamin);
        btnVitamin.setOnClickListener(this);

        Button btnPill = (Button)findViewById(R.id.btnPill);
        btnPill.setOnClickListener(this);

        Button btnBed = (Button)findViewById(R.id.btnBed);
        btnBed.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        v.setEnabled(false);
        v.setBackgroundColor(Color.GREEN);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
/*
    public void brushOnClick(View v) {
        Button button=(Button)v;
        button.setEnabled(false);
        RatingBar rbar = (RatingBar)findViewById(R.id.dailyProgress);
        rbar.setNumStars(rbar.getNumStars() + 1);
    }

    public void brush2OnClick(View v) {
        Button button=(Button)v;
        button.setEnabled(false);
        RatingBar rbar = (RatingBar)findViewById(R.id.dailyProgress);
        rbar.setNumStars(rbar.getNumStars() + 1);
    }

    public void flossOnClick(View v) {
        Button button=(Button)v;
        button.setEnabled(false);
        RatingBar rbar = (RatingBar)findViewById(R.id.dailyProgress);
        rbar.setNumStars(rbar.getNumStars()+1);

    }

    public void vitaminOnClick(View v) {
        Button button=(Button)v;
        button.setEnabled(false);
        RatingBar rbar = (RatingBar)findViewById(R.id.dailyProgress);
        rbar.setNumStars(rbar.getNumStars() + 1);
    }

    public void pillOnClick(View v) {
        Button button=(Button)v;
        button.setEnabled(false);
        RatingBar rbar = (RatingBar)findViewById(R.id.dailyProgress);
        rbar.setNumStars(rbar.getNumStars() + 1);
    }

    public void bedOnClick(View v) {
        Button button=(Button)v;
        button.setEnabled(false);
        RatingBar rbar = (RatingBar)findViewById(R.id.dailyProgress);
        rbar.setNumStars(rbar.getNumStars() + 1);
    }

*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
