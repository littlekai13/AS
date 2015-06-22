package com.example.it.testit;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;


public class Act8 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act8);
        btnclickListner();
        btnclickListnerclock();
    }

    private static Button buttonsub;

    public void btnclickListner(){
        buttonsub = (Button)findViewById(R.id.button10);
        buttonsub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder thebuilder = new AlertDialog.Builder(Act8.this);
                        thebuilder.setMessage("Alert: Do you want to Close this app?").setCancelable(false)
                                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        finish();
                                        setContentView(R.layout.activity_main);
                                        Intent i=new Intent(Act8.this, MainActivity.class);
                                        startActivity(i);
                                    }
                                })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = thebuilder.create();
                        alert.setTitle("Alert");
                        alert.show();
                    }
                }
        );
    }

  //  private static Button buttonsubc;
    private static DigitalClock digital;
    private static AnalogClock analog;

    public void btnclickListnerclock(){
        buttonsub = (Button)findViewById(R.id.button11);
        digital = (DigitalClock)findViewById(R.id.digitalClock);
        analog = (AnalogClock)findViewById(R.id.analogClock);

        buttonsub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(digital.getVisibility() == DigitalClock.GONE){
                            digital.setVisibility(DigitalClock.VISIBLE);
                            analog.setVisibility(AnalogClock.GONE);
                        }
                        else{
                            digital.setVisibility(DigitalClock.GONE);
                            analog.setVisibility(AnalogClock.VISIBLE);
                        }
                    }
                }
        );
    }

















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act8, menu);
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
