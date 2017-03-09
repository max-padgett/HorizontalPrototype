package com.maxpadgett.horizontalprototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by maxmo on 3/8/2017. The Create room activity
 */

public class CreateRoomActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_room);

        String[] Sample = {"Option 1", "Option 2", "Option 3"};
        ListAdapter myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Sample);
        ListView myListView = (ListView) findViewById(R.id.listviewCreateRoom);
        myListView.setAdapter(myAdapter);

        final Button button = (Button) findViewById(R.id.create_room_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            }
        });
    }


}
