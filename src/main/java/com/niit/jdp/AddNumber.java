package com.niit.jdp;

public class AddNumber {
    public static void main(String[] args) {
        // initialize a variable sum
        int sum = 0;

        // initialize a for loop
        for (int number = 1; number <= 100 ; number++) {

            // initialize a sum variable to add sum and new number
            sum = sum + number;

            // print the sum using sout
            System.out.println("sum =" +sum);
        }

    }
}
