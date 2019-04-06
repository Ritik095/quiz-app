package com.example.quiz_register;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
      WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web =(WebView)findViewById(R.id.web1);
        web.loadUrl("file:///android_res/raw/logo1.html");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity.this,login.class);
                startActivity(in);
                finish();
            }
        },3000);
    }
}
