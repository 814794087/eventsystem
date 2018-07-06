package com.example.human.eventsystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;

public class FourthActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_layout);
        Button FourthActivityButton=(Button)findViewById(R.id.fourth_activity_button1);
        FourthActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"活动本身继承实现了点击事件，我们直接在" +
                "下方的代码区域中直接重写点击事件应用就可以了",Toast.LENGTH_SHORT).show();
    }
}
