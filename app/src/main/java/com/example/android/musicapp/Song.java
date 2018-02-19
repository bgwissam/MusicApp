package com.example.android.musicapp;


public class Song {
    //Create a variable for the Song name
    public final String mSongName;
    //Create a variable for the Singer Name
    public final String mSingerName;

    //default constructor
    public Song(String songName, String singerName) {
        mSongName = songName;

        mSingerName = singerName;
    }

    public String getSongName() {return mSongName;}

    public String getSingerName() {
        return mSingerName;
    }
}
