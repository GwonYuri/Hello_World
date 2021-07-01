package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button b1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b1=findViewById(R.id.btnBack);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack();
            }
        });

        tv1=findViewById(R.id.tvMsg);
        Intent intent=getIntent();
        String msg=intent.getStringExtra("msg");
        tv1.setText(msg);
    }
    private void callBack() {
        finish();
    }
}