package com.example.app_deepanshu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teacher_grid extends AppCompatActivity {
private Button assigment;
    private Button report;
    private Button upload;
    private Button student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_grid);


        assigment = (Button) findViewById(R.id.teacher_self);
        assigment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(teacher_grid.this, teacher_self_grid.class);
                startActivity(i);
            }
        });
        report = (Button) findViewById(R.id.btn2);
        report.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(teacher_grid.this, teacher_upload.class);
                startActivity(i);
            }
        });
        upload = (Button) findViewById(R.id.btn3);
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(teacher_grid.this, deo_update.class);
                startActivity(i);
            }
        });
        student = (Button) findViewById(R.id.btn4);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(teacher_grid.this, Report_teacher.class);
                startActivity(i);
            }
        });
    }
}
