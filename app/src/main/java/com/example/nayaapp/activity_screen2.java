package com.example.nayaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_screen2 extends AppCompatActivity {

    EditText et1;
    Button bt1;
    TextView texting;
    






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

            et1= findViewById(R.id.edit1);
            bt1= findViewById(R.id.id2);
            texting=findViewById(R.id.tv3);

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT,"Kyu maza aaya, yash ka app dekh ke, aree haa naa toh bolo");
        sendIntent.setType("text/plain");


        String abc= getIntent().getStringExtra("name");
       texting.setText(abc);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });


    }
}