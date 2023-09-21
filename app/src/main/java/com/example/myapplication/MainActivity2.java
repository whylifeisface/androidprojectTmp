package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView1m);
    }
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.button1m:
                textView.setText("你点击了按钮1");
                break;
            case R.id.button2m:
                textView.setText("你点击了按钮2");
                break;
            case R.id.textView1m:
                startActivity(new Intent(this, MainActivity3.class));
        }
    }


}