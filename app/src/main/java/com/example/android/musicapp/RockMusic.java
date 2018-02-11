package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp on 2/8/2018.
 */

public class RockMusic extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.song_list);

            //numbers array
            ArrayList<Song> songs = new ArrayList<Song>();

            //list of words
            songs.add(new Song("Bohemian Rhapsody", "Queen"));
            songs.add(new Song("Stairway to Heaven", "Led Zeppelin"));
            songs.add(new Song("Baba O'Riley" , "Free Bird"));
            songs.add(new Song("Purple Haze", "Jimi Hendrix"));
            songs.add(new Song("Satisfaction", "The Rolling Stones"));
            songs.add(new Song("Hey Jude", "The Beatles"));
            songs.add(new Song("Back In Black", "AC/DC"));
            songs.add(new Song("Smoke on the Water", "Deep Purple"));
            songs.add(new Song("Won't get Fooled Again", "The Who"));
            songs.add(new Song("Born to be Wild", "Steppenwolf"));

            SongAdapter itemsAdapter = new SongAdapter(this, songs);

            ListView listView = (ListView) findViewById(R.id.music_list_view);

            listView.setAdapter(itemsAdapter);


        }
}
