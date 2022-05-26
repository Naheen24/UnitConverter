package com.naheen.unitconverter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GmToKgActivity extends AppCompatActivity {

    //Declaring Widgets
    EditText editText;
    TextView txt1,txt2,txt3,valueInKg;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmtokg);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Instantiating Widgets

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        valueInKg=findViewById(R.id.ValueOfKg);

        editText=findViewById(R.id.editTextNumber);

        btn1=findViewById(R.id.button1);

        //Adding A Click event for button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Calling ConvertFromKiloToGrams

                ConvertFromGramsToKilo();


            }
        });

    }

    private void ConvertFromGramsToKilo() {
        //This Method will convert the value entered in editText
        //From Kilo to Grams

        String valueEnteredInGram = editText.getText().toString();

        if (valueEnteredInGram.isEmpty())
        {
            Context context=getApplicationContext();
            Toast.makeText(context,"Please Enter Valid Input",Toast.LENGTH_SHORT).show();
            valueInKg.setText("...");
        }
        else {
            //converting string to number
            double gram = Double.parseDouble(valueEnteredInGram);

            //converting kilo to grams formula
            double kilo = gram / 1000;

            //Displaying the value resulted in textview
            valueInKg.setText("" + kilo);
        }


    }
}