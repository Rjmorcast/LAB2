package com.example.rodrigo.lab2;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Rodrigo on 01/03/2018.
 */
@Dao
public interface FruitsDao {
    @Query("SELECT * FROM Fruit")
    List<Fruit> getAll();

    @Insert
    void insert(Fruit fruit);



    @Delete
    void delete(Fruit fruit);
}
