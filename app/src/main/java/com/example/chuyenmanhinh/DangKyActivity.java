package com.example.chuyenmanhinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DangKyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);

        Intent intent = new Intent(this, MainActivity.class);
        Button button = findViewById(R.id.button_login);
        EditText name = findViewById(R.id.textView5);
        EditText email = findViewById(R.id.textView6);
        button.setOnClickListener(v -> {
            String name_ = name.getText().toString();
            String email_ = email.getText().toString();
            intent.putExtra("name", name_);
            intent.putExtra("email", email_);
            startActivity(intent);
        });
    }
}