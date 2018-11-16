package com.app.otbtapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class CampingTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camping_two);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        android.support.v7.widget.SearchView searchView = (android.support.v7.widget.SearchView)
                MenuItemCompat.getActionView(menu.findItem(R.id.search_button));

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
