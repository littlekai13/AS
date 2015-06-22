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
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
        Intent i = new Intent(this, Act1.class);
        startActivity(i);
        //LoginButton();
    }

    private static EditText username;
    private static EditText password;
    private static TextView attempts;
    private static Button loginbtn;
    int attemptcount = 5;

    public void LoginButton(){
        username = (EditText)findViewById(R.id.editText4);
        password = (EditText)findViewById(R.id.editText5);
        attempts = (TextView)findViewById(R.id.textView9);
        loginbtn = (Button)findViewById(R.id.button12);

        attempts.setText("Attempts Remaining: "+ Integer.toString(attemptcount));

        loginbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(username.getText().toString().equals("user") &&
                                password.getText().toString().equals("pass")){
                            Toast.makeText(MainActivity.this, "Correct",
                                    Toast.LENGTH_SHORT).show();
                            Intent i = new Intent("com.example.it.testit.Act1");
                            startActivity(i);
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Incorrect",
                                    Toast.LENGTH_SHORT).show();
                            attemptcount--;
                            attempts.setText("Attempts Remaining: "+ Integer.toString(attemptcount));
                            if(attemptcount <= 0) {
                                loginbtn.setEnabled(false);
                                attempts.setText("Sorry");
                            }
                        }
                    }
                }
        );
    }

















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


/*


    public void btnClick2(View v) {
        setContentView(R.layout.activity_act2);
        Intent i=new Intent(this, Act2.class);
        startActivity(i);
    }

    public void btnClick3(View v) {
        setContentView(R.layout.activity_act3);
        Intent i=new Intent(this, Act3.class);
        startActivity(i);
    }

    public void btnClick4(View v) {
        setContentView(R.layout.activity_act4);
        Intent i=new Intent(this, Act4.class);
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

 */