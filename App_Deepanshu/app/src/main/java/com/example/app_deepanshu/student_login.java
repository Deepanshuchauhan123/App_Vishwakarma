package com.example.app_deepanshu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class student_login extends AppCompatActivity {


    //private EditText mTextAdhaar;
    //private EditText mTextPassword;
    // private Button mButtonLogin;
    private Button studentRegister;
    private Button studentlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        studentRegister = (Button) findViewById(R.id.button_register);
        studentRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(student_login.this, student_reg.class);
                startActivity(i);
            }
        });
        studentlogin = (Button) findViewById(R.id.button_login);
        studentlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(student_login.this, student_grid.class);
                startActivity(i);
            }
        });
    }
}