package javaprogrammes;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // Scanner declaration for reading input from console
        System.out.println("Please enter a number: ");
        int number = s.nextInt();
        isItOddOrEvenNumber(number);
        s.close();                          // Closing scanner object
    }

    // Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number) {
        // Ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("This is " + evenOrOdd + " number ");
    }
}
