package com.sumit.masaisignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {
private Button mBtnSignup;
private Button mBtnSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnSignup = findViewById(R.id.mBtnSignup);
        mBtnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , SignUp.class);
                startActivity(intent);
            }
        });
        mBtnSignin = findViewById(R.id.mBtnSignin);
        mBtnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this , SignIn.class);
                startActivity(intent);
            }
        });
    }
}