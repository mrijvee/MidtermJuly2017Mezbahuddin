package math;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        //Scanner for the recursion method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number and it shall be factored using the recursion method:");
        int value = sc.nextInt();
        int factorial = number(value);
        System.out.println("The factorial of the number that you've entered is --> " + factorial);

        //Scanner for the iteration method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number and it shall be factored using the iteration method:\n");
        int value1 = scanner.nextInt();
        int result1 = number1(value1);
        System.out.println("The factorial of the value " + value1 + " is " + result1);
    }
    //Recursion
    public static int number(int integer) {
        int result;
        if (integer == 1) {
            return 1;
        }
        result = number(integer-1)*integer;
        return result;
    }

    //Iteration
    public static int number1(int integer1) {
        int result1 = 1;
        for (int i = 1; i <= integer1; i++) {
            result1 = result1 * i;
        }
        return result1;
    }
}