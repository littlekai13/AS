package com.example.it.testit;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import java.util.WeakHashMap;


public class Act12 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act12);
        openurl();
    }

    private static Button buttonsub;
    private static EditText urltext;
    private static WebView browser;

    public void openurl(){
        setContentView(R.layout.activity_act12);
        buttonsub = (Button)findViewById(R.id.button14);
        urltext = (EditText)findViewById(R.id.editText6);
        browser = (WebView)findViewById(R.id.webView);

        buttonsub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String url = urltext.getText().toString();
                      //  if(url[0:6] != "http://"){url = "http://"+url;} OR if(url[0:6].equals("http://"))
                        if(url.substring(0,7).equals("http://")){}
                            else {url = "http://"+url;}
                        browser.getSettings().setLoadsImagesAutomatically(true);
                        browser.getSettings().setJavaScriptEnabled(true);
                        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                        browser.setWebViewClient(new WebViewClient());
                        browser.loadUrl(url);
                    }
                }
        );
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act12, menu);
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
