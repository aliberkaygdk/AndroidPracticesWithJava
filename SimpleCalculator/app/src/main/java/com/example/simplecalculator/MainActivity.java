package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        sonuc=findViewById(R.id.sonuc);
    }

    public void topla(View view){

        if(number1.getText().toString().matches("")||number2.getText().toString().matches(""))
            sonuc.setText("Enter Number!");
        else{
            int n1= Integer.parseInt(number1.getText().toString());
            int n2=Integer.parseInt(number2.getText().toString());
            int snc=n1+n2;
            sonuc.setText("Result: "+snc);
        }

    }
    public void cikar(View view){

        if(number1.getText().toString().matches("")||number2.getText().toString().matches(""))
            sonuc.setText("Enter Number!");
        else{
            int n1= Integer.parseInt(number1.getText().toString());
            int n2=Integer.parseInt(number2.getText().toString());
            int snc=n1-n2;
            sonuc.setText("Result: "+snc);
        }

    }
    public void carp(View view){

        if(number1.getText().toString().matches("")||number2.getText().toString().matches(""))
            sonuc.setText("Enter Number!");
        else{
            int n1= Integer.parseInt(number1.getText().toString());
            int n2=Integer.parseInt(number2.getText().toString());
            int snc=n1*n2;
            sonuc.setText("Result: "+snc);
        }

    }
    public void bol(View view){

        if(number1.getText().toString().matches("")||number2.getText().toString().matches("")||number2.getText().toString().matches("0+"))
            sonuc.setText("Enter Number!");
        else{
            int n1= Integer.parseInt(number1.getText().toString());
            int n2=Integer.parseInt(number2.getText().toString());
            int snc=n1/n2;
            sonuc.setText("Result: "+snc);
        }


    }
}