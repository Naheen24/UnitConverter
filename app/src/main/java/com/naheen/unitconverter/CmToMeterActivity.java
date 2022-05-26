package com.naheen.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CmToMeterActivity extends AppCompatActivity {

    //Declaring Widgets
    EditText editText;
    TextView txt1,txt2,txt3,valueInCm;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmtometer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Instantiating Widgets

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        valueInCm=findViewById(R.id.ValueOfCm);

        editText=findViewById(R.id.editTextNumber);

        btn1=findViewById(R.id.button3);

        //Adding A Click event for button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling ConvertFromKiloToGrams

                ConvertFromCmToMeter();


            }
        });

    }

    private void ConvertFromCmToMeter() {
        //This Method will convert the value entered in editText
        //From Kilo to Grams

        String valueEnteredInCm = editText.getText().toString();

        if (valueEnteredInCm.isEmpty())
        {
            Context context=getApplicationContext();
            Toast.makeText(context,"Please Enter Valid Input",Toast.LENGTH_SHORT).show();
            valueInCm.setText("...");
        }
        else {
            //converting string to number
            double cm = Double.parseDouble(valueEnteredInCm);

            //converting kilo to grams formula
            double meter = cm / 100;

            //Displaying the value resulted in textview
            valueInCm.setText("" + meter);
        }


    }
}