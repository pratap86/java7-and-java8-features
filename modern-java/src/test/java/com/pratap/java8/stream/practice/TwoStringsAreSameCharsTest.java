package com.pratap.java8.stream.practice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoStringsAreSameCharsTest {

    private boolean compareTwoStringChars(String str1, String str2){

        HashMap<Character, Long> hashMapOne = str1.chars()
                .mapToObj(num -> Character.toLowerCase(Character.valueOf((char) num)))
                .collect(groupingBy(Function.identity(), HashMap::new, counting()));

        HashMap<Character, Long> hashMapTwo = str2.chars()
                .mapToObj(num -> Character.toLowerCase(Character.valueOf((char) num)))
                .collect(groupingBy(Function.identity(), HashMap::new, counting()));

        return hashMapOne.entrySet().stream()
                .allMatch(entry -> entry.getValue().equals(hashMapTwo.get(entry.getKey())));
    }

    @Test
    void testCompareTwoStringChars(){

        assertTrue(compareTwoStringChars("aabbccdee", "aaccbbeed"));
    }

    @Test
    void testCompareTwoStringCharsWithDiffString(){
        assertFalse(compareTwoStringChars("aabbccdeeee", "aaccbbeed"));
    }
}
