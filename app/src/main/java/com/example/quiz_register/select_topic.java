package com.example.quiz_register;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class select_topic extends AppCompatActivity {

    ImageButton imageButton2;
    ArrayList listOfTopics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_topic);
    }

    public void clicked(View view){
        Intent intent = new Intent(select_topic.this,payment.class);

        if(view.getTag().toString().equals("-1")) {
            view.setSelected(true);
            view.setTag("1");
        }else
        {
            view.setSelected(false);
            view.setTag("-1");
        }
    }


    public void moveToPayment(View view){
       Intent intent = new Intent(select_topic.this , payment.class);
        startActivity(intent);
    }
}
