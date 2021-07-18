package JavaIO;
import java.io.*;

public class CopyFile {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/home/talha/input.txt");
            out = new FileOutputStream("/home/talha/output.txt");

            int c;
            while((c = in.read()) !=-1) {
                out.write(c);
            }
            System.out.println("input.txt Content copied successfully to output.txt");
        } finally {
            if(in != null) {
                in.close();
            }

            if(out != null) {
                out.close();
            }
        }
    }
}
