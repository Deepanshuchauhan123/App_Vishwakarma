package com.example.app_deepanshu;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button mButtonhealth;
    private Button mButtoneducation;
    private Button mButtonAdmin;
 /*  private FirebaseDatabase database = FirebaseDatabase.getInstance();
      private   DatabaseReference myRef = database.getReference();
      myRef.setValue("Hello, World!");*/
    //  private  DatabaseReferene mchild=mRootReference.child("message");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mButtonLogin =(Button)findViewById(R.id.button_login);
        mButtonhealth = (Button) findViewById(R.id.button_health);
        mButtonhealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, health_cat.class);
                startActivity(i);

            }
        });
        mButtoneducation = (Button) findViewById(R.id.button_education);
        mButtoneducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, edu_start.class);
                startActivity(i);

            }
        });
        mButtonAdmin = (Button) findViewById(R.id.button_duty);
        mButtonAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, admin_chart.class);
                startActivity(i);

            }
        });
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//        myRef.setValue("Hello, World!");
    }
    // Write a message to the database

}



