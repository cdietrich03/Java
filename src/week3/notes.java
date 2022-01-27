package week3;

public class notes {
//    public static void main(String[] args) {
//        String s1 = "Hi There";
//        String s2 = new String("Hi There");
//
////        //Equality Test
////        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
////        //Compare Strings
////        System.out.println("a".compareTo("b"));
//
//        //Length of a String
//        System.out.println("Length of s1 is " + s1.length());
//        //other functions
//        String title = "Harry Potter";
//        char oneLetter = title.charAt(6);
//        System.out.println(oneLetter);
//
//
//        String substring = title.substring(6, 9);
//        System.out.println(substring);
//// makes substring = ”Pot" - from positions 6 to 8
////Character at position 9 is NOT included.
//
//    }
//
//public static void main(String[] args) {
//    String s1 = "Monty";
//    String s2 = "Python";
//
//    System.out.println(s1.length() + s2.length());
//    System.out.println(s2.charAt(4));
//    System.out.println(s1.charAt(2) == s2.charAt(s2.length() - 1));
//    System.out.println(s1.substring(0, 2) + s2.substring(4, 6));
//    System.out.println(s1.contains("ty") && s2.contains("yt"));
//    System.out.println("hello".indexOf("l"));
//    System.out.println(s1.indexOf("on") + s2.indexOf("a"));
//    System.out.println((s1 + s2).replace("o", "i"));
//    System.out.println("remove all the e's from this text".replace("e", ""));
//
//
//}
    public static String singFullSong(String name, int age) {
        String mainClause = "Happy birthday to you";
        String out = "Happy birthday to you, happy birthday to you";
        out += " Happy birthday dear " + name;
        out += " Happy birthday to you";
        return out;
    }

    public static void singHappyBirthday(String name, int age){
        System.out.println("Happy Birthday " + name);
        System.out.println("You are " + age + " years old");
        System.out.println(singFullSong("Suzy", 6));

    }
    public static void main(String[] args) {
        System.out.println("Starting main");
        singHappyBirthday("Suzy", 6);
        System.out.println("Back in main");
}
//public static boolean badFunction (int int1) {
//    if (int1 > 0) return true;
//    else if (int1 < 0) return false;
////    else if (int1 == 0) return true;
//    else return true;
//}

//    public static boolean isPrime(int number) {
//
//        boolean divisorFound = false;
//
//        for (int divisor = 2; divisor <= Math.sqrt(number); divisor ++)
//            if (number % divisor == 0) divisorFound = true;
//
//        return !divisorFound;
//    }

//    public static boolean isOdd (int number) {
//        if (number % 2 != 0) {
//            return true;
//        } else{
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        if (isOdd(5)) {
//            System.out.println("it is odd");
//        }
//    }

}

