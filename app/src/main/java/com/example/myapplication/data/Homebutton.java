package com.example.myapplication.data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Homebutton {
    Context c;
    List<String> titles= new ArrayList<>();
    List<Integer> images = new ArrayList<>();

    public Homebutton(Context c, List<String> titles, List<Integer> images) {
        this.c = c;
        this.titles = titles;
        this.images = images;
    }

    public Context getC() {
        return c;
    }

    public void setC(Context c) {
        this.c = c;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public List<Integer> getImages() {
        return images;
    }

    public void setImages(List<Integer> images) {
        this.images = images;
    }
}
