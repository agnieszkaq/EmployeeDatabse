package com.example.employeedatabse.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(primaryKeys = {"emp_no", "from_date"})
public class Salaries {

    public int emp_no;
    public int salary;
    public Date from_date;
    public Date to_date;
    
}
