package com.example.bharatmk257.music;


public class SongList {

    private String mSongName;

    private int mSongImage;

    public SongList(String SongName, int SongImage){
        mSongName = SongName;
        mSongImage = SongImage;
    }

    public String getSongName(){
        return mSongName;
    }

    public int getSongImage() {
        return mSongImage;
    }
}
