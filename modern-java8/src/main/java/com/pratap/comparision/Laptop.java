package com.pratap.comparision;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop implements Comparable<Laptop> {

    private String brand;
    private int ram;
    private double price;

    @Override
    public int compareTo(Laptop that) {
        return (this.getRam() < that.getRam()) ? -1 : ((this.getRam() == that.getRam())? 0 : 1);
//        return Integer.compare(this.getRam(), that.getRam());
    }
}
