package com.pratap.java8.stream.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumValueElementTest {

    private int getMaximumValue(List<Integer> numbers){
        return numbers.stream()
                //12
                //21
                //45
                //54
                //65
                //a=0,b=12 from stream, result=12
                //a=12, b=21, r=21
                //a=21, b=45, r=45
                //a=45, b=54, r=54
                //a=54, b=65. r=65
                .reduce(0, (a, b) -> a > b ? a : b);
    }

    @Test
    void testGetMaximumValue(){
        List<Integer> numbers = Arrays.asList(12, 21, 45, 54, 65);
        int maximumValue = getMaximumValue(numbers);
        assertEquals(65, maximumValue);
    }
}
