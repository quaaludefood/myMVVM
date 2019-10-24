package com.example.mymvvm.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "actions_table")
public class ActionEntity  {

    // Properties

    @PrimaryKey(autoGenerate = true)
    private int identifier;

    private boolean active;
    private String name;

    // Constructors

    public ActionEntity(boolean active, String name) {

        this.active = active;
        this.name = name;
    }

    // Methods

    public void setIdentifier(int identifier) {

        this.identifier = identifier;
    }

    public int getIdentifier() {
        return identifier;
    }
    public Boolean getActive() {
        return active;
    }
    public String getName() {
        return name;
    }
}

