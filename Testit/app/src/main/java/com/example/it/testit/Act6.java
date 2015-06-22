package com.example.it.testit;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;


public class Act6 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act6);
        addListnerbtn();
        addListnerChkB();
    }

    private CheckBox check1,check2,check3,check4;
    private Button bsel;

    public void addListnerbtn(){
        check1 = (CheckBox)findViewById(R.id.cb1);
        check2 = (CheckBox)findViewById(R.id.cb2);
        check3 = (CheckBox)findViewById(R.id.cb3);
        check4 = (CheckBox)findViewById(R.id.cb4);
        bsel = (Button)findViewById(R.id.button6);

        bsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Dog : ").append(check1.isChecked());
                result.append("\nCat : ").append(check2.isChecked());
                result.append("\npotato : ").append(check3.isChecked());
                result.append("\nbanana : ").append(check4.isChecked());

                Toast.makeText(Act6.this,result.toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void addListnerChkB(){
        check1= (CheckBox)findViewById(R.id.cb1);
        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(Act6.this,
                                    "Is selected", Toast.LENGTH_LONG).show();
                        }
                        else Toast.makeText(Act6.this,"not selected",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void clkbtnbk(View v){
        setContentView(R.layout.activity_main);
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }













    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act6, menu);
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
