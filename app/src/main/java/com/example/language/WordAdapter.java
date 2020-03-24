package com.example.language;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Context context, ArrayList<Word> pWords) {
        super(context,0, pWords);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word word = getItem(position);

        TextView mDefaultTranslation = (TextView) listItemView.findViewById(R.id.list_item1);

        mDefaultTranslation.setText(word.getmDefaultTranslation());

        TextView mBengaliTranslation = (TextView) listItemView.findViewById(R.id.list_item2);

        mBengaliTranslation.setText(word.getmBengaliTranslation());


            ImageView imageView = listItemView.findViewById(R.id.imageview);
        if(word.isImageProvided()) {
            imageView.setImageResource(word.getImageResourceId());
        }else{
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
