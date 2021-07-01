package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        b1 = findViewById(R.id.btnCall);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callSecondActivity();
            }
        });
        b2 = findViewById(R.id.btnMsg);
        e1=findViewById(R.id.etMsg);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callSecondActivityWithMsg();
            }
        });
    }

    private void callSecondActivityWithMsg() {
        Intent intent =new Intent(this, SecondActivity.class);
        intent.putExtra("msg",e1.getText().toString());
        startActivity(intent);
    }

    private void callSecondActivity() {
        // 명시적 Intent
        Intent intent =new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}