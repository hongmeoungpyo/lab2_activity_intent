package com.example.hong.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Name; //variable declation
    EditText Age;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Called when the activity is first created
        setContentView(R.layout.activity_main);

        Name =(EditText) findViewById(R.id.editText1); //variable rinked object EditText
        Age = (EditText)findViewById(R.id.editText2) ;
        button1 =(Button)findViewById(R.id.button1) ;

        button1.setOnClickListener(new View.OnClickListener(){ //buttonclick event process
            @Override
            public void onClick(View view){
                String name = Name.getText().toString(); //Name variable for name with stringtype
                String age = Age.getText().toString();
                Intent intent = new Intent(getApplicationContext(),activity_new.class); //create an Intent object
                intent.putExtra("loginName",name); //put extra data
                intent.putExtra("loginAge",age);
                startActivity(intent); //start intent


            }

        });
    }


}