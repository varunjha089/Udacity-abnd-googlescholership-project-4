package com.example.bharatmk257.music;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


public class HomeFragment extends Fragment {

    private SongListAdapter songAdapter;
    private ListView listView;
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
        listView = getActivity().findViewById(R.id.listOfSong);
    }

    private void loadData(){

        songLists = new ArrayList<>();
        songLists.add(new SongList("one",R.drawable.playlist0));
        songLists.add(new SongList("two",R.drawable.playlist0));
        songLists.add(new SongList("three",R.drawable.playlist0));
        songLists.add(new SongList("four",R.drawable.playlist0));
        songLists.add(new SongList("five",R.drawable.playlist0));
        songLists.add(new SongList("six",R.drawable.playlist0));
        songLists.add(new SongList("seven",R.drawable.playlist0));
        songLists.add(new SongList("eight",R.drawable.playlist0));
        songLists.add(new SongList("nine",R.drawable.playlist0));
        songLists.add(new SongList("ten",R.drawable.playlist0));

        songAdapter = new SongListAdapter  (getActivity(), songLists);


        listView.setAdapter(songAdapter);


    }


}