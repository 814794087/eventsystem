package com.example.human.eventsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MBEPMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mbepmain_layout);
        Button buttonMbepmainActicvity1=(Button)findViewById(R.id.mbepmain_button1);
        buttonMbepmainActicvity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MBEPMainActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });
        Button buttonMbepmainActicvity2=(Button)findViewById(R.id.mbepmain_button2);
        buttonMbepmainActicvity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MBEPMainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        Button buttonMbepmainActicvity3=(Button)findViewById(R.id.mbepmain_button3);
        buttonMbepmainActicvity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MBEPMainActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
        Button buttonMbepmainActicvity4=(Button)findViewById(R.id.mbepmain_button4);
        buttonMbepmainActicvity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MBEPMainActivity.this,FourthActivity.class);
                startActivity(intent);
            }
        });
        Button buttonMbepmainActicvity5=(Button)findViewById(R.id.mbepmain_button5);
        buttonMbepmainActicvity5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MBEPMainActivity.this,FifthActivity.class);
                startActivity(intent);
            }
        });
    }
}
