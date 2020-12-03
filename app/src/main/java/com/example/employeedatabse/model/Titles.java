package com.example.employeedatabse.model;

import androidx.room.Entity;

import java.util.Date;

@Entity(primaryKeys = {"emp_no", "title","from_date"})
public class Titles {

    public int emp_no;
    public String title;
    public Date from_date;
    public Date to_date;

}
