package com.pratap.comparision;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Laptop> laptops = Arrays.asList(new Laptop("Dell", 8, 800),
                new Laptop("Apple", 16, 1800),
                new Laptop("Lenovo", 6, 600));

        //Collections.sort(laptops);
        // use Comparator in below cases
        // 1. Can't modified the Laptop class
        // 2. have to apply sorting on different properties, like brand, ram

        Comparator<? super Laptop> brandComparator = (l1, l2) -> {
          return l1.getBrand().compareTo(l2.getBrand());
        };
        Collections.sort(laptops, brandComparator);
        laptops.stream().forEach(System.out::println);
    }
}
