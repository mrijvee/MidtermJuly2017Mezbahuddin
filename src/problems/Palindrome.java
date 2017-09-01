package problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String word;
        String reverse = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word to see if it's a palindrome");
        word = sc.nextLine();

        int count = word.length();

        for (int i = count - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("The word you've entered is a palindrome");
        }
        else {
            System.out.println("The word you've entered is not a palindrome");
        }
    }
}