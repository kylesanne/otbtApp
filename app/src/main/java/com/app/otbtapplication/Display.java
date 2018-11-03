package com.app.otbtapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Display extends AppCompatActivity {

    private static ImageView wone;
    private static ImageView wtwo;
    private static ImageView wthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        OnclickButtonListener();
    }

    public void OnclickButtonListener() {

        wone =  findViewById(R.id.imageView_waikatoOne);
        wtwo =  findViewById(R.id.imageView_waikatoTwo);
        wthree =  findViewById(R.id.imageView_waikatoThree);

        wone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display.this,WaikatoOne.class);
                startActivity(intent);
            }
        });

        wtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display.this,WaikatoTwo.class);
                startActivity(intent);
            }
        });

        wthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Display.this,WaikatoThree.class);
                startActivity(intent);
            }
        });
    }
}
