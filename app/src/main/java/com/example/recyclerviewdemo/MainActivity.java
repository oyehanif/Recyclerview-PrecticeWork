package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.HorizontalScrollView;

import com.example.recyclerviewdemo.Adapters.wAdapter;
import com.example.recyclerviewdemo.modals.modalClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<modalClass> list = new ArrayList<>();


        list.add(new modalClass(R.drawable.hanif,"Hanif" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.programmer,"Sabbir" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.m1,"Kamran" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.m2,"Saif" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.m3,"Gullo" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.m4,"deepak" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.m2,"jignesh" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.programmer,"Juned" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.m1,"farhan" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.m2,"aman" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.m3,"tofik" , "Hey! How are You!"));
        list.add(new modalClass(R.drawable.m4,"soheb" , "Hey! How are You!"));

        wAdapter adapter = new wAdapter(list,this);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
    }

}