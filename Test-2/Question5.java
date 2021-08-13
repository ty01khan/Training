package Test2;

import java.util.*;

/**
 * 
 * @author Talha Yaseen
 *
 */
public class Question5 {
	public static boolean isContains(String S, Set<String> dict) {
		int i = 0;
		
		if(S.length() == 0) {
			return true;
		}
		
		while(i < S.length()) {
			if(dict.contains(S.substring(0, i+1)) && isContains(S.substring(i+1, S.length()), dict)) {
				return true;
			}
			
			i++;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int T = 0;
		System.out.print("Enter number of testcase (1<=T<=100): ");
		try {
			T = Integer.parseInt(inp.nextLine()); 
		}
		catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
		while(T > 0) {
			int N = 0;
			Set<String> dict = new HashSet<String>();
			
			System.out.printf("%nEnter number of words in dictionary: ");
			try {
				N = Integer.parseInt(inp.nextLine()); 
			}
			catch(NumberFormatException nfe) {
				nfe.printStackTrace();
			}
			
			while(N > 0) {
				System.out.print("Enter dictionary string: ");
				dict.add(inp.nextLine());
				
				N--;
			}
			
			System.out.print("Enter main string: ");
			String S = inp.nextLine();
			
			if(S.length() == 0) {
				System.out.println(1);
			}
			else {
				System.out.println(isContains(S, dict) ? 1 : 0);
			}
			
			T--;
		}
		
		inp.close();
	}

}
