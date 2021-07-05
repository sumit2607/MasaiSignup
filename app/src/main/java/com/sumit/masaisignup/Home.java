package com.sumit.masaisignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {
private TextView textView11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textView11 = (TextView)findViewById(R.id.textView11);

        textView11.setText(getIntent().getStringExtra("mytext"));
        textView11.setText(getIntent().getStringExtra("username"));
    }
}