package Test2;

import java.util.*;

/**
 * 
 * @author Talha Yaseen
 * 
 * Using KMP algorithm
 *
 */
public class Question2 {
	public static int longestPrefix(String str) {
		int n = str.length();
		int[] pre = new int[n];
		int len = 0;
		int i = 1;
		
		while(i < n) {
			if(str.charAt(i) == str.charAt(len)) {
				pre[i] = len+1;
				len++;
				i++;
			}
			else {
				if(len == 0) {
					pre[i] = 0;
					i++;
				}
				else {
					len = pre[len-1];
				}
			}
		}
		
		return pre[n-1];
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
			System.out.printf("%nEnter input string: ");
			String str = inp.nextLine();
			
			System.out.print("Length of longest prefix-suffix: ");
			if(str.length() < 2) {
				System.out.println(0);
			}
			else {
				System.out.println(longestPrefix(str));
			}
			
			T--;
		}
		
		inp.close();
	}

}

