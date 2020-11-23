package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    TextView forgotPassword;
    Button loginButton;
//    Way 1
//    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.login_email_input);
        password = findViewById(R.id.login_password_input);
        forgotPassword = findViewById(R.id.forgot_password_text);
        loginButton = findViewById(R.id.btn_login);
        String emailValue= email.getText().toString().trim();
        String passwordValue = password.getText().toString().trim();

//        context = LoginActivity.this;

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent will take two arguments
//             1st param   Current classname/fragment==context,2nd param destination class/fragment
//                Intent intent=new Intent(context,MainActivity.class);
//                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
//                startActivity takes intent as a param
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Log.d("info",emailValue+passwordValue);
                    Toast.makeText(LoginActivity.this,emailValue+passwordValue,Toast.LENGTH_LONG).show();
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });


    }
}