package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 2/8/2018.
 */

public class RockMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //numbers array
        ArrayList<Song> songs = new ArrayList<Song>();

        //list of words
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

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);

        TextView pop = (TextView) findViewById(R.id.pop);
        TextView rap = (TextView) findViewById(R.id.rap);
        TextView rock = (TextView) findViewById(R.id.rock);
        TextView country = (TextView) findViewById(R.id.country);
        TextView jaz = (TextView) findViewById(R.id.jaz);
        TextView blues = (TextView) findViewById(R.id.blues);

        pop.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the pop music list
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(RockMusic.this, PopMusic.class);
                startActivity(popIntent);
            }
        });

        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(RockMusic.this, RapMusic.class);
                startActivity(rapIntent);
            }
        });

        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(RockMusic.this, JazMusic.class);
                startActivity(jazIntent);
            }
        });

        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(RockMusic.this, BluesMusic.class);
                startActivity(bluesIntent);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(RockMusic.this, CountryMusic.class);
                startActivity(countryIntent);

            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(RockMusic.this, RockMusic.class);
                startActivity(rockIntent);
            }
        });
    }
}
