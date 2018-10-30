package com.app.otbtapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImages();
    }

    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.imgur.com/bx9MyZr.jpg");
        mNames.add("Glamping");

        mImageUrls.add("https://i.imgur.com/uADPfu5.jpg");
        mNames.add("Experiences");

        mImageUrls.add("https://i.imgur.com/Gn0Zydn.jpg");
        mNames.add("Camping");

        mImageUrls.add("https://i.imgur.com/Gn0Zydn.jpg");
        mNames.add("Example");

        mImageUrls.add("https://i.imgur.com/Gn0Zydn.jpg");
        mNames.add("Example");

        mImageUrls.add("https://i.imgur.com/Gn0Zydn.jpg");
        mNames.add("Example");

        initRecyclerView();
    }

    private void initRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
    }
}