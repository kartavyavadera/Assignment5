package com.asst.assignment5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Q5 extends AppCompatActivity {
    TextView tvque5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        tvque5 = findViewById(R.id.tvque5);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.q5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.maths:
            case R.id.ds:
            case R.id.logout:
                tvque5.setText("You have selected " + item);
                break;
            case R.id.sub1:
            case R.id.sub2:
            case R.id.sub3:
                tvque5.setText("You have selected " + item + " from Java submenu");
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}