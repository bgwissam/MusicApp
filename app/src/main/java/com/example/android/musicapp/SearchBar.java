package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2/10/2018.
 */

public class SearchBar extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);

    BluesMusic blues = new BluesMusic();
    List<String> allsongs = new ArrayList<String>();
    blues.getClass();
    
    }
}