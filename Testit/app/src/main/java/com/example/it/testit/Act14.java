package com.example.it.testit;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class Act14 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act14);

       // thechoices();
      //  thechoices2();
        thechoices3array();
        spinnerclick();




    }

    public void thechoices(){
        String[] country={"S_Canada", "S_Mexico", "S_USA"};
        ArrayAdapter<String> stringArrayAdapter=
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        country);
        Spinner spinner =
                (Spinner)  findViewById(R.id.spinner);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void thechoices2(){
        //using resources. adjustment made in res/values/strings.xml
        //create an ArrayAdapter from a resource. The static method of ArrayAdapter class by using createFrmResource()
        //SpinnerList is the name of the array found in strings.xml !!!!!!!!!!!!
        ArrayAdapter<CharSequence> stringArrayAdapter=
                ArrayAdapter.createFromResource(
                        this,
                        R.array.SpinnerList,
                        android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner =
                (Spinner)  findViewById(R.id.spinner);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void thechoices3array(){
        Resources res=getResources();
        ArrayList<String> country=new ArrayList<String>(
                Arrays.asList(
                        res.getStringArray(R.array.SpinnerList)));
        ArrayAdapter<String> stringArrayAdapter=
                new ArrayAdapter<String>(
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        country);
        Spinner spinner =
                (Spinner)  findViewById(R.id.spinner);
        spinner.setAdapter(stringArrayAdapter);
    }


    private static Button buttonsub;
    private static TextView textv;
    private static EditText newword;
    public void addit(){
// stringArrayAdapter.add("");
// stringArrayAdapter.getCount();

    buttonsub = (Button)findViewById(R.id.button15);
    newword = (EditText)findViewById(R.id.editText7);

    buttonsub.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //somehow add to the list 

                    Toast.makeText(Act14.this, "Added "+newword.getText().toString(),
                            Toast.LENGTH_LONG).show();
                }
            }
    );

}






    public void spinnerclick() {
        AdapterView.OnItemSelectedListener onSpinner = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView text = (TextView) findViewById(R.id.textView13);
                text.setText("Position # " + Integer.toString(position)
                        + "\nName "+(String)parent.getItemAtPosition(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        Spinner spinner = (Spinner)  findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(onSpinner);
    }












    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act14, menu);
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
