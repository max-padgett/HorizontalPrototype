package com.maxpadgett.horizontalprototype;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] Sample = {"Sample 1" , "Sample 2", "Sample 3"};
        ListAdapter myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Sample);
        ListView myListView = (ListView) findViewById(R.id.listview1);
        myListView.setAdapter(myAdapter);

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_menu, menu);

        // return true so that the menu pop up is opened
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.create_room:
                startActivity(new Intent(this, CreateRoomActivity.class));
                return true;
            case R.id.join_room:
                startActivity(new Intent(this, JoinRoomFrag.class));
                return true;
            case R.id.logout:
                return true;


        }
        return super.onOptionsItemSelected(item);

    }

}
