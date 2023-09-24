package com.example.landmarkbook;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;
import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark>landmarkArrayList;
    private ActivityMainBinding binding;
   // static Landmark chosenLandmark;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList=new ArrayList<>();
        //Data

       Landmark pisa=new Landmark("Pisa","Italy",R.drawable.pisa);
       Landmark eiffel=new Landmark("Eiffel","France",R.drawable.eifel);
       Landmark colosseum=new Landmark("Colosseum","Italy",R.drawable.colosseum);

       landmarkArrayList.add(pisa);
       landmarkArrayList.add(eiffel);
       landmarkArrayList.add(colosseum);

       binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
       LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
       binding.recyclerView.setAdapter(landmarkAdapter);


       /*
       //Adapter
        //Listview

        //mapping
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,landmarkArrayList.get(i).name,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(i));
                startActivity(intent);
            }
        });*/



    }
}