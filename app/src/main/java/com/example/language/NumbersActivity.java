
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
        words.add(new Word("one", "ek", R.drawable.number_one));
        words.add(new Word("two", "dui", R.drawable.number_two));
        words.add(new Word("three", "tin", R.drawable.number_three));
        words.add(new Word("four", "char", R.drawable.number_four));
        words.add(new Word("five", "pach", R.drawable.number_five));
        words.add(new Word("six", "choe", R.drawable.number_six));
        words.add(new Word("seven", "saat", R.drawable.number_seven));
        words.add(new Word("eight", "aat", R.drawable.number_eight));
        words.add(new Word("nine", "noe", R.drawable.number_nine));
        words.add(new Word("ten", "dos", R.drawable.number_ten));

        WordAdapter wordAdapter  = new WordAdapter(this,words);

        ListView listView = findViewById(R.id.listview_numbers);

        listView.setAdapter(wordAdapter);

    }
}
