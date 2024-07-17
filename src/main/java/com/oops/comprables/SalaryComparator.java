package com.oops.comprables;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        return Double.compare(e1.getAge(), e2.getAge());
    }
}

