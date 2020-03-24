
package com.example.language;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "Tumi kothae jacho?"));
        words.add(new Word("What is your name?", "Tomar naam ki?"));
        words.add(new Word("My name is...", "Amar naam holo..."));
        words.add(new Word("How are you feeling?", "Kemon acho?"));
        words.add(new Word("I’m feeling good.", "Ami bhalo achi"));
        words.add(new Word("Are you coming?", "Tumi ki ascho?"));
        words.add(new Word("Yes, I’m coming.", "Hain.. ami aschi"));
        words.add(new Word("I’m coming.", "Ami aschi"));
        words.add(new Word("Let’s go.", "Cholo"));
        words.add(new Word("Come here.", "Ekhane asho"));
        words.add(new Word("I Love You", "Ami tomake bhalo bashi"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.listview_phrases);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}