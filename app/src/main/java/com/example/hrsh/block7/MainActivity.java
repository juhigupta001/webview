package com.example.hrsh.block7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=(NumberPicker) findViewById(R.id.numberPicker);
        final WebView webview=(WebView) findViewById(R.id.webview) ;
        Button button=(Button) findViewById(R.id.button);
        String[] text={"WEKIPEDIA","games","ANDROID","FACEBOOK"};
           p.setDisplayedValues(text);
        p.setMinValue(0);
        p.setMaxValue(text.length-1);

       button.setOnClickListener(new View.OnClickListener() {
         @Override
            public void onClick(View v) {

             int choices=p.getValue();
             if(choices==0) {
                 webview.setWebViewClient(new WebViewClient());
                 webview.loadUrl("http://www.wikipedia.com");
             }
             else if(choices==1) {
                 webview.setWebViewClient(new WebViewClient());

                 webview.loadUrl("http://www.games.com");
             }
             else if(choices==2) {
                 webview.setWebViewClient(new WebViewClient());

                 webview.loadUrl("http://www.android.com");
             }
                 else if(choices==3)
                     webview.loadUrl("http://facebook.com");


            }
        });
    }
}
