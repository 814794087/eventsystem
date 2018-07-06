package com.example.human.eventsystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button firstactivitybutton=(Button)findViewById(R.id.firt_activity_button1);
        firstactivitybutton.setOnClickListener(new ButtonClickListener());
    }
    class ButtonClickListener implements View.OnClickListener{

        String a="此按钮使用内部类实现的方式，在按钮监听事件设置时，只传入了一个函数，此函数实现了点击" +
                "监听事件，并将点击事件重写";
        @Override
        public void onClick(View v) {
            Toast.makeText(FirstActivity.this,a,Toast.LENGTH_SHORT).show();
        }
    }
}
