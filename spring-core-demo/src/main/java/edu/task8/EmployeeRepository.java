package edu.task8;

import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {

    private List<Employee> list = new ArrayList<>();

    public void add(Employee e) {
        list.add(e);
    }

    public List<Employee> getAll() {
        return list;
    }
}