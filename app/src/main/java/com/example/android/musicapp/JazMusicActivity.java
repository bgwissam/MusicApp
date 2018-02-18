package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class JazMusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        //numbers array
        ArrayList<Song> songs = new ArrayList<>();

        //list of words
        songs.add(new Song("Take Five", "Dave Brubeck"));
        songs.add(new Song("Summertime", "Ella Fitzgerald"));
        songs.add(new Song("Strange Fruit", "Billie Holiday"));
        songs.add(new Song("Take the A Train", "Dave Brubeck"));
        songs.add(new Song("Body and Soul", "Coleman Hawkins"));
        songs.add(new Song("Sing, Sing, Sing", "Benny Goodman"));
        songs.add(new Song("What a Wonderful World", "Louis Armstrong"));
        songs.add(new Song("Round Midnight", "Thelonious Monk"));
        songs.add(new Song("The Girl from Ipanema", "Joao Gilberto"));
        songs.add(new Song("All Blues", "John Coltrane"));

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
                Intent popIntent = new Intent(JazMusicActivity.this, PopMusicActivity.class);
                startActivity(popIntent);
            }
        });

        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(JazMusicActivity.this, RapMusicActivity.class);
                startActivity(rapIntent);
            }
        });

        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(JazMusicActivity.this, JazMusicActivity.class);
                startActivity(jazIntent);
            }
        });

        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(JazMusicActivity.this, BluesMusicActivity.class);
                startActivity(bluesIntent);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(JazMusicActivity.this, CountryMusicActivity.class);
                startActivity(countryIntent);

            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(JazMusicActivity.this, RockMusicActivity.class);
                startActivity(rockIntent);
            }
        });

    }
}
