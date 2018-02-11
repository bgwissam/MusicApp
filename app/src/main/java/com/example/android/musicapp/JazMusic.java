package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp on 2/8/2018.
 */

public class JazMusic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //numbers array
        ArrayList<Song> songs = new ArrayList<Song>();

        //list of words
        songs.add(new Song("Take Five", "Dave Brubeck"));
        songs.add(new Song("Summertime", "Ella Fitzgerald"));
        songs.add(new Song("Strange Fruit" , "Billie Holiday"));
        songs.add(new Song("Take the A Train", "Dave Brubeck"));
        songs.add(new Song("Body and Soul", "Coleman Hawkins"));
        songs.add(new Song("Sing, Sing, Sing", "Benny Goodman"));
        songs.add(new Song("What a Wonderful World", "Louis Armstrong"));
        songs.add(new Song("Round Midnight", "Thelonious Monk"));
        songs.add(new Song("The Girl from Ipanema", "Joao Gilberto"));
        songs.add(new Song("All Blues", "John Coltrane"));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);


    }
}
