package com.pratap.comparision;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LaptopComparisionTest {

    List<Laptop> laptops;

    @BeforeEach
    void setup(){
        laptops = Arrays.asList(
                new Laptop("Dell", 8, 800),
                new Laptop("Apple", 16, 1800),
                new Laptop("Lenovo", 6, 600),
                new Laptop("HP", 8, 1100));
    }

    @Test
    void testLaptopComparableByRam(){

        Collections.sort(laptops);
        assertEquals(6, laptops.get(0).getRam());
        assertEquals("Lenovo", laptops.get(0).getBrand());
    }

    @Test
    void testComparatorByBrand() {

        Comparator<Laptop> nameComparator = (lapOne, lapTwo) -> lapOne.getBrand().compareTo(lapTwo.getBrand());
        Collections.sort(laptops, nameComparator);

        assertEquals("Apple", laptops.get(0).getBrand());
        assertEquals(16, laptops.get(0).getRam());
    }

    @Test
    void testMultipleComparator(){

        Collections.sort(laptops, Comparator.comparing(Laptop::getRam).thenComparing(Laptop::getBrand));
        assertEquals("Dell", laptops.get(1).getBrand());
    }
}