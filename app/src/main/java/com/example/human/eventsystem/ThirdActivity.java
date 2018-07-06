package com.example.human.eventsystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        final Button ThirdActivityButton=(Button)findViewById(R.id.third_activity_button1);
        ThirdActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this,"直接使用匿名内部类实现的" +
                        "方式进行操作，不需要额外的设置活动内部类或单创建一个java类去实现相应的点击监" +
                        "听事件",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
