package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp on 2/8/2018.
 */

public class BluesMusic extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //numbers array
       ArrayList<Song> songs = new ArrayList<Song>();
        //list of words
        songs.add(new Song("Mumish Boy", "Muddy Waters"));
        songs.add(new Song("Boom Boom", "John Lee Hocker"));
        songs.add(new Song("The Thrill is gone" , "B.B. King"));
        songs.add(new Song("Call it Stormy Monday", "T-Bone Walker"));
        songs.add(new Song("I'm your Hoochie Coochie Man", "Muddy Waters"));
        songs.add(new Song("Dust My Broom", "Elmore James"));
        songs.add(new Song("Cross Roads Blues", "Robert Johnson"));
        songs.add(new Song("Boogie Chillin", "John Lee Hocker"));
        songs.add(new Song("Little Red Rooster", "The Rolling Stones"));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);

    }

}
