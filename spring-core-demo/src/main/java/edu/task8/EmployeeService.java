package edu.task8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void addEmployee(int id, String name, String dept) {
        repo.add(new Employee(id, name, dept));
    }

    public void showEmployees() {
        repo.getAll().forEach(System.out::println);
    }
}