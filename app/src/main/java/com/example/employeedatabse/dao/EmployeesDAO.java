package com.example.employeedatabse.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import com.example.employeedatabse.model.Employees;

@Dao
public interface EmployeesDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertEmployees(Employees... employees);

    @Update
    public void updateEmployees(Employees... employees);
}
