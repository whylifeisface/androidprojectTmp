package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OneActivity extends AppCompatActivity {
    private Button button4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sapd);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> {
            Log.d("TAG", "onCreate: ssss");
            startActivity(new Intent(this, TwoActivity.class));
        });

    }
}
