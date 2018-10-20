package com.example.tuturu.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String[] arrName = {"Samsung","Sony","Apple","LG","Motorola","HTC","Acer",
//                            "Lenovo","Oppo","Nokia","BlackBerry","Huawei","ZTE",
//                            "Meizu","HP","Asus","Panasonic"};
//
//        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrName);
        ArrayList list = new ArrayList();
        list.add(new Phone("Galaxy S4", "Samsung"));
        list.add(new Phone("Galaxy S3", "Samsung"));
        list.add(new Phone("Galaxy Mega", "Samsung"));
        list.add(new Phone("Galaxy Note", "Samsung"));
        list.add(new Phone("Iphone", "Apple"));
        list.add(new Phone("HTC One", "HTC"));
        list.add(new Phone("Nexus 5", "LG"));
        list.add(new Phone("Nexus 4", "LG"));
        list.add(new Phone("LG G2", "LG"));
        list.add(new Phone("Moto x", "Motorola"));

        ListAdapter adapter = new ListAdapter(this, list);

        ListView listView = (ListView)findViewById(R.id.id_list);
        listView.setAdapter(adapter);
    }
}
