package Test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.io.FileWriter;

/**
 * @author Talha Yaseen
 *
 * Question 3:
 *  Write a program to take input from a text file .Find the unique characters in the input
 *  file and write them into a file with name “output.txt” .(Input file is in java home folder
 *  with name input.txt)
 */
public class Question3 {

    public static void main(String[] args) throws IOException {
        FileReader input = null;
        File file = null;
        try {
            file = new File("input.txt");
            input = new FileReader(file);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        FileWriter out = null;
        try {
            out = new FileWriter("output.txt");

            int c;
            Set<Character> set = new HashSet<Character>();
            while((c = input.read()) != -1) {
                set.add((char) c);
            }

            for(Character x : set) {
                out.write(x);
            }

            System.out.println();
            System.out.println("Unique characters successfully written to 'output.txt' file");
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if(input != null)
                input.close();

            if(out != null)
                out.close();
        }
    }

}
