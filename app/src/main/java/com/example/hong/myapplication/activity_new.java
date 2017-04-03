package com.example.hong.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_new extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent passedIntent=getIntent(); //create passedintent call getIntent
        if(passedIntent!=null){  //if passedIntent value is null
            String loginName = passedIntent.getStringExtra("loginName"); //loginName insert passedIntent getStringExtra mathod call
            String loginAge = passedIntent.getStringExtra("loginAge");
            Toast toast = Toast.makeText(getApplicationContext(),"Student info : "+loginName+loginAge,Toast.LENGTH_SHORT);//create toast message
            toast.show();  //toast massage print
        }

        Button button = (Button)findViewById(R.id.button2); //object button2 rinked button
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                finish();  // remove current activity
            }
        });

    }
}