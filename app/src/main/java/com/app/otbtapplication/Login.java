package com.app.otbtapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private  EditText username;
    private  EditText password;
    private  TextView attempt;
    private  Button login_button;
    int attempt_counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
    }

    public void LoginButton() {
        username = (EditText) findViewById(R.id.editText_user);
        password = (EditText) findViewById(R.id.editText_password);
        login_button = (Button) findViewById(R.id.button_login);

        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (username.getText().toString().equals("user") &&
                        password.getText().toString().equals("pass")){
                            Toast.makeText(Login.this, "Username and password is correct",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Login.this, User.class);
                            startActivity(intent);

                        }
                        else{
                            Toast.makeText(Login.this, "Username and password is NOT correct",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent a = new Intent(this, About.class);
                startActivity(a);

            case R.id.refer:
                Intent r = new Intent(this, Refer.class);
                startActivity(r);

            case R.id.contact:
                Intent k = new Intent(this, Contact.class);
                startActivity(k);

            case R.id.feedback:
                Intent f = new Intent(this, Feedback.class);
                startActivity(f);

            case R.id.login:
                Intent l = new Intent(this, Login.class);
                startActivity(l);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}