package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et =findViewById(R.id.etYear);
    }
    public void onAAA(View view){
        //1. edittext 나이 가져오기
        String year = et.getText().toString();
        int iyear= Integer.parseInt(year);

        //2. 생년을 나이로 바꾸기
        int age = 2021 - iyear +1;

        //3. 나이를 토스트로 띄우기
        Toast.makeText(this, "당신의 나이는 " + age + "입니다.", Toast.LENGTH_SHORT).show();
    }
}