package com.example.productrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginBtn = (MaterialButton) findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("") || password.getText().toString().equals("")){
                    Toast.makeText(Login.this, "Username and Password not blank!!!", Toast.LENGTH_SHORT).show();
                }else if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(Login.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, ListProduct.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(Login.this, "LOGIN FAIL!!!", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}