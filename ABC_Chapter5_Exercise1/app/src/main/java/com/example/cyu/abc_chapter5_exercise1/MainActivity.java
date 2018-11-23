package com.example.cyu.abc_chapter5_exercise1;

import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] attraction = {
                "Beach Bike Rentals",
                "Mountain Bike Rentals",
                "Bike Rental Website"
        };
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, attraction));
    }

    protected void onListItemClick(ListView i, View v, int position, long id) {

        switch(position){

            case 0:
                startActivity(new Intent(MainActivity.this, Beach.class));
                break;

            case 1:
                startActivity(new Intent(MainActivity.this, Mountain.class));
                break;

            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.campusbikeshop.com")));
                break;

        }
    }
}