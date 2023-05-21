package com.example.ex5.model;

import com.example.ex5.R;

public enum Thumbnail {
THUMBNAILL1("Thumbnail 1", R.drawable.first_thumbnail),
    THUMBNAILL2("Thumbnail 2", R.drawable.second_thumbnail),
    THUMBNAILL3("Thumbnail 3", R.drawable.third_thumbnail),
    THUMBNAILL4("Thumbnail 4", R.drawable.fourth_thumbnail);
    private String name;
private int img;
Thumbnail(String name, int img)
{
    this.name = name;
    this.img = img;
}
public String getName(){
    return name;
}
public int getImg()
{
    return img;
}

}
