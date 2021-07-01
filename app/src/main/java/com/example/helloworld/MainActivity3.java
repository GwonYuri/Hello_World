package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;
    TextView t1;
    TextView t2;
    TextView t3;
    CheckBox c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et1 =findViewById(R.id.etMenu1);
        et2 =findViewById(R.id.etMenu2);
        et3 =findViewById(R.id.etMenu3);
        t1= findViewById(R.id.txtCount);
        t2= findViewById(R.id.txtDiscount);
        t3= findViewById(R.id.txtPrice);
        c1= findViewById(R.id.isCheck);
    }
    public void onBBB(View view){
        String menu1 = et1.getText().toString();
        int iMenu1= Integer.parseInt(menu1);

        String menu2 = et2.getText().toString();
        int iMenu2= Integer.parseInt(menu2);

        String menu3 = et3.getText().toString();
        int iMenu3= Integer.parseInt(menu3);

        int count = iMenu1+iMenu2+iMenu3;
        double discount_price;
        double total_price;
        if (c1.isChecked()){
            discount_price=(1000*iMenu1 + 1500*iMenu2 + 1700*iMenu3)*0.1;
            total_price = (1000*iMenu1 + 1500*iMenu2 + 1700*iMenu3)*0.9;
        }
        else{
            discount_price=0;
            total_price = (1000*iMenu1 + 1500*iMenu2 + 1700*iMenu3);
        }

        t1.setText("주문개수 : " + count + "개");
        t2.setText("할인금액 : " + discount_price + "원");
        t3.setText("결제금액 : " + total_price + "원");
    }
}