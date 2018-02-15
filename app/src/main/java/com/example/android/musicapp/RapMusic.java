package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp on 2/8/2018.
 */

public class RapMusic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //numbers array
        ArrayList<Song> songs = new ArrayList<Song>();

        //list of words
        songs.add(new Song("God's Plan", "Drake"));
        songs.add(new Song("Bodak Yellow", "Cardi B"));
        songs.add(new Song("DNA", "Kendrick Lamar"));
        songs.add(new Song("Rockstar", "Post Malone"));
        songs.add(new Song("Unforgettable", "Frensh Montana"));
        songs.add(new Song("Icon", "Jadon Smith"));
        songs.add(new Song("Gucci Gang", "Lil Pump"));
        songs.add(new Song("No Limit", "G-Easy"));
        songs.add(new Song("Mask Off", "Future"));
        songs.add(new Song("Bank Account", "21 Savage"));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);


    }

}
