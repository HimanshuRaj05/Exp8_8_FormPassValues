package com.intreve.formpassvalues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnContinue;
    EditText etName, etAge, etAddress;
    String name, age, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContinue = findViewById(R.id.btnContinue);
        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        etAddress = findViewById(R.id.etAddress);


        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name= etName.getText().toString();
                age=etAge.getText().toString();
                address=etAddress.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("eName",name);
                intent.putExtra("eAge",age);
                intent.putExtra("eAddress",address);
                startActivity(intent);
            }
        });
    }


}