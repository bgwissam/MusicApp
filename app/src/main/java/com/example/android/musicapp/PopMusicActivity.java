package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class PopMusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        //numbers array
        ArrayList<Song> songs = new ArrayList<>();
        //list of words
        songs.add(new Song("Perfect", "Ed Sheeran"));
        songs.add(new Song("Havana", "Camila Cabello"));
        songs.add(new Song("Shape of You", "Ed Sheeran"));
        songs.add(new Song("New Rules", "Dua Lipa"));
        songs.add(new Song("Closer", "The Chainsmoker"));
        songs.add(new Song("Too Good at Goodbyes", "Sam Smith"));
        songs.add(new Song("Attention", "Charlie Puth"));
        songs.add(new Song("Finesse", "Bruno Mars"));
        songs.add(new Song("Thunder", "Imagine Dragons"));
        songs.add(new Song("End Game", "Taylor Swift"));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);

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
                Intent mainIntent = new Intent(PopMusicActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the pop music list
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(PopMusicActivity.this, PopMusicActivity.class);
                startActivity(popIntent);
            }
        });
        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(PopMusicActivity.this, RapMusicActivity.class);
                startActivity(rapIntent);
            }
        });
        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(PopMusicActivity.this, JazMusicActivity.class);
                startActivity(jazIntent);
            }
        });
        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(PopMusicActivity.this, BluesMusicActivity.class);
                startActivity(bluesIntent);
            }
        });
        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(PopMusicActivity.this, CountryMusicActivity.class);
                startActivity(countryIntent);

            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(PopMusicActivity.this, RockMusicActivity.class);
                startActivity(rockIntent);
            }
        });
    }
}
