package com.example.language;

import androidx.annotation.Nullable;

public class Word {

    private String mDefaultTranslation;
    private String mBengaliTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mBengaliTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mBengaliTranslation = mBengaliTranslation;
    }

    public Word(String mDefaultTranslation, String mBengaliTranslation, int imageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mBengaliTranslation = mBengaliTranslation;
        mImageResourceId = imageResourceId;
    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmBengaliTranslation() {
        return mBengaliTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean isImageProvided() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
