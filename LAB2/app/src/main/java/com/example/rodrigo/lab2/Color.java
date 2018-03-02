package com.example.rodrigo.lab2;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Rodrigo on 01/03/2018.
 */
@Entity
public class Color {
    @ColumnInfo(name = "Color")
    public String nombre;

    public Color(String color){
        this.nombre = color;
    }

    public void setColor(String color){
        this.nombre = color;
    }

    public String getColor(){
        return this.nombre;
    }
}
