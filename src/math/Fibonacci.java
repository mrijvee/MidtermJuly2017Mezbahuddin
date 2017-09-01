package math;

public class Fibonacci {
    public static void main(String[] args) {
        /*
          Write 40 Fibonacci numbers with java.
         */
        int number;
        int number1 = 0;
        int number2 = 1;
        System.out.println("The 40 fibonacci numbers are: ");
        for (int i = 1; i <= 40; i++) {
            number = number1;
            number1 = number2;
            number2 = number + number1;
            System.out.println(number + " ");
        }
    }
}