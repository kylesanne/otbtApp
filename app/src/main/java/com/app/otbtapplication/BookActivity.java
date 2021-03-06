package com.app.otbtapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;




public class BookActivity extends AppCompatActivity implements OnItemSelectedListener, View.OnClickListener {

    Spinner spinnerAccommodation;
    Spinner spinnerGuests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_book);

        spinnerAccommodation = (Spinner) findViewById(R.id.AccommodationSpinner);
        spinnerGuests = (Spinner) findViewById(R.id.GuestsSpinner);


        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.accommodation_options, android.R.layout.simple_spinner_item);
        spinnerAccommodation.setAdapter(adapter1);
        spinnerAccommodation.setOnItemSelectedListener(BookActivity.this);

        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.guest_options, android.R.layout.simple_spinner_item);
        spinnerGuests.setAdapter(adapter2);
        spinnerGuests.setOnItemSelectedListener(BookActivity.this);

        Button home = (Button) findViewById(R.id.button);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivityReceipt();
            }
        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
        }
    }

    public void OpenActivityReceipt() {
        Intent intent = new Intent(this, ReceiptActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}





