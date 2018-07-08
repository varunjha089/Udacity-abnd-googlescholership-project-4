package com.example.bharatmk257.music;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter <SongList> {

    public SongListAdapter(Activity context, ArrayList<SongList>SongList){
        super(context,0,SongList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()) .inflate(
                R.layout.music_list_item, parent, false);
            }

            SongList currentSongList = getItem(position);

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.SongTextView);
        songNameTextView.setText(currentSongList.getSongName());

        ImageView songImageView= (ImageView) listItemView.findViewById(R.id.SongImageView);
        songImageView.setImageResource(currentSongList.getSongImage());

        return listItemView;

        }
    }


