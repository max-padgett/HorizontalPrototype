package com.maxpadgett.horizontalprototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by maxmo on 3/8/2017. The Join Room activity
 */

public class JoinRoomFrag extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_room);

        String[] Sample = {"Sample 4", "Sample 5", "Sample 6"};
        ListAdapter myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Sample);
        ListView myListView = (ListView) findViewById(R.id.listviewJoinRoom);
        myListView.setAdapter(myAdapter);
    }


}
