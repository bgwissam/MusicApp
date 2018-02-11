package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp on 2/8/2018.
 */

public class PopMusic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //numbers array
        ArrayList<Song> songs = new ArrayList<Song>();

        //list of words
        songs.add(new Song("Perfect", "Ed Sheeran"));
        songs.add(new Song("Havana", "Camila Cabello"));
        songs.add(new Song("Shape of You" , "Ed Sheeran"));
        songs.add(new Song("New Rules", "Dua Lipa"));
        songs.add(new Song("Closer", "The Chainsmoker"));
        songs.add(new Song("Too Good at Goodbyes", "Sam Smith"));
        songs.add(new Song("Attention", "Charlie Puth"));
        songs.add(new Song("Finesse", "Bruno Mars"));
        songs.add(new Song("Thunder", "Imagine Dragons"));
        songs.add(new Song("End Game", "Taylor Swift"));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);


    }
}
