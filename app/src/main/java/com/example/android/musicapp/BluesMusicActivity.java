package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 2/8/2018.
 */

public class BluesMusicActivity extends AppCompatActivity {
    //Array list that will hold the song and artist name
    public static ArrayList<Song> songs = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        //list of words
        createSongList();

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.music_list_view);

        listView.setAdapter(itemsAdapter);
        //these text views will implement listners to open other activities in the app
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
                Intent mainIntent = new Intent(BluesMusicActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        pop.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the pop music list
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(BluesMusicActivity.this, PopMusicActivity.class);
                startActivity(popIntent);
            }
        });
        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(BluesMusicActivity.this, RapMusicActivity.class);
                startActivity(rapIntent);
            }
        });
        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(BluesMusicActivity.this, JazMusicActivity.class);
                startActivity(jazIntent);
            }
        });
        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(BluesMusicActivity.this, BluesMusicActivity.class);
                startActivity(bluesIntent);
            }
        });
        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(BluesMusicActivity.this, CountryMusicActivity.class);
                startActivity(countryIntent);

            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(BluesMusicActivity.this, RockMusicActivity.class);
                startActivity(rockIntent);
            }
        });
    }
    public void createSongList (){

        songs.add(new Song("Mumish Boy", "Muddy Waters"));
        songs.add(new Song("Boom Boom", "John Lee Hocker"));
        songs.add(new Song("The Thrill is gone", "B.B. King"));
        songs.add(new Song("Call it Stormy Monday", "T-Bone Walker"));
        songs.add(new Song("I'm your Hoochie Coochie Man", "Muddy Waters"));
        songs.add(new Song("Dust My Broom", "Elmore James"));
        songs.add(new Song("Cross Roads Blues", "Robert Johnson"));
        songs.add(new Song("Boogie Chillin", "John Lee Hocker"));
        songs.add(new Song("Little Red Rooster", "The Rolling Stones"));

    }

    //get the array list value
    public ArrayList<Song> getBluesSongs(){
        createSongList();

        return songs;
    }

}