package com.cse.cet.csupport;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.

        final EditText user = (EditText) findViewById(R.id.username);
        final EditText pass = (EditText) findViewById(R.id.password);
        Button login = (Button) findViewById(R.id.loginButton);

        login.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                if (user.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Enter Username",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    if (pass.getText().toString().equals("ajoyforcs")) {

                        Toast.makeText(getApplicationContext(), "Successful Login!",
                                Toast.LENGTH_LONG).show();

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                                Intent mainIntent = new Intent(LoginActivity.this, loggedInActivity.class);
                                LoginActivity.this.startActivity(mainIntent);
                                LoginActivity.this.finish();
                                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                            }
                        }, 100);


                    } else {
                        Toast.makeText(getApplicationContext(), "Incorrect Password!",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }


}

