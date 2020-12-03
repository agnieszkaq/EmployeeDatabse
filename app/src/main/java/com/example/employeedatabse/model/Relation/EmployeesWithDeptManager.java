package com.example.employeedatabse.model.Relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.employeedatabse.model.DeptManager;
import com.example.employeedatabse.model.Employees;

import java.util.List;

public class EmployeesWithDeptManager {
@Embedded public Employees emp;
@Relation(
        parentColumn = "emp_no",
        entityColumn = "emp_no"
)
    public List<DeptManager> deptManagers;
}
