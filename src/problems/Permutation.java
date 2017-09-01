package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("", "ABC");
    }

    public static void permutation(String word, String str) {
        int count = str.length();

        if (count == 0) {
            System.out.println(word);
        }
        else {
            for (int i = 0; i < count; i++) {
                permutation(word + str.charAt(i), str.substring(0, i) + str.substring(i+1));
            }
        }
    }
}
