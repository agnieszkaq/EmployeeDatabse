package com.example.employeedatabse.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(primaryKeys = {"emp_no", "dept_no"})
public class DeptEmp {

    public int emp_no;
    public String dept_no;
    public Date from_date;
    public Date to_date;

}
