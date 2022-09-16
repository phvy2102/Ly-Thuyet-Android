package com.example.chuyenmanhinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        textView.setText(name);
        textView2.setText(email);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            finish();
        });
    }
}