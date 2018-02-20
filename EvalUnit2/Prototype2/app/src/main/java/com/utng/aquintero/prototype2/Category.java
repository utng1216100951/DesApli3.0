package com.utng.aquintero.prototype2;

/**
 * Created by vazquez on 09/02/2018.
 */

public class Category {
    private int imageId;
    private String name;


    public Category(int imageId, String name){
        this.imageId = imageId;
        this.name = name;

    }

    public Category(){
        this(R.mipmap.ic_launcher_round, "unamed");
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }


}
