package com.example.employeedatabse.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(primaryKeys = {"emp_no", "dept_no"})
public class DeptManager {

    public String dept_no;
    public int emp_no;
    public Date form_date;
    public Date to_date;
}
