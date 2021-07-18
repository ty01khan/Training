package JavaIO;
import java.io.*;

public class CharStreamCopyFile {
    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("/home/talha/input.txt");
            out = new FileWriter("/home/talha/output.txt");

            int c;
            while((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("Content copied successfully");
        } finally {
            if(in != null)
                in.close();

            if(out != null)
                out.close();
        }
    }
}
