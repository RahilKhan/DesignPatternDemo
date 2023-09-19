package com.example.demo.principles.association;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Composition:
 *      Composition is the strongest form of association and represents a "whole-part" relationship
 *      where the part objects are tightly bound to the whole.
 *      In composition, if the whole object is destroyed, its parts are also destroyed.
 *      Composition implies ownership and a strong dependency.
 *
 *  In below example, if you create a Department object and then later destroy it,
 *  it will also destroy the Employee objects it created, demonstrating a composition relationship.
 *
 */
@Getter
@Setter
public class CompositionDepartment {

    private String name;
    private List<Employee> employees;

    public CompositionDepartment(String name) {
        this.name = name;
        /*  Create an empty list of employees */
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String employeeName) {
        /** Composing Employee object. It is now owned by department */
        Employee employee = new Employee(employeeName);
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void printEmployeeList() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
