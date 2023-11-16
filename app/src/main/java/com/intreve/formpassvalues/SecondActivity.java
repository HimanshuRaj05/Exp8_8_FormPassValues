package com.intreve.formpassvalues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvName, tvAge, tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvName=findViewById(R.id.tvName);
        tvAge=findViewById(R.id.tvAge);
        tvAddress=findViewById(R.id.tvAddress);
        Intent intent= getIntent();
        String name=intent.getStringExtra("eName");
        String age=intent.getStringExtra("eAge");
        String address=intent.getStringExtra("eAddress");

        tvName.setText("Name: "+ name);
        tvAge.setText("Age: "+age);
        tvAddress.setText("Address: "+address);
    }
}