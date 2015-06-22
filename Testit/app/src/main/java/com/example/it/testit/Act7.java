package com.example.it.testit;

import android.media.Rating;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class Act7 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act7);
        listnerRateb();
        btnclickListner();
    }

    private static Button buttonsub;
    private static TextView textv;
    private static RatingBar ratingb;

    public void listnerRateb(){
        ratingb = (RatingBar)findViewById(R.id.ratingBar);
        textv = (TextView)findViewById(R.id.textView6);

        ratingb.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener(){
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser){
                        textv.setText(String.valueOf(rating));
                    }
                }
        );
    }

    public void btnclickListner(){
        ratingb = (RatingBar)findViewById(R.id.ratingBar);
        buttonsub = (Button)findViewById(R.id.button9);

        buttonsub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Act7.this, String.valueOf(ratingb.getRating()),
                                Toast.LENGTH_LONG).show();
                    }
                }
        );
    }






















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act7, menu);
        return true;
    }

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
