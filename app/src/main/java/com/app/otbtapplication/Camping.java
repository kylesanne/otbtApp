package com.app.otbtapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Camping extends AppCompatActivity {

    private static ImageView cone;
    private static ImageView ctwo;
    private static ImageView cthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camping);
        OnclickButtonListener();
    }

    public void OnclickButtonListener() {

        cone =  findViewById(R.id.imageView_campingOne);
        ctwo =  findViewById(R.id.imageView_campingTwo);
        cthree =  findViewById(R.id.imageView_campingThree);

        cone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Camping.this,CampingOne.class);
                startActivity(intent);
            }
        });

        ctwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Camping.this,CampingTwo.class);
                startActivity(intent);
            }
        });

        cthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Camping.this,CampingThree.class);
                startActivity(intent);
            }
        });
    }
}
