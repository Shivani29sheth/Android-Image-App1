package com.example.home.pixabayjson;

public class ExampleItem {

    private String mImageUrl;
    private String mCreatorName;
    private int likes;

    public ExampleItem(String mImageUrl, String mCreatorName, int likes) {
        this.mImageUrl = mImageUrl;
        this.mCreatorName = mCreatorName;
        this.likes = likes;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreatorName() {
        return mCreatorName;
    }

    public int getLikes() {
        return likes;
    }
}
