package com.example.app_deepanshu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class first_cat extends AppCompatActivity {


    //private EditText mTextAdhaar;
    //private EditText mTextPassword;
    // private Button mButtonLogin;
    private Button mButtonRegister;
    private Button grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_cat);
        //mTextAdhaar =(EditText)findViewById(R.id.edittext_adhaar);
        //mTextPassword =(EditText)findViewById(R.id.edittext_password);
        //mButtonLogin =(Button)findViewById(R.id.button_login);


        mButtonRegister = (Button) findViewById(R.id.button_register1);
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(first_cat.this, teacher_reg.class);
                startActivity(i);

            }
        });
        grid = (Button) findViewById(R.id.button_login);
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(first_cat.this, teacher_grid.class);
                startActivity(i);

            }
        });
    }
}


      /* spinner = findViewById(R.id.spinner);
        List<String> categories = new ArrayList<>();
        categories.add(0,"Updater/Admin");
        categories.add("Hospital");
        categories.add("School");

        ArrayAdapter<String> dataAdapter;
        dataAdapter =new ArrayAdapter(this, android.R.layout.simple_spinner_item,categories);

        //Dropdown layout style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                if(parent.getItemAtPosition(position).equals("Updater/Admin"))
                {

                }
                else
                {
                    //on selecting a spinner item
                    String item=parent.getItemAtPosition(position).toString();
                    // show selected spinner item
                    Toast.makeText(parent.getContext(),"Selected: "+item, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //this is for action on selected item yup
            }
        });*/



