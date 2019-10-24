package com.example.mymvvm.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.mymvvm.local.dao.ActionDao;
import com.example.mymvvm.local.entity.ActionEntity;

@Database(entities = {ActionEntity.class}, version = 2)
public abstract class myDatabase extends RoomDatabase {
    public abstract ActionDao actionDao();
}
