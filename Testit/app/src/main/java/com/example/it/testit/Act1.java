package com.example.it.testit;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Act1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
    }


    public void btnClick2(View v) {
        setContentView(R.layout.activity_act2);
        Intent i=new Intent("com.example.it.testit.Act2");
        startActivity(i);
    }

    public void btnClick3(View v) {
        setContentView(R.layout.activity_act3);
        Intent i=new Intent("com.example.it.testit.Act3");
        startActivity(i);
    }

    public void btnClick4(View v) {
        setContentView(R.layout.activity_act4);
        Intent i=new Intent("com.example.it.testit.Act4");
        startActivity(i);
    }

    public void btnClick5(View v) {
        setContentView(R.layout.activity_act5);
        Intent i=new Intent(this, Act5.class);
        startActivity(i);
    }

    public void btnClick6(View v){
        setContentView(R.layout.activity_act6);
        Intent i=new Intent(this, Act6.class);
        startActivity(i);
    }

    public void btnClick7(View v){
        setContentView(R.layout.activity_act7);
        Intent i=new Intent(this, Act7.class);
        startActivity(i);
    }

    public void btnClick8(View v){
        setContentView(R.layout.activity_act8);
        Intent i=new Intent(this, Act8.class);
        startActivity(i);
    }

    public void btnClick9(View v){
        setContentView(R.layout.activity_act9);
        Intent i=new Intent(this, Act9.class);
        startActivity(i);
    }

    public void btnClick10(View v){
        setContentView(R.layout.activity_act10);
        Intent i=new Intent(this, Act10.class);
        startActivity(i);
    }

    public void btnClick11(View v){
        setContentView(R.layout.activity_act11);
        Intent i=new Intent(this, Act11.class);
        startActivity(i);
    }

    public void btnClick12(View v){
        setContentView(R.layout.activity_act12);
        Intent i=new Intent(this, Act12.class);
        startActivity(i);
    }

    public void btnClick13(View v){
        setContentView(R.layout.activity_act13);
        Intent i=new Intent(this, Act13.class);
        startActivity(i);
    }

    public void btnClick14(View v){
        setContentView(R.layout.activity_act14);
        Intent i=new Intent(this, Act14.class);
        startActivity(i);
    }




    /*
    private static Button buttonsubmit;
    public void clickListner(){

        for(int x = 1; x <= 15; x++) {

            String max = "btn"+ x;
            int resID = getResources().getIdentifier(max, "id", "com.sample.testit");
            buttonsubmit = (Button) findViewById(resID);
            buttonsubmit.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent i = new Intent("com.example.it.testit.Act"+ x);
                            startActivity(i);
                        }
                    }
            );
        }
    }

    */

//////////////////////////////////////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act1, menu);
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
