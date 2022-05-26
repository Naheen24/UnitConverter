package com.naheen.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MeterToCmActivity extends AppCompatActivity {

    //Declaring Widgets
    EditText editText;
    TextView txt1,txt2,txt3,valueInMeter;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metertocm);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Instantiating Widgets

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        valueInMeter=findViewById(R.id.ValueOfMeter);

        editText=findViewById(R.id.editTextNumber);

        btn1=findViewById(R.id.button2);

        //Adding A Click event for button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling ConvertFromKiloToGrams

                ConvertFromMeterToCm();


            }
        });

    }

    private void ConvertFromMeterToCm() {
        //This Method will convert the value entered in editText
        //From Kilo to Grams

        String valueEnteredInMeter = editText.getText().toString();

        if (valueEnteredInMeter.isEmpty())
        {
            Context context=getApplicationContext();
            Toast.makeText(context,"Please Enter Valid Input",Toast.LENGTH_SHORT).show();
            valueInMeter.setText("...");
        }
        else {
            //converting string to number
            double meter = Double.parseDouble(valueEnteredInMeter);

            //converting kilo to grams formula
            double cm = meter * 100;

            //Displaying the value resulted in textview
            valueInMeter.setText("" + cm);
        }


    }
}