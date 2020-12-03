package com.example.employeedatabse.model.Relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.employeedatabse.model.DeptEmp;
import com.example.employeedatabse.model.Employees;

import java.util.List;

public class EmployeesWithDeptEmp {
    @Embedded public Employees emp;
    @Relation(
            parentColumn = "emp_no",
            entityColumn = "emp_no"
    )
    public List<DeptEmp> deptEmps;
}
