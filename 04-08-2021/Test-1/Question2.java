package Test1;

import java.util.Scanner;

/**
 * @author Talha Yaseen
 *
 * Question 2:
 *  Write a program to convert a string containing only lower case english alphabets into a
 *  palindrome with minimum number of insertions.You can shuffle the letters of given
 *  string if required.
 */
public class Question2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String str = input.nextLine();
        int n = str.length();

        int[][] d = new int[n][n];
        for(int i = 2; i <= n; i++) {
            int j = 0;
            int k = i+j-1;

            while(k < n) {
                if(str.charAt(j) != str.charAt(k)) {
                    d[j][k] = Math.min(1 + d[j+1][k], 1 + d[j][k-1]);
                }
                else {
                    d[j][k] = d[j+1][k-1];
                }

                j++;
                k++;
            }
        }

        System.out.println("Minimum insertion required: " + d[0][n-1]);
        input.close();
    }

}
