package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;



public class CountryMusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        //numbers array
        ArrayList<Song> songs = new ArrayList<>();

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
                Intent mainIntent = new Intent(CountryMusicActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the pop music list
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(CountryMusicActivity.this, PopMusicActivity.class);
                startActivity(popIntent);
            }
        });

        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(CountryMusicActivity.this, RapMusicActivity.class);
                startActivity(rapIntent);
            }
        });

        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(CountryMusicActivity.this, JazMusicActivity.class);
                startActivity(jazIntent);
            }
        });

        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(CountryMusicActivity.this, BluesMusicActivity.class);
                startActivity(bluesIntent);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(CountryMusicActivity.this, CountryMusicActivity.class);
                startActivity(countryIntent);

            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(CountryMusicActivity.this, RockMusicActivity.class);
                startActivity(rockIntent);
            }
        });

    }
}
