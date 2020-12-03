package com.example.employeedatabse.model.Relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.employeedatabse.model.Employees;
import com.example.employeedatabse.model.Titles;

import java.util.List;

public class EmployeesWithTitles {
    @Embedded public Employees emp;
    @Relation(
            parentColumn = "emp_no",
            entityColumn = "emp_no"
    )
    public List<Titles> titles;
}
