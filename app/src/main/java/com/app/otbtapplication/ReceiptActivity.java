package com.app.otbtapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ReceiptActivity extends AppCompatActivity implements View.OnClickListener {

    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);


        Button home = (Button) findViewById(R.id.button);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivityMain();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
        }
    }


    public void OpenActivityMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}
