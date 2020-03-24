
package com.example.language;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "ek"));
        words.add(new Word("two", "dui"));
        words.add(new Word("three", "tin"));
        words.add(new Word("four", "char"));
        words.add(new Word("five", "pach"));
        words.add(new Word("six", "choe"));
        words.add(new Word("seven", "saat"));
        words.add(new Word("eight", "aat"));
        words.add(new Word("nine", "noe"));
        words.add(new Word("ten", "doss"));

        WordAdapter wordAdapter  = new WordAdapter(this,words);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(wordAdapter);

    }
}
