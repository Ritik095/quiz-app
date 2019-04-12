package com.example.quiz_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class select_topic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_topic);
    }

    public void clicked(View view){
        Intent intent = new Intent(select_topic.this,payment.class);
        startActivity(intent);
    }
}
