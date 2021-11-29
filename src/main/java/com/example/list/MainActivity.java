package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView message_text;

    public final static String MESSAGE_KEY ="com.example.list.message_key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);
        final ArrayList<String>Grocery = new ArrayList<>();

        for(int i=0;i<20;i++){
            String s = String.valueOf(i);
            Grocery.add(s);
        }


        /*Grocery.add("Rice");
        Grocery.add("wheat flour");
        Grocery.add("sugar");
        Grocery.add("tea powder");
        Grocery.add("apples");*/

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Grocery);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                //String list ="List :-"+position +" -"+ ((TextView)view).getText().toString();
                //Toast.makeText(MainActivity.this,list,Toast.LENGTH_SHORT).show();


                String message = ((TextView)view).getText().toString() ;

                Intent intent= new Intent(MainActivity.this ,table.class);

                intent.putExtra(MESSAGE_KEY,message);

                startActivity(intent);
            }
        });

}}