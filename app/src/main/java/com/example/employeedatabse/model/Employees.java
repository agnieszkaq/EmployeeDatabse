package com.example.employeedatabse.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

enum Gender {
    F, M;
}

@Entity
public class Employees {

    @PrimaryKey(autoGenerate = true)
    public int emp_no;

    public Date birth_date;
    public String first_name;
    public String last_name;
    public Gender gender;
    public Date hire_date;
}
