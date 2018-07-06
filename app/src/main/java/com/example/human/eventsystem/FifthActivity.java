package com.example.human.eventsystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FifthActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_layout);
    }
    public void Clickyourself(View source){
        Toast.makeText(FifthActivity.this, "直接使用绑定标签的方法实现，点击事件只被" +
                "在活动中写成了一个普通的类，我们在相应的xml代码中，使用 android：on" +
                "Click=“函数名”的方式进行引用实现", Toast.LENGTH_SHORT).show();
    }
}
