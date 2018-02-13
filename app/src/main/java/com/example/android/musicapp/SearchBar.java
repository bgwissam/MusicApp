package com.example.android.musicapp;

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
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);
    //obtain the text from the text box
        
        EditText search = (EditText) findViewById(R.id.search);

        String findSong = search.getText().toString();

    BluesMusic blues = new BluesMusic();
    ArrayList<Song> allsongs;
    allsongs = blues.songs;
    ArrayList<Song> foundSong = new ArrayList<Song>();


    //the loop will search for the matching song within the array
    for(int i = 0; i < allsongs.size(); i++){
        String songName = allsongs.get(i).toString();
        if(findSong == songName){
           Log.i("Song Name: ", songName);
            foundSong.add(new Song("Song Name ", songName));
            SongAdapter foundItem = new SongAdapter(this, foundSong);

            ListView listView = (ListView) findViewById(R.id.search_view);

            listView.setAdapter(foundItem);
        }
    }

    }
}