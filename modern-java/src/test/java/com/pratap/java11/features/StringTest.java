package com.pratap.java11.features;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringTest {

    @Test
    void testLines(){
        String multilineString = "Pratap helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()//lines() method breaks the given string into rows
                .filter(line -> !line.isBlank())
                .map(String::strip)// strip method removes white space from both ends of the given string
                .collect(Collectors.toList());
        assertThat(lines).containsExactly("Pratap helps", "developers", "explore Java.");

    }

    @Test
    void testIsBlank(){

        String notEmptyStr = "No Empty";
        assertFalse(notEmptyStr.isBlank());

        String emptyStr = "";
        assertTrue(emptyStr.isBlank());

        String spaceStr = " ";
        assertTrue(spaceStr.isBlank());
    }

    @Test
    void testRepeat(){

        String string = "pratap";
        String repeatString = string.repeat(2);
        assertThat(repeatString).isEqualTo("pratappratap");
    }
}
