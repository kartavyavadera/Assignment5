package com.asst.assignment5;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Q6_2 extends AppCompatActivity {
    TextView tvDisplayUser, tvDisplayPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6_2);

        tvDisplayUser = findViewById(R.id.tvDisplayUser);
        tvDisplayPass = findViewById(R.id.tvDisplayPass);

        tvDisplayUser.setText("Welcome " + getIntent().getStringExtra("uname"));
        tvDisplayPass.setText("Your password is:  " + getIntent().getStringExtra("pass"));
    }
}