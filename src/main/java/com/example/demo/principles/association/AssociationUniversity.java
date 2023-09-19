package com.example.demo.principles.association;

import lombok.Getter;
import lombok.Setter;

/**
 * Association:
 * The University class is associated with both Student and Course classes,
 * but it doesn't own or control their lifecycles.
 */
@Setter
@Getter
public class AssociationUniversity {
    private Employee employee;
    private Department department;

    /**
     * This is an example of association.
     * University is associating a Employee with a Department.
     * Note: It's not a constructor but some method to associate Employee -> Department
     *
     * @param employee
     * @param department
     */
    public void enrollEmployeeInDepartment(Employee employee, Department department) {
        this.employee = employee;
        this.department = department;
    }


}
