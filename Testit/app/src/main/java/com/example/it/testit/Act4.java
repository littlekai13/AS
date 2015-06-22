package com.example.it.testit;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Act4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        clickListenerBtn();
    }

    private static RadioGroup radiog;
    private static RadioButton radiob;
    private static Button btnsub;

    public void clickListenerBtn(){
        radiog = (RadioGroup)findViewById(R.id.rg);
        btnsub = (Button)findViewById(R.id.button4);

        btnsub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedid = radiog.getCheckedRadioButtonId();

                        if(selectedid == -1) {return;}

                        radiob = (RadioButton)findViewById(selectedid);
                        Toast.makeText(Act4.this,
                                radiob.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    public void clkbtnb(View v){
        setContentView(R.layout.activity_main);
        Intent i=new Intent(Act4.this, Act1.class);
        startActivity(i);
    }













    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act4, menu);
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
