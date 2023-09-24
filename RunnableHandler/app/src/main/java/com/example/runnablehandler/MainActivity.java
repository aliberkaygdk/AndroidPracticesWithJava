package com.example.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int number;
    Runnable runnable;
    Handler handler;
    Button button,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        number=0;
        button=findViewById(R.id.buttonStart);
        button2=findViewById(R.id.buttonClear);
        button3=findViewById(R.id.buttonStop);
    }
    public void start(View view){
        button3.setEnabled(true);
        button2.setEnabled(true);
        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                textView.setText("Time: "+number);
                number++;
                handler.postDelayed(runnable,1000);
            }
        };
        handler.post(runnable);

        button.setEnabled(false);
    }
    public void stop(View view){
        button2.setEnabled(true);
        button.setEnabled(true);
        handler.removeCallbacks(runnable);
        button3.setEnabled(false);
    }
    public void clear(View view){
        handler.removeCallbacks(runnable);
        button.setEnabled(true);
        button3.setEnabled(true);
        number=0;
        textView.setText("Time: "+number);

    }
}