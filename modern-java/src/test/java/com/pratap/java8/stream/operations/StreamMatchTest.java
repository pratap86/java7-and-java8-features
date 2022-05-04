package com.pratap.java8.stream.operations;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Stream API - anyMatch(), allMatch() & noneMatch()
 * All these functions takes in a Predicate as an input and returns a Boolean as an output
 */
public class StreamMatchTest {

    List<Student> students;

    @BeforeEach
    void setup(){
        students = StudentDataBase.getAllStudents();
    }

    @Test
    void testAllMatch(){
        assertTrue(students.stream().allMatch(student -> student.getGpa() >= 3.5));
    }

    @Test
    void testAllMatchNegative(){
        assertFalse(students.stream().allMatch(student -> student.getGpa() >= 4.0));
    }

    @Test
    void testAnyMatch(){
        assertTrue(students.stream().anyMatch(student -> student.getGpa() >= 3.9));
    }

    @Test
    void testAnyMatchNegative(){
        assertFalse(students.stream().anyMatch(student -> student.getGpa() >= 5.9));
    }

    @Test
    void testNoneMatch(){
        assertTrue(students.stream().noneMatch(student -> student.getGpa() == 5.9));
    }

    @Test
    void testNoneMatchNegative(){
        assertFalse(students.stream().noneMatch(student -> student.getGpa() == 3.6));
    }
}
