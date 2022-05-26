package com.naheen.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaring Widgets
    EditText editText;
    TextView txt1,txt2,txt3,valueInGrams;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Instantiating Widgets

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        valueInGrams=findViewById(R.id.ValueOfGrams);

        editText=findViewById(R.id.editTextNumber);

        btn1=findViewById(R.id.button);

        //Adding A Click event for button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling ConvertFromKiloToGrams

                ConvertFromKiloToGrams();


            }
        });

    }

    private void ConvertFromKiloToGrams() {
        //This Method will convert the value entered in editText
        //From Kilo to Grams

        String valueEnteredInKilo = editText.getText().toString();

        if (valueEnteredInKilo.isEmpty())
        {
            Context context=getApplicationContext();
           Toast.makeText(context,"Please Enter Valid Input",Toast.LENGTH_SHORT).show();
           valueInGrams.setText("...");
        }
        else {
            //converting string to number
            double kilo = Double.parseDouble(valueEnteredInKilo);

            //converting kilo to grams formula
            double grams = kilo * 1000;

            //Displaying the value resulted in textview
            valueInGrams.setText("" + grams);
        }


    }
}