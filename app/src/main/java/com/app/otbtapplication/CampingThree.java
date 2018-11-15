package com.app.otbtapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CampingThree extends AppCompatActivity implements View.OnClickListener {


    private Button booking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camping_three);

        Button booking = (Button) findViewById(R.id.bookButton);


        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivityBook();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
        }}


    public void OpenActivityBook() {
        Intent intent = new Intent(this, BookActivity.class);
        startActivity(intent);
    }

    
}
