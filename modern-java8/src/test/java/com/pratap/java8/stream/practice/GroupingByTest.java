package com.pratap.java8.stream.practice;

import com.pratap.java8.beans.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupingByTest {

    List<Employee> employees;

    @BeforeEach
    public void setUp(){
        this.employees = Arrays.asList(
                new Employee("Adam",  10, 1000),
                new Employee("Ryan",  20, 2000),
                new Employee("Ansh",  10, 3000),
                new Employee("Eick",  20, 5000));
    }

    @Test
    void testGroupingBy_One(){
        // groupingBy(classifier, downstream)
        Map<Integer, Integer> deptSalaryMap = employees.stream()
                .collect(groupingBy(Employee::getDepartmentId, summingInt(Employee::getSalary)));
        assertAll(
                () -> assertEquals(4000, deptSalaryMap.get(10)),
                () -> assertEquals(7000, deptSalaryMap.get(20))
        );
    }
}
