package com.example.app_deepanshu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class parents_login extends AppCompatActivity {
    private Button parentreg;
    private Button parentsgrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents_login);
        parentreg = (Button) findViewById(R.id.button_register);
        parentreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(parents_login.this, parents_reg.class);
                startActivity(i);
            }
        });
        parentsgrid = (Button) findViewById(R.id.button_login);
        parentsgrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(parents_login.this, parents_grid.class);
                startActivity(i);
            }
        });
    }
}
