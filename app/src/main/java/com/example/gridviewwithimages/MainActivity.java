package com.example.gridviewwithimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images={R.drawable.bichon,R.drawable.canecorso,R.drawable.chihuahua,R.drawable.collie,R.drawable.dogargentino,R.drawable.german,R.drawable.mastif,
            R.drawable.rottweiler,R.drawable.tosainu};
    String[]names={"bichon","cane corso","chihuahua","collie","dog argentino","german", "mastiff","rottweiler","tosa inu"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        gridView= (GridView) findViewById(R.id.gv1);


        myAdapter adapter=new myAdapter(names,images,getApplicationContext());
        gridView.setAdapter(adapter);

    }
}