package Test1;

import java.util.Scanner;

/**
 * @uthor Talha Yaseen
 *
 * Question 1:
 *  Write a program to reverse an integer.(without converting into string)
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int num = input.nextInt();
        int reverse = 0;

        while(num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }
        System.out.println("Reversed number: " + reverse);

        input.close();
    }

}
