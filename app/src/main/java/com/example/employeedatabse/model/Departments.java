package com.example.employeedatabse.model;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"dept_name"},unique = true)})
public class Departments {

    @PrimaryKey(autoGenerate = true)
    public String dept_no;

    public String dept_name;
}
