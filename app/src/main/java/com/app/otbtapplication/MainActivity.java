package com.app.otbtapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "MainActivity";

    private Button camping;
    private Button equipment;

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    private ArrayList<String> mNames2 = new ArrayList<>();
    private ArrayList<String> mImageUrls2 = new ArrayList<>();
    private ArrayList<String> mPrices = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        getImages();


        ImageView camping = (ImageView) findViewById(R.id.readView);
        ImageView equipment = (ImageView) findViewById(R.id.advertisementView);


        camping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivityBook();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://offthebeatentrack.co.nz/?p=blog&BlogId=2"));
                startActivity(browserIntent);
            }
        });

        equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://offthebeatentrack.co.nz/"));
                startActivity(browserIntent);
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



    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://i.imgur.com/2rH7tVg.png");
        mNames.add("Camping");

        mImageUrls.add("https://i.imgur.com/xyTkSXd.png");
        mNames.add("Cabins");

        mImageUrls.add("https://i.imgur.com/YkhKcq1.png");
        mNames.add("Glamping");

        mImageUrls.add("https://i.imgur.com/O2JAM1m.png");
        mNames.add("Cottages");

        mImageUrls.add("https://i.imgur.com/Wsaml3C.png");
        mNames.add("Quirky");

        mImageUrls.add("https://i.imgur.com/3u2NFXg.png");
        mNames.add("Farmstay");

        mImageUrls.add("https://i.imgur.com/U2Eo0Eg.png");
        mNames.add("Experiences");

        initRecyclerView();


        mImageUrls2.add("https://i.imgur.com/tb4nKap.png");
        mNames2.add("The Ark @ Tui Ridge");
        mPrices.add("$99 per night");

        mImageUrls2.add("https://i.imgur.com/IomlYsN.png");
        mNames2.add("Old Coach Oasis");
        mPrices.add("$240 per night (up to 2 guests)");

        mImageUrls2.add("https://i.imgur.com/xkMg4F6.png");
        mNames2.add("Tui Treehouse");
        mPrices.add("$120 per night (up to 2 guests)");

        mImageUrls2.add("https://i.imgur.com/YFd93ZV.png");
        mNames2.add("Welcome Rock - ★★★★");
        mPrices.add("$150 per night (up to 2 guests)");

        initRecyclerView2();
    }

    private void initRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
    }

    private void initRecyclerView2() {
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerView2.setLayoutManager(layoutManager2);
        RecyclerViewAdapter2 adapter2 = new RecyclerViewAdapter2(mNames2, mPrices, mImageUrls2, this);
        recyclerView2.setAdapter(adapter2);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        android.support.v7.widget.SearchView searchView = (android.support.v7.widget.SearchView)
                MenuItemCompat.getActionView(menu.findItem(R.id.search_button));

        searchView.onActionViewExpanded();
        searchView.setFocusable(true);
        searchView.clearFocus();
        searchView.setQueryHint(" Search listings...");

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent a = new Intent(this, About.class);
                startActivity(a);
                break;

            case R.id.refer:
                Intent r = new Intent(this, Refer.class);
                startActivity(r);
                break;

            case R.id.contact:
                Intent k = new Intent(this, Contact.class);
                startActivity(k);
                break;

            case R.id.feedback:
                Intent f = new Intent(this, Feedback.class);
                startActivity(f);
                break;

            case R.id.login:
                Intent l = new Intent(this, Login.class);
                startActivity(l);

            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }


}