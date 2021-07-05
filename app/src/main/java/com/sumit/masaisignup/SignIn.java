package com.sumit.masaisignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {
   private EditText editTextTextPersonName;
    //private EditText mEtEmail;
    private EditText editTextTextPersonName3;
    private Button button;
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initViews();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUserNameValid = isUserNameValid();
                boolean isPasswordValid = isPasswordValid();
               // boolean isEmailValid = isEmailValid();
                if (isUserNameValid && isPasswordValid) {
                    Intent intent = new Intent(SignIn.this, Home.class);
                   intent.putExtra("username",editTextTextPersonName.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private void initViews() {
       editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        //mEtEmail = findViewById(R.id.mEtEmail);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        button = findViewById(R.id.button);

    }

    private boolean isUserNameValid() {
        if (editTextTextPersonName.getText().toString().matches(emailValidation)) {
            return true;
        } else {
            editTextTextPersonName.setError("Invalid email");
            return false;
        }
    }

    private boolean isPasswordValid() {
        if (editTextTextPersonName3.getText().toString().length() >= 6) {
            return true;
        } else {
            editTextTextPersonName3.setError("Password length is less than 6 characters");
            return false;
        }
    }
}
