package com.example.android.musicapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;



public class SearchBarActivity extends AppCompatActivity {

    private EditText search;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        //obtain the text from the text box
        search = findViewById(R.id.search_edit_text);
        search.setText(getIntent().getStringExtra("editTextValue"));

        String findSong = search.getText().toString();


        BluesMusicActivity bluesSongs = new BluesMusicActivity();
        ArrayList<Song> allsongs = null;
        bluesSongs.setArrayList(BluesMusicActivity.songs);

        allsongs = bluesSongs.getBluesSongs();
        ArrayList<Song> foundSong = new ArrayList<>();


        //the loop will search for the matching song within the array
        for (int i = 0; i < allsongs.size(); i++) {
            String songName = allsongs.get(i).toString();
            if (findSong == songName) {
                Log.i("Song Name: ", songName);
                foundSong.add(new Song("Song Name ", songName));
                SongAdapter foundItem = new SongAdapter(this, foundSong);

                ListView listView = findViewById(R.id.search_view);

                listView.setAdapter(foundItem);
            } else {
                TextView notFound = findViewById(R.id.song_name);
                notFound.setText("Song not found!");
            }
        }

    }
}