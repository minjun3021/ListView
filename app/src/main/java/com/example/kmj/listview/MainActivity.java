package com.example.kmj.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listview= findViewById(R.id.listview);

        ArrayList<Item> data = new ArrayList<>();
        Item t1=new Item("List");
        Item t2=new Item("View");

        data.add(t1);
        data.add(t2);

        ListviewAdapter adapter=new ListviewAdapter(this, R.layout.item,data);
        listview.setAdapter(adapter);
    }
}
