package com.example.bharatmk257.music;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, null);

    }

}

//    public class HomeFragment extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.fragment_home);
//
//            ArrayList<SongList> songLists = new ArrayList<SongList>();
//            songLists.add(new SongList("one",R.drawable.playlist0));
//            songLists.add(new SongList("two",R.drawable.playlist0));
//            songLists.add(new SongList("three",R.drawable.playlist0));
//            songLists.add(new SongList("four",R.drawable.playlist0));
//            songLists.add(new SongList("five",R.drawable.playlist0));
//            songLists.add(new SongList("six",R.drawable.playlist0));
//            songLists.add(new SongList("seven",R.drawable.playlist0));
//            songLists.add(new SongList("eight",R.drawable.playlist0));
//            songLists.add(new SongList("nine",R.drawable.playlist0));
//            songLists.add(new SongList("ten",R.drawable.playlist0));
//
//
//
//            SongListAdapter songAdapter = new SongListAdapter(this, songLists);
//
//            ListView listView = (ListView) findViewById(R.id.listOfSong);
//
//            listView.setAdapter(songAdapter);
//
//        }
//    }



