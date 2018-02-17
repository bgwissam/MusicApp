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
                Intent popIntent = new Intent(RapMusic.this, PopMusic.class);
                startActivity(popIntent);
            }
        });

        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(RapMusic.this, RapMusic.class);
                startActivity(rapIntent);
            }
        });

        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(RapMusic.this, JazMusic.class);
                startActivity(jazIntent);
            }
        });

        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(RapMusic.this, BluesMusic.class);
                startActivity(bluesIntent);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(RapMusic.this, CountryMusic.class);
                startActivity(countryIntent);

            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(RapMusic.this, RockMusic.class);
                startActivity(rockIntent);
            }
        });

    }

}
