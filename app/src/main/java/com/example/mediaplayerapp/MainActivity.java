package com.example.mediaplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Music> my_main_list;
private MusicAdapter musicAdapter;
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.ll);
        my_main_list=new ArrayList<>();
        my_main_list.add(new Music("Sample1","priya",R.raw.sample1));
        my_main_list.add(new Music("Sample2","riya",R.raw.sample2));
        my_main_list.add(new Music("Sample3","tina",R.raw.sample3));
        my_main_list.add(new Music("Sample4","Shreya",R.raw.sample4));
        my_main_list.add(new Music("Sample5","Kiki",R.raw.sample5));
        my_main_list.add(new Music("Sample6","Chiya",R.raw.sample6));
        MusicAdapter adapter=new MusicAdapter(this,R.layout.songs_item_list,my_main_list);
        listView.setAdapter(adapter);
    }
}