package Test2;

import java.util.*;

/**
 * 
 * @author Talha Yaseen
 *
 */
public class Question1 {
		public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n;
		System.out.print("Please enter an integer, or enter -1 to quit: ");
		Stack<Integer> st = new Stack<Integer>(), temp = new Stack<Integer>();
		
		while((n = inp.nextInt()) != -1) {
			st.add(n);
			
			System.out.print("Please enter an integer, or enter -1 to quit: ");
		}
		
		while(!st.isEmpty()) {
			n = st.pop();
			
			while(!temp.isEmpty() && temp.peek() > n) {
				st.push(temp.pop());
			}
			temp.push(n);
		}
		
		System.out.printf("%nStack sorted elements are: ");
		while(!temp.isEmpty()) {
			System.out.print(temp.pop() + " ");
		}
		
		inp.close();
	}
}
