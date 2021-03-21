package com.example.nayaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button bt1;
    TextView txt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1=findViewById(R.id.et1);
        bt1=findViewById(R.id.bt1);
        txt1=findViewById(R.id.tx1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent= new Intent(MainActivity.this,activity_screen2.class);
                startActivity(intent);


            }
        });
    }
}