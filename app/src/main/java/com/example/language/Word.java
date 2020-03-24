package com.example.language;

public class Word {

    private String mDefaultTranslation;
    private String mBengaliTranslation;

    public Word(String mDefaultTranslation, String mBengaliTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mBengaliTranslation = mBengaliTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmBengaliTranslation() {
        return mBengaliTranslation;
    }
}
