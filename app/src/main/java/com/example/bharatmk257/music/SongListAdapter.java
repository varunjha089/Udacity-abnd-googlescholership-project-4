package com.example.bharatmk257.music;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter <SongList> {

    public SongListAdapter(Activity context, ArrayList<SongList>SongList){
        super(context,0,SongList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View gridItemView = convertView;
        if(gridItemView == null){
            gridItemView = LayoutInflater.from(getContext()) .inflate(
                R.layout.music_grid_item, parent, false);
            }

            SongList currentSongList = getItem(position);

        TextView songNameTextView = (TextView) gridItemView.findViewById(R.id.SongTextView);
        songNameTextView.setText(currentSongList.getSongName());

        ImageView songImageView= (ImageView) gridItemView.findViewById(R.id.SongImageView);
        songImageView.setImageResource(currentSongList.getSongImage());

        return gridItemView;

        }
    }


