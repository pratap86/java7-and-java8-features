package com.pratap.exceptions;

import java.util.Scanner;

public class TryWithResourceRunner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int[] numbers = {1, 12, 23, 34};
            int number = numbers[21];
        }
    }
}
