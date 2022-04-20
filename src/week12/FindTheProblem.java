package week12;

import java.util.ArrayList;
import java.util.List;


public class FindTheProblem {
// add the string in position i
        public static List<String> insertString(List<String> lst, String element ) {
            List<String> word = new ArrayList<>();
            for (int i = 0; i < lst.size(); i++ )  {
                String j = lst.get(i);
                word.add(element);
                word.add(j);
            }
            return word;
        }
        public static void main(String[] args) {
            // Add a small string in front of every word in the ArrayList
            List<String> words = new ArrayList<>();
            words.add("four");
            words.add("score");
            words.add("and");
            words.add("seven");
            words.add("years");
            words.add("ago");
            System.out.println("Before " + words);
            System.out.println("After" + insertString(words, "~"));
        }
    }


