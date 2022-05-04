package com.pratap.java8.stream.practice;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedAndNonRepeatedCharFindTest {

    private char getFirstNonRepeatedChar(String input){

        return input.chars()
                .mapToObj(num -> Character.toLowerCase(Character.valueOf((char) num)))
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

    }

    private char getFirstRepeatedChar(String input){

        return input.chars()
                .mapToObj(num -> Character.toLowerCase(Character.valueOf((char) num)))
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

    }

    @Test
    void testGetFirstNonRepeatedChar(){
        String inputStr = "Hello";
        char result = getFirstNonRepeatedChar(inputStr);
        assertEquals('h', result);
    }

    @Test
    void testGetFirstRepeatedChar(){
        String inputStr = "Hello";
        char result = getFirstRepeatedChar(inputStr);
        assertEquals('l', result);
    }
}
