package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class RockMusicActivity extends AppCompatActivity {
    //numbers array
    ArrayList<Song> songs = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        //list of words
        createSongList();

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);
        //Will implement the listeners that will allow layout navigations
        TextView pop = findViewById(R.id.pop);
        TextView rap = findViewById(R.id.rap);
        TextView rock = findViewById(R.id.rock);
        TextView country = findViewById(R.id.country);
        TextView jaz = findViewById(R.id.jaz);
        TextView blues = findViewById(R.id.blues);
        Button home = findViewById(R.id.home_view);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent = new Intent(RockMusicActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the pop music list
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(RockMusicActivity.this, PopMusicActivity.class);
                startActivity(popIntent);
            }
        });
        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(RockMusicActivity.this, RapMusicActivity.class);
                startActivity(rapIntent);
            }
        });
        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(RockMusicActivity.this, JazMusicActivity.class);
                startActivity(jazIntent);
            }
        });
        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(RockMusicActivity.this, BluesMusicActivity.class);
                startActivity(bluesIntent);
            }
        });
        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(RockMusicActivity.this, CountryMusicActivity.class);
                startActivity(countryIntent);

            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(RockMusicActivity.this, RockMusicActivity.class);
                startActivity(rockIntent);
            }
        });
    }
    public void createSongList(){
        songs.add(new Song("Bohemian Rhapsody", "Queen"));
        songs.add(new Song("Stairway to Heaven", "Led Zeppelin"));
        songs.add(new Song("Baba O'Riley", "Free Bird"));
        songs.add(new Song("Purple Haze", "Jimi Hendrix"));
        songs.add(new Song("Satisfaction", "The Rolling Stones"));
        songs.add(new Song("Hey Jude", "The Beatles"));
        songs.add(new Song("Back In Black", "AC/DC"));
        songs.add(new Song("Smoke on the Water", "Deep Purple"));
        songs.add(new Song("Won't get Fooled Again", "The Who"));
        songs.add(new Song("Born to be Wild", "Steppenwolf"));
    }
    //get the array list value
    public ArrayList<Song> getRockSongs(){
        createSongList();

        return songs;
    }
}
