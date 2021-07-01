package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.layout);

        textView =findViewById(R.id.txtCount);
    }

    public void onToastClick(View view) {

        // 메시지박스 띄우기
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }
    public void onCountClick(View view) {

        //count++ 하면서 textview에 보이
        int count = Integer.parseInt(textView.getText().toString());
        textView.setText(count + "");
    }
}