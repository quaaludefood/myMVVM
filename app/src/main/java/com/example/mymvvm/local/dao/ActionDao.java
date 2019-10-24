package com.example.mymvvm.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.mymvvm.local.entity.ActionEntity;

import java.util.List;

@Dao
public interface ActionDao {
    @Insert
    void insert(ActionEntity action);

    @Update
    void update(ActionEntity action);

    @Delete
    void delete(ActionEntity action);

    @Query("DELETE FROM actions_table")
    void deleteAllActions();

    @Query("SELECT * FROM actions_table")
    LiveData<List<ActionEntity>> getAllActions();
}
