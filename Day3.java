// Day 1 

/*
Write a Java program to find the value of a specified expression.
a) (101 + 0) / 3
b) 3.0e-6 * 10000000.1
c) true && true
d) false && true
e) (false && false) || (true && true)
f) (false || false) && (true && true)
*/

public class Day3 {
    public static void main(String[] args) {
        // (101 + 0) / 3
        int a = (101 + 0) / 3;
        // 3.0e-6 * 10000000.1
        double b = 3.0e-6 * 10000000.1;
        // true && true
        boolean c = true && true;
        // false && true
        boolean d = false && true;
        // (false && false) || (true && true)
        boolean e = (false && false) || (true && true);
        // (false || false) && (true && true)
        boolean f = (false || false) && (true && true);

        // Printing the values
        System.out.println("(101 + 0) / 3 = " + a);
        System.out.println("3.0e-6 * 10000000.1 = " + b);
        System.out.println("true && true = " + c);
        System.out.println("false && true = " + d);
        System.out.println("(false && false) || (true && true) = " + e);
        System.out.println("(false || false) && (true && true) = " + f);
    }
}



