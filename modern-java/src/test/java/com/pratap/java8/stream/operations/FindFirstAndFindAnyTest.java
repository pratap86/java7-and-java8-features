package com.pratap.java8.stream.operations;

import com.pratap.java8.beans.Student;
import com.pratap.java8.mockdata.StudentDataBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Stream API - findFirst() & findAny()
 * used to find an element in a the stream
 * both the functions return the result of type Optional
 * findFirst() - returns the first element in the stream
 * findAny() - returns the first encountered element in the context of parallel stream.
 * findAny() behave same as findFirst() in the context of sequential stream
 */
public class FindFirstAndFindAnyTest {

    private List<Student> students;

    @BeforeEach
    void setup(){
        students = StudentDataBase.getAllStudents();
    }

    @Test
    void testFindAnyStudentWRTSequentialStream(){
        Optional<Student> result = students.stream()
                .filter(student -> student.getGpa() > 3.8)
                .findAny();

        assertTrue(result.isPresent());
        assertThat(result.get())
                .extracting(student -> student.getName().equals("Emily"));
    }

    @Test
    void testFindAnyStudentWRTParallelStream(){
        Optional<Student> result = students.stream().parallel()
                .filter(student -> student.getGpa() > 3.8)
                .findAny();

        assertTrue(result.isPresent());
        assertThat(result.get())
                .extracting(student -> student.getName())
                .isIn("Emily", "Dave", "James");
    }

    @Test
    void testFindFirstStudentWRTSequentialStream(){
        Optional<Student> result = students.stream()
                .filter(student -> student.getGpa() > 3.8)
                .findFirst();

        assertTrue(result.isPresent());
        assertThat(result.get())
                .extracting(student -> student.getName().equals("Emily"));
    }

    @Test
    void testFindFirstStudentWRTParallelStream(){
        Optional<Student> result = students.stream()
                .parallel()
                .filter(student -> student.getGpa() > 3.8)
                .findFirst();

        assertTrue(result.isPresent());
        assertThat(result.get())
                .extracting(student -> student.getName().equals("Emily"));
    }
}
