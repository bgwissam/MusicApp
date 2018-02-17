package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2/8/2018.
 */

public class BluesMusic extends AppCompatActivity {
    //numbers array
    public static ArrayList<Song> songs = new ArrayList<Song>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        //list of words
        songs.add(new Song("Mumish Boy", "Muddy Waters"));
        songs.add(new Song("Boom Boom", "John Lee Hocker"));
        songs.add(new Song("The Thrill is gone", "B.B. King"));
        songs.add(new Song("Call it Stormy Monday", "T-Bone Walker"));
        songs.add(new Song("I'm your Hoochie Coochie Man", "Muddy Waters"));
        songs.add(new Song("Dust My Broom", "Elmore James"));
        songs.add(new Song("Cross Roads Blues", "Robert Johnson"));
        songs.add(new Song("Boogie Chillin", "John Lee Hocker"));
        songs.add(new Song("Little Red Rooster", "The Rolling Stones"));

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
                Intent popIntent = new Intent(BluesMusic.this, PopMusic.class);
                startActivity(popIntent);
            }
        });

        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(BluesMusic.this, RapMusic.class);
                startActivity(rapIntent);
            }
        });

        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(BluesMusic.this, JazMusic.class);
                startActivity(jazIntent);
            }
        });

        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(BluesMusic.this, BluesMusic.class);
                startActivity(bluesIntent);
            }
        });

        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(BluesMusic.this, CountryMusic.class);
                startActivity(countryIntent);

            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(BluesMusic.this, RockMusic.class);
                startActivity(rockIntent);
            }
        });



    }
    //set the array llist value
    public void setArrayList(ArrayList<Song> songs){
        this.songs = songs;
    }
    //get the array list value
    public ArrayList<Song> getBluesSongs(){
        return songs;
    }

}