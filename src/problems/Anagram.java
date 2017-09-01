package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Anagram("RACECAR", "CARRACE");
        Anagram("MAT", "ATM");
        Anagram("RACECAR", "RACE");
        Anagram("CAT", "DOG");
        Anagram("CAME", "EMAC");
        Anagram("THE EYES", "THEY SEE");
    }

    public static void Anagram(String word, String anagram) {
        if (findAnagram(word, anagram) == true) {
            System.out.println(word + " and " + anagram + " are anagrams");
        }
        else {
            System.out.println(word + " and " + anagram + " are not anagrams");
        }
    }

    public static boolean findAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] anagramWord = word.toCharArray();
        for (char c : anagramWord) {
            int value = anagram.indexOf(c);
            if (value != -1) {
                anagram = anagram.substring(0, value) + anagram.substring(value + 1, anagram.length());
            }
            else {
                return false;
            }
        }
        return anagram.isEmpty();
    }
}