package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp on 2/8/2018.
 */

public class CountryMusic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //numbers array
        ArrayList<Song> songs = new ArrayList<Song>();

        //list of words
        songs.add(new Song("losing Sleep", "Chris Young"));
        songs.add(new Song("Written in the Sand", "Old Dominion"));
        songs.add(new Song("Tennessee Whiskey", "Chris Stapleton"));
        songs.add(new Song("Body Like a Back Road", "All on Me"));
        songs.add(new Song("The Dance", "Garth Brooks"));
        songs.add(new Song("Broken Halos", "Chris Stepleton"));
        songs.add(new Song("Greatest Love Story", "Lanco"));
        songs.add(new Song("All on Me", "Devin Dawson"));
        songs.add(new Song("The Long Way", "Brett Eldredge"));
        songs.add(new Song("You Broke Up with Me", "Walker Hayes"));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);


    }
}
