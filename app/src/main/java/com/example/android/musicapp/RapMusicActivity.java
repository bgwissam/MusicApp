package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RapMusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        //numbers array
        ArrayList<Song> songs = new ArrayList<>();

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

        ListView listView = findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);

        TextView pop = findViewById(R.id.pop);
        TextView rap = findViewById(R.id.rap);
        TextView rock = findViewById(R.id.rock);
        TextView country = findViewById(R.id.country);
        TextView jaz = findViewById(R.id.jaz);
        TextView blues = findViewById(R.id.blues);

        pop.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the pop music list
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(RapMusicActivity.this, PopMusicActivity.class);
                startActivity(popIntent);
            }
        });

        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(RapMusicActivity.this, RapMusicActivity.class);
                startActivity(rapIntent);
            }
        });

        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(RapMusicActivity.this, JazMusicActivity.class);
                startActivity(jazIntent);
            }
        });

        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(RapMusicActivity.this, BluesMusicActivity.class);
                startActivity(bluesIntent);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(RapMusicActivity.this, CountryMusicActivity.class);
                startActivity(countryIntent);

            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(RapMusicActivity.this, RockMusicActivity.class);
                startActivity(rockIntent);
            }
        });

    }

}
