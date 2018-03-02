package com.example.rodrigo.lab2;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Rodrigo on 01/03/2018.
 */
@Database(entities = {Fruit.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract FruitsDao fruitsDao();
}
