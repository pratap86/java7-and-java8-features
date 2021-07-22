package com.pratap.java8.stream.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberStartingWithOneTest {

    private List<Integer> getNumbersStartWithOne(List<Integer> nums){
        return nums.stream()
                .map(num -> num + "")
                .filter(str -> str.startsWith("1"))
                .map(str -> Integer.parseInt(str))
                .collect(Collectors.toList());
    }

    @Test
    void testGetNumbersStartWithOne(){
        List<Integer> nums = Arrays.asList(12, 21, 22, 19);
        List<Integer> startWithOneNums = getNumbersStartWithOne(nums);

        assertThat(startWithOneNums)
                .hasSize(2)
                .containsExactly(12, 19);
    }
}
