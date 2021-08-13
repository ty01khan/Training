package Test2;

import java.util.Scanner;

/**
 * 
 * @author Talha Yaseen
 * 
 * Using recursion
 *
 */
public class Question4 {
	public static int totalPaths(int m, int n) {
		if(n == 1 ||  m == 1) {
			return 1;
		}
		
		return totalPaths(m-1, n) + totalPaths(m, n-1);
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter number of testcase (1<=T<=30): ");
		int T = inp.nextInt();
		
		while(T > 0) {
			int M, N;
			
			System.out.printf("%nEnter number of rows: ");
			M = inp.nextInt();
			
			System.out.print("Enter number of columns: ");
			N = inp.nextInt();
			
			System.out.println("Number of possible paths = " + totalPaths(M, N));
			
			T--;
		}
		
		inp.close();
	}

}
