package JavaIO;
import java.io.*;

public class CreateDir {
    public static void main(String args[]) {
        String dirname = "/home/talha/BeeHyv/Practice/Lalu";
        File f = new File(dirname);

        //Create directory now
        f.mkdirs();
    }
}
