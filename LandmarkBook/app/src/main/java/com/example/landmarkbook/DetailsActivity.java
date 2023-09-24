package com.example.landmarkbook;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.TextView;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Intent intent=getIntent();


        //Casting
       // Landmark selectedLandmark= (Landmark) intent.getSerializableExtra("landmark");
        //Landmark selectedLandmark=chosenLandmark;
        Singleton singleton=Singleton.getInstance();
        Landmark selectedLandmark=singleton.getSentLandmark();
        binding.textView.setText(selectedLandmark.name);
        binding.textView2.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);


    }
}