package JavaIO;
import java.io.*;

public class ReadConsole {
    public static void main(String args[]) throws IOException {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, or 'q' to quit.");

            char c = (char) cin.read();
            while (c != 'q') {
                System.out.print(c);
                c = (char) cin.read();
            }
        } finally {
            if (cin != null)
                cin.close();
        }
    }
}