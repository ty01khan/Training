package Test2;

import java.util.*;

/**
 * 
 * @author Talha Yaseen
 *
 * Using power set techinque
 */
public class Question3 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter number of testcase (1<=T<=500): ");
		int T = inp.nextInt();
		
		while(T > 0) {	
			System.out.printf("%nEnter length of array: ");
			int n = inp.nextInt();
			int[] arr = new int[n];
			int totSub = (int) Math.pow(2,  n);
			int i = 0;
			
			while(n > 0) {
				System.out.printf("arr[i] = ");
				arr[i] = inp.nextInt();
			
				n--;
				i++;
			}
			
			Arrays.sort(arr);
			
			Set<List<Integer>> set = new HashSet<>();
			
			for(i = 0; i < totSub; i++) {
				List<Integer> alist = new ArrayList<Integer>();
				
				for(int j = 0; j < arr.length; j++) {
					if((i & (1 << j)) != 0) {
						alist.add(arr[j]);
					}
				}
				
				set.add(alist);
			}
			
			for(List<Integer> list : set) {
				System.out.print("(");
				for(int j = 0; j < list.size(); j++) {
					if(j != list.size() - 1)
						System.out.print(list.get(j) + " ");
					else
						System.out.print(list.get(j));
				}
				System.out.print(")");
			}
			System.out.println();
			
			T--;
		}
		
		inp.close();
	}

}
