package com.example.android.musicapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        TextView pop = (TextView) findViewById(R.id.pop);
        TextView rap = (TextView) findViewById(R.id.rap);
        TextView rock = (TextView) findViewById(R.id.rock);
        TextView country = (TextView) findViewById(R.id.country);
        TextView jaz = (TextView) findViewById(R.id.jaz);
        TextView blues = (TextView) findViewById(R.id.blues);
        TextView Test = (TextView) findViewById(R.id.test_sound);
        Button Check = (Button) findViewById(R.id.Search);



        pop.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the pop music list
            @Override
            public void onClick (View view){
                Intent popIntent = new Intent(MainActivity.this, PopMusic.class);
                startActivity(popIntent);
            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick (View view){
                Intent rockIntent = new Intent(MainActivity.this, RockMusic.class);
                startActivity(rockIntent);
            }
        });

        jaz.setOnClickListener(new View.OnClickListener(){
            //this will open upon clicking Jaz music List
            @Override
            public void onClick (View view){
                Intent jazIntent = new Intent(MainActivity.this, JazMusic.class);
                startActivity(jazIntent);
            }
        });

        rap.setOnClickListener(new View.OnClickListener(){
            //this will open upon clicking the Rap music list
            @Override
            public void onClick (View view){
                Intent rapIntent = new Intent(MainActivity.this, RapMusic.class);
                startActivity(rapIntent);

            }
        });

        blues.setOnClickListener(new View.OnClickListener(){
            //this will open upon clicking the Blues music list
            @Override
            public void onClick (View view){
                Intent bluesIntent = new Intent(MainActivity.this, BluesMusic.class);
                startActivity(bluesIntent);

            }
        });

        country.setOnClickListener(new View.OnClickListener(){
            //this will open upond clicking the Country music list
            @Override
            public void onClick (View view){
                Intent countryIntent = new Intent(MainActivity.this, CountryMusic.class);
                startActivity(countryIntent);

            }
        });
        Test.setOnClickListener(new View.OnClickListener(){
            //this will open upond clicking the Country music list
            @Override
            public void onClick (View view){
                Intent testsound = new Intent(MainActivity.this, TestSound.class);
                startActivity(testsound);

            }
        });

        Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent checkSong = new Intent(MainActivity.this, SearchBar.class);
                startActivity(checkSong);
            }
        });

    }

}
