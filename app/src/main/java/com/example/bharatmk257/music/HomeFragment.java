package com.example.bharatmk257.music;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {

    private SongListAdapter songAdapter;
    private GridView gridView;
    private ArrayList<SongList> songLists;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, null);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initViews();
        loadData();
    }

    private void initViews(){
        gridView = getActivity().findViewById(R.id.gridOfSong);
    }


    private void loadData(){


        songLists = new ArrayList<>();
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));
        songLists.add(new SongList("music",R.drawable.playlist0));


        songAdapter = new SongListAdapter  (getActivity(), songLists);
//
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                SongList songList = (SongList) parent.getItemAtPosition(position);
                Intent songNameIntent = new Intent(getActivity(), activity_music.class);
                startActivity(songNameIntent);

            }
        });
//
        gridView.setAdapter(songAdapter);

    }


}