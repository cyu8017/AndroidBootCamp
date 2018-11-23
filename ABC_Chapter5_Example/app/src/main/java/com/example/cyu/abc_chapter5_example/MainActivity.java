package com.example.cyu.abc_chapter5_example;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ListView;
import android.net.Uri;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] attraction = {
                "Art Institute of Chicago",
                "Magnificent Mile",
                "Willis Tower",
                "Navy Pier",
                "Water Tower"
        };

        setListAdapter(new ArrayAdapter<String>(this,
                R.layout.activity_main, R.id.travel, attraction));
    }

    protected void onListItemClick(ListView i, View v, int position, long id) {

        switch(position) {

            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://artic.edu")));
                break;

            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://themagnificentmile.com")));
                break;

            case 2:
                startActivity(new Intent(MainActivity.this, Willis.class));
                break;

            case 3:
                startActivity(new Intent(MainActivity.this, Pier.class));
                break;

            case 4:
                startActivity(new Intent(MainActivity.this, Water.class));
                break;
        }

    }

}