import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

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
			while((c = input.read()) != -1) {
				if(!Character.isLetter((char) c)) {
					out.write((char) c);
				}
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
