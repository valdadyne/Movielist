package example.valdadyne.com.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    ListView listView ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list);

            // Get ListView object from xml
            listView = (ListView) findViewById(R.id.list);

            // Defined Array values to show in ListView
            String[] values = new String[] {
                    "The Lobster",
                    "Sing Street",
                    "Mad Max: Fury Road",
                    "The BFG",
                    "The Nice Guys",
                    "The Little Prince",
                    "Captain America: Civil War",
                    "Zootopia",
                    "10 Cloverfield Lane",
                    "Fast7",
                    "Eye In The Sky",
                    "Deadpool",
                    "Warcraft",
                    "April And The Extraordinary World"
            };

            // Define a new Adapter
            // First parameter - Context
            // Second parameter - Layout for the row
            // Third parameter - ID of the TextView to which the data is written
            // Forth - the Array of data

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, values);


            // Assign adapter to ListView
            listView.setAdapter(adapter);

            // ListView Item Click Listener
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    // ListView Clicked item index
                    int itemPosition     = position;

                    // ListView Clicked item value
                    String  itemValue    = (String) listView.getItemAtPosition(position);

                    // Show Alert
                    Toast.makeText(getApplicationContext(),
                            "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                            .show();

                }

            });
        }

    }
