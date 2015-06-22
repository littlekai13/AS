package com.example.it.testit;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.lang.Math;


public class Act5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act5);
    }

    //SwitchCase method.
    private static RadioGroup radiog;

    public void clickbtn(View v){
        radiog = (RadioGroup)findViewById(R.id.rg);

        EditText eone = (EditText)findViewById(R.id.editText);
        TextView tone = (TextView)findViewById(R.id.textView);

        if(eone.getText().toString().matches("")) {tone.setText("Type input"); return;}

        double numone = Double.parseDouble(eone.getText().toString());
        double result;

        int radioButtonID = radiog.getCheckedRadioButtonId();
        View radioButton = radiog.findViewById(radioButtonID);
        int idx = radiog.indexOfChild(radioButton);

        switch(idx){
            case 0:
                result = numone*(1/0.3048);
                tone.setText(Double.toString(result) + " ft");
                break;
            case 1:
                result = numone*(0.3048);
                tone.setText(Double.toString(result)+" m");
                break;
            case 2:
                result = numone*Math.pow(1 / 0.3048, 2);
                tone.setText(Html.fromHtml(Double.toString(result)+" "+("ft<sup><small>2</small></sup>")));
                break;
            case 3:
                result = numone*Math.pow(0.3048,2);
                tone.setText(Html.fromHtml(Double.toString(result)+" "+("m<sup><small>2</small></sup>")));
                break;
            case 4:
                result = numone*Math.pow(1/0.3048,3);
                tone.setText(Html.fromHtml(Double.toString(result)+" "+("ft<sup><small>3</small></sup>")));
                break;
            case 5:
                result = numone*Math.pow(0.3048,3);
                tone.setText(Html.fromHtml(Double.toString(result)+" "+("m<sup><small>3</small></sup>")));
                break;
            default:
                tone.setText("Not selected");
                break;
        }
    }

    public void clkbtnbb(View v){
        setContentView(R.layout.activity_main);
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }

/*
    //Clicking method. Too redundant.
    public void op1(View v){
        EditText eone = (EditText)findViewById(R.id.editText);
        TextView tone = (TextView)findViewById(R.id.textView);
        double numone = Double.parseDouble(eone.getText().toString());
        double result = numone*(1/0.3048);
        tone.setText(Double.toString(result) + " ft");
    }
    public void op2(View v){
        EditText eone = (EditText)findViewById(R.id.editText);
        TextView tone = (TextView)findViewById(R.id.textView);
        double numone = Double.parseDouble(eone.getText().toString());
        double result = numone*(0.3048);
        tone.setText(Double.toString(result)+" m");
    }

    public void op3(View v){
        EditText eone = (EditText)findViewById(R.id.editText);
        TextView tone = (TextView)findViewById(R.id.textView);
        double numone = Double.parseDouble(eone.getText().toString());
        double result = numone*Math.pow(1 / 0.3048, 2);
        tone.setText(Html.fromHtml(Double.toString(result)+" "+("ft<sup><small>2</small></sup>")));
    }
    public void op4(View v){
        EditText eone = (EditText)findViewById(R.id.editText);
        TextView tone = (TextView)findViewById(R.id.textView);
        double numone = Double.parseDouble(eone.getText().toString());
        double result = numone*Math.pow(0.3048,2);
        tone.setText(Html.fromHtml(Double.toString(result)+" "+("m<sup><small>2</small></sup>")));
    }
    public void op5(View v){
        EditText eone = (EditText)findViewById(R.id.editText);
        TextView tone = (TextView)findViewById(R.id.textView);
        double numone = Double.parseDouble(eone.getText().toString());
        double result = numone*Math.pow(1/0.3048,3);
        tone.setText(Html.fromHtml(Double.toString(result)+" "+("ft<sup><small>3</small></sup>")));
    }
    public void op6(View v){
        EditText eone = (EditText)findViewById(R.id.editText);
        TextView tone = (TextView)findViewById(R.id.textView);
        double numone = Double.parseDouble(eone.getText().toString());
        double result = numone*Math.pow(0.3048,3);
        tone.setText(Html.fromHtml(Double.toString(result)+" "+("m<sup><small>3</small></sup>")));
    }
*/

















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act5, menu);
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
