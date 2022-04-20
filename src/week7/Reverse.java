package week7;

public class Reverse {

    public static String reverseString (String inString)
        {
            if (inString.length() <= 1) {
                return inString;
            } else {
                String first = inString.substring(0, 1);
                String last = inString.substring(inString.length() - 1);
                String middle = inString.substring(1, inString.length() - 1);
                return last + reverseString(middle) + first;
            }
        }
    public static void main(String[] args) {
        System.out.println(reverseString("christina"));
    }
}
