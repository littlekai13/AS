package com.example.it.testit;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Act2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        clickListner();
    }

    public void btnclicksum(View v){
        EditText eone = (EditText)findViewById(R.id.editText);
        EditText etwo = (EditText)findViewById(R.id.editText2);
        TextView tone = (TextView)findViewById(R.id.textView4);

        if(eone.getText().toString().matches("") ||
                etwo.getText().toString().matches("")) {
            tone.setText("Type input"); return;}

        int numone = Integer.parseInt(eone.getText().toString());
        int numtwo = Integer.parseInt(etwo.getText().toString());
        int sum = numone + numtwo;
        tone.setText("Sum: " + Integer.toString(sum));

        Button button=(Button) v;
        button.setText("haha!");
        TextView myTextView=(TextView)findViewById(R.id.textView5);
        myTextView.setText("You Clicked");
    }

   /*public void btnClickhome(View v) {
        setContentView(R.layout.activity_main);
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }*/


    private static Button buttonsubmit;
    public void clickListner(){
        buttonsubmit = (Button)findViewById(R.id.btn1);
        buttonsubmit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent("com.example.it.testit.Act1");
                        startActivity(i);
                    }
                }
        );
    }














    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act2, menu);
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
