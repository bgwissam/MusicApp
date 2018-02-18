package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class SongAdapter extends ArrayAdapter<Song> {
    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_items, parent, false);
        }
        //get the location of the object in the list
        Song currentWord = getItem(position);
        //find the text view with the id miwak_text id
        TextView songName = listItemView.findViewById(R.id.song_name);
        //set the text on the miwak text view
        songName.setText(currentWord.getSongName());

        //find the text view with the english_text id
        TextView singerName = listItemView.findViewById(R.id.singer_name);
        //set the text on the text view
        singerName.setText(currentWord.getSingerName());


        return listItemView;
    }
}
