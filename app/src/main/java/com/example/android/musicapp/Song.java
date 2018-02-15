package com.example.android.musicapp;

/**
 * Created by hp on 2/9/2018.
 */
public class Song {
    //Create a variable for the Song name
    public String mSongName;
    //Create a variable for the Singer Name
    public String mSingerName;

    //default constructor
    public Song(String songName, String singerName) {
        mSongName = songName;

        mSingerName = singerName;
    }

    public String getSongName() {
        return mSongName;

    }

    public String getSingerName() {
        return mSingerName;
    }
}
