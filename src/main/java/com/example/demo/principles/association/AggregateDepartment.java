package com.example.demo.principles.association;

import com.example.demo.principles.association.Employee;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Aggregation:
 *      Is a stronger form of association that represents a "whole-part" or "has-a"
 *      One class (the whole) contains or is composed of objects of another class (the part).
 *      However, the part objects can exist independently and can be shared among multiple wholes.
 * Department -> Employee is aggregation relationship
 *      department can contain multiple employees.
 *      However, employees can exist outside of any department.
 *
 */
@Getter
@Setter
public class AggregateDepartment {

    private String name;
    private List<Employee> employees;

    public AggregateDepartment(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Other methods and attributes
}
