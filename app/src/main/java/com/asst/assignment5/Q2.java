package com.asst.assignment5;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class Q2 extends AppCompatActivity {
    GridView simpleGrid;
    int logos[] = {R.drawable.india, R.drawable.usa, R.drawable.uk, R.drawable.canada};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        simpleGrid = findViewById(R.id.simpleGrid);
        Q2BaseAdapter adapter = new Q2BaseAdapter(getApplicationContext(), logos);
        simpleGrid.setAdapter(adapter);

    }
}