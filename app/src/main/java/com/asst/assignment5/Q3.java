package com.asst.assignment5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class Q3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
    Spinner sp;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        sp = findViewById(R.id.sp);
        iv = findViewById(R.id.iv);
        sp.setOnItemSelectedListener(this);
        List<String> country = new ArrayList<>();
        country.add("Select Item");
        country.add("India");
        country.add("USA");
        country.add("Canada");
        country.add("UK");

        ArrayAdapter<String> arrAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, country);
        sp.setAdapter(arrAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (parent.getItemAtPosition(position).toString()) {
            case "Select Item":
                Toast.makeText(parent.getContext(), "Selected Item", Toast.LENGTH_SHORT).show();
                break;
            case "India":
                iv.setImageResource(R.drawable.india);
                break;
            case "USA":
                iv.setImageResource(R.drawable.usa);
                break;
            case "Canada":
                iv.setImageResource(R.drawable.canada);
                break;
            case "UK":
                iv.setImageResource(R.drawable.uk);
                break;
            default:
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}