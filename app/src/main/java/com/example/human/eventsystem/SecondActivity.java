package com.example.human.eventsystem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
     private Button btnshow;
     private TextView txtshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button btnshow=(Button)findViewById(R.id.second_activity_button1);
        TextView txtshow=(TextView)findViewById(R.id.second_activity_textView);
        btnshow.setOnClickListener(new MyClick(txtshow));
    }
}
