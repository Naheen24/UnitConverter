package com.naheen.unitconverter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    //Declaring Widgets
    TextView tv1;
    Button btn1,btn2,btn3,btn4;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Instantiating Widgets

        tv1=findViewById(R.id.text1);
        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);

        //Adding A Click event for button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling ConvertFromKiloToGrams
                Intent i=new Intent(MenuActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling ConvertFromKiloToGrams
                Intent i=new Intent(MenuActivity.this,GmToKgActivity.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling ConvertFromKiloToGrams
                Intent i=new Intent(MenuActivity.this,MeterToCmActivity.class);
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling ConvertFromKiloToGrams
                Intent i=new Intent(MenuActivity.this,CmToMeterActivity.class);
                startActivity(i);
            }
        });

    }
}