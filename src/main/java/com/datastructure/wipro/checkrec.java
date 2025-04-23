package com.datastructure.wipro;

public class checkrec {
    public static void main(String[] args) {
        boolean isRec = true;
        Integer result = isRec ? null : 0;

        int rema = (result != null) ? result : 0;

        System.out.println(result); // This will print "null" if isRec is true.
        System.out.println(rema);   // This will print "0" if result is null, or the value of result if it's not null.
    }
}
