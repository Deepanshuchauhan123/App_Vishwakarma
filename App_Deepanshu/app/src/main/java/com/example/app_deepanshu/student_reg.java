package com.example.app_deepanshu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class student_reg extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    private Object AdapterView;
    Spinner spinner1;
    private Object AdapterView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_reg);

        spinner = findViewById(R.id.spinner_class);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(student_reg.this, R.array.classes, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter1);
        spinner.setOnItemSelectedListener(student_reg.this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        // show selected spinner item

       // Toast.makeText(parent.getContext(), "\n" +"वर्ग : " + item, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
