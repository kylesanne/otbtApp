package com.app.otbtapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private EditText email;
    private Button signup_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        SignupButton();
    }

    public void SignupButton() {
        name = (EditText) findViewById(R.id.editText_name);
        password = (EditText) findViewById(R.id.editText_pass);
        email = (EditText) findViewById(R.id.editText_email);
        signup_button = (Button) findViewById(R.id.button_signup);

        signup_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Signup.this, SignUpComplete.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
