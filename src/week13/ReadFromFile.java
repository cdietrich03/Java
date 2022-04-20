package week13;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class ReadFromFile {

    public static void main(String[] args)  {
        // Try reading from a file
        try {
        File  reader = new File("test.txt");
        Scanner in = new Scanner(reader);
        String word = "";

        while(in.hasNext()) {
            word = in.nextLine();
            System.out.println(word);
        }
        in.close();
    } catch(IOException exception) {
            System.out.println("Oop - can't find file");
        }
    }
}

