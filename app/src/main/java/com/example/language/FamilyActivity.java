
package com.example.language;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "baba", R.drawable.family_father));
        words.add(new Word("mother", "ma", R.drawable.family_mother));
        words.add(new Word("son", "chele", R.drawable.family_son));
        words.add(new Word("daughter", "meye", R.drawable.family_daughter));
        words.add(new Word("older brother", "dada", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "bhai", R.drawable.family_younger_brother));
        words.add(new Word("older sister", "didi", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "bon", R.drawable.family_younger_sister));
        words.add(new Word("grandmother ", "diya", R.drawable.family_grandmother));
        words.add(new Word("grandfather", "dadun", R.drawable.family_grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.listview_family);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}