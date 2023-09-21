package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView = null;
    private Button button = null;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                textView.setText("你点击了按钮1");
                break;
            case R.id.button2:
                textView.setText("你点击了按钮2");
                break;
            case R.id.textView:
                startActivity(new Intent(this, OneActivity.class));
                Log.d("TAG", "onClick: ocalsnaijsians");
                break;
        }
    }
//    class TextView
}