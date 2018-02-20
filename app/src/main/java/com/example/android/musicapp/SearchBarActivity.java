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
        //will trasnfer the edit text to String which will be used for comparing
        String findSong = search.getText().toString();
        //calling the BlueMusic activity to check the list
        BluesMusicActivity bluesSongs = new BluesMusicActivity();
        CountryMusicActivity countrySongs = new CountryMusicActivity();
        JazMusicActivity jazSongs = new JazMusicActivity();
        PopMusicActivity popSongs = new PopMusicActivity();
        RapMusicActivity rapSongs = new RapMusicActivity();
        RockMusicActivity rockSongs = new RockMusicActivity();
        //Will hold the content of all arraylists
        ArrayList<Song> allsongs = null;
        //Will hold the content of each arraylist seperately
        ArrayList<Song> blueList = null;
        ArrayList<Song> countryList = null;
        ArrayList<Song> jazList = null;
        ArrayList<Song> popList = null;
        ArrayList<Song> rapList = null;
        ArrayList<Song> rockList = null;

        //call the getXXXXXSongs class
        blueList = bluesSongs.getBluesSongs();
        countryList = countrySongs.getCountrySongs();
        jazList = jazSongs.getJazSongs();
        popList = popSongs.getPopSongs();
        rapList = rapSongs.getRapSongs();
        rockList = rockSongs.getRockSongs();
        //the following method will add all the arraylist in one list
        allsongs = new ArrayList<>();
        allsongs.addAll(blueList);
        allsongs.addAll(countryList);
        allsongs.addAll(jazList);
        allsongs.addAll(popList);
        allsongs.addAll(rapList);
        allsongs.addAll(rockList);

        //save the found song in an Arraylist
        ArrayList<Song> foundSong = new ArrayList<>();
        //to indicate if a song was found
        int findingIndicater = 0;
        //the loop will search for the matching song within the array
        for (int i = 0; i < allsongs.size(); i++) {

            String songName = (allsongs.get(i).getSongName());
            String artistName = allsongs.get(i).getSingerName();
            Log.i("Song Name " + songName, "\nSinger Name " + artistName);

            if (findSong.toLowerCase().equals(songName.toLowerCase())) {
                foundSong.add(new Song(songName, artistName));
                SongAdapter foundItem = new SongAdapter(this, foundSong);

                ListView listView = findViewById(R.id.search_view);

                listView.setAdapter(foundItem);
                findingIndicater++;

            }
            else if(findSong.toLowerCase().equals(artistName.toLowerCase())){
                foundSong.add(new Song(songName, artistName));
                SongAdapter foundItem = new SongAdapter(this, foundSong);

                ListView listView = findViewById(R.id.search_view);

                listView.setAdapter(foundItem);
                findingIndicater++;
            }
            else if(i == (allsongs.size()-1) && findingIndicater==0) {
                foundSong.add(new Song("Song not found","Artist not found"));
                SongAdapter foundItem = new SongAdapter(this, foundSong);
                ListView listView = findViewById(R.id.search_view);
                listView.setAdapter(foundItem);
            }
        }
    }
}