package com.example.rodrigo.lab2;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Rodrigo on 01/03/2018.
 */

@Entity
public class Fruit {
    @PrimaryKey @NonNull
    public String name;


    public Fruit(String name){
        this.name = name;

    }

    public String getFruitName(){
        return this.name;
    }


    public void newFruit(String name, String color){
        this.name = name;
    }
}
