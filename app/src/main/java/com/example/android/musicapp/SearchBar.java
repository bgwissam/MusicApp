package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2/10/2018.
 */

public class SearchBar extends AppCompatActivity {

    EditText search;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);

        //obtain the text from the text box
        search = findViewById(R.id.search_edit_text);
        search.setText(getIntent().getStringExtra("editTextValue"));

        String findSong = search.getText().toString();


        BluesMusic bluesSongs = new BluesMusic();
        ArrayList<Song> allsongs = null;

        allsongs = bluesSongs.getBluesSongs();
        ArrayList<Song> foundSong = new ArrayList<Song>();


        //the loop will search for the matching song within the array
        for (int i = 0; i < allsongs.size(); i++) {
            String songName = allsongs.get(i).toString();
            if (findSong == songName) {
                Log.i("Song Name: ", songName);
                foundSong.add(new Song("Song Name ", songName));
                SongAdapter foundItem = new SongAdapter(this, foundSong);

                ListView listView = (ListView) findViewById(R.id.search_view);

                listView.setAdapter(foundItem);
            } else {
                TextView notFound = findViewById(R.id.song_name);
                notFound.setText("The song you requested doesn't exist in our library.");
            }
        }

    }
}