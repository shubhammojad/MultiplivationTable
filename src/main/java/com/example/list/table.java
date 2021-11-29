package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

import static com.example.list.MainActivity.MESSAGE_KEY;

public class table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);

        int s1 = Integer.parseInt(message);


        ListView listView2 = findViewById(R.id.list2);
        final ArrayList<String> Grocery2 = new ArrayList<>();

        for(int i=1;i<11;i++){
            int j = s1 * i ;
            String ans  = String.valueOf(j);
            String data = s1 + " * "+ i +" = " + ans;
            Grocery2.add(data);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Grocery2);
        listView2.setAdapter(arrayAdapter);
    }
}