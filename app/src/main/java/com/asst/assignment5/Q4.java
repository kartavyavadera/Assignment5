package com.asst.assignment5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Q4 extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        recyclerView = findViewById(R.id.q4RecyclerView);

        ArrayList<Q4Model> list = new ArrayList<Q4Model>();
        list.add(new Q4Model("Apple", R.drawable.apple));
        list.add(new Q4Model("Kiwi", R.drawable.kiwi));
        list.add(new Q4Model("Orange", R.drawable.orange));
        list.add(new Q4Model("Strawberry", R.drawable.sb));

        Q4ImgAdapter adapter = new Q4ImgAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
    }
}