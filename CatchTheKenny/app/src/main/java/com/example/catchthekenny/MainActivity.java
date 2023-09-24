package com.example.catchthekenny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView scoreText,timeText;
    Button button;
    int score;
    long time;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView[] imageArray;
    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView=findViewById(R.id.imageView4);
        imageView2=findViewById(R.id.imageView5);
        imageView3=findViewById(R.id.imageView6);
        imageView4=findViewById(R.id.imageView7);
        imageArray=new ImageView[]{imageView,imageView2,imageView3,imageView4};

        hideImages();

        scoreText=findViewById(R.id.textViewScore);
        timeText=findViewById(R.id.textViewTime);
        score=0;
        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {

                timeText.setText("Time: "+l/1000);
            }

            @Override
            public void onFinish() {
            timeText.setText("Finished!");
                for (ImageView image: imageArray){
                    image.setVisibility(View.INVISIBLE);
                }
                handler.removeCallbacks(runnable);

            }
        }.start();

    }
    public void scoreI(View view){
        score++;
        scoreText.setText("Score: "+score);

    }
    public  void hideImages(){

        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                for (ImageView image: imageArray){
                    image.setVisibility(View.INVISIBLE);
                }
                Random random=new Random();
                int i=random.nextInt(4);
                imageArray[i].setVisibility(View.VISIBLE);
                handler.postDelayed(this,500);
            }
        };
        handler.post(runnable);

    }
    public void restart(View view){
        Intent intent=getIntent();
        finish();
        startActivity(intent);

    }
}