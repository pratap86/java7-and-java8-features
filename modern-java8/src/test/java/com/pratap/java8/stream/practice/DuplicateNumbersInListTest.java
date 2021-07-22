package com.pratap.java8.stream.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class DuplicateNumbersInListTest {

    private List<Integer> getDuplicateNumbers(List<Integer> numbers){
        HashSet<Integer> set = new HashSet<>();
        return numbers.stream()
                .filter(number -> !set.add(number))
                .collect(Collectors.toList());
    }

    @Test
    void testGetDuplicateNumbers(){
        List<Integer> integers = Arrays.asList(12, 21, 12, 32, 23, 32);
        List<Integer> duplicateNumbers = getDuplicateNumbers(integers);
        assertThat(duplicateNumbers)
                .hasSize(2)
                .containsExactly(12, 32);
    }

}
