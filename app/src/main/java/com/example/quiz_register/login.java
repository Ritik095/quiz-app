package com.example.quiz_register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {

    TextView signUp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signUp = (TextView) findViewById(R.id.textView5);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this , register.class);
                startActivity(intent);
            }
        });
    }

    public  void temp(View view){
        Intent intent = new Intent(login.this, select_topic.class);
        startActivity(intent);
    }

}
