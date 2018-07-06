package com.example.human.eventsystem;

import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MyClick implements View.OnClickListener {
    private String s="使用外部类的方法将textview的数据显示，分别定义一个Te" +
            "xtView的显示框，一个Button按钮，定义两个私有成员相应的变量对应由ID号获取两个UI，设置一" +
            "个java类，为Button设置监听事件，函数名为java名。java内部设置构造函数初始化参数.最终使用" +
            ".setText()方法1将值传入";
    private TextView textshow;
    public MyClick(TextView txt){
        textshow=txt;
    }

    @Override
    public void onClick(View v) {
        textshow.setText(s);
        textshow.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
