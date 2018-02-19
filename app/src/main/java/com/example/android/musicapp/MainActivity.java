package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the content of the activity to use the activity_main.xml layout file
        TextView pop = findViewById(R.id.pop);
        TextView rap = findViewById(R.id.rap);
        TextView rock = findViewById(R.id.rock);
        TextView country = findViewById(R.id.country);
        TextView jaz = findViewById(R.id.jaz);
        TextView blues = findViewById(R.id.blues);
        Button Check = findViewById(R.id.search_button);

        pop.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the pop music list
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PopMusicActivity.class);
                startActivity(popIntent);
            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking on the Rock music list
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockMusicActivity.class);
                startActivity(rockIntent);
            }
        });
        jaz.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking Jaz music List
            @Override
            public void onClick(View view) {
                Intent jazIntent = new Intent(MainActivity.this, JazMusicActivity.class);
                startActivity(jazIntent);
            }
        });
        rap.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Rap music list
            @Override
            public void onClick(View view) {
                Intent rapIntent = new Intent(MainActivity.this, RapMusicActivity.class);
                startActivity(rapIntent);

            }
        });
        blues.setOnClickListener(new View.OnClickListener() {
            //this will open upon clicking the Blues music list
            @Override
            public void onClick(View view) {
                Intent bluesIntent = new Intent(MainActivity.this, BluesMusicActivity.class);
                startActivity(bluesIntent);

            }
        });
        country.setOnClickListener(new View.OnClickListener() {
            //this will open upond clicking the Country music list
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(MainActivity.this, CountryMusicActivity.class);
                startActivity(countryIntent);

            }
        });
        //Will take the input for searching for a song or artist
        final EditText sendValue = findViewById(R.id.search_edit_text);

        Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent checkSong = new Intent(MainActivity.this, SearchBarActivity.class);
                checkSong.putExtra("editTextValue", sendValue.getText().toString());
                startActivity(checkSong);
            }
        });
    }
}
