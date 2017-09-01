package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] splitDuplicateWord = st.split(" ");

        Map<String, Integer> wordMap = new HashMap<>();

        for (String duplicateWord : splitDuplicateWord) {
            Integer i = wordMap.get(duplicateWord);
            if (i == null) {
                i = 0;
            }
            wordMap.put(duplicateWord, i + 1);
        }

        for (Map.Entry<String, Integer> word : wordMap.entrySet()) {
            System.out.println(word.getKey() + "--> " + " gets duplicated " + word.getValue() + " time(s)" );
        }
    }
}
