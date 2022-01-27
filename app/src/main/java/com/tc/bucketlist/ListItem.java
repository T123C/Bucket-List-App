package com.tc.bucketlist;

//Class for the features of the each item on the bucket list
public class ListItem {

    String title;
    String description;
    int image;

    public ListItem(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }
}
