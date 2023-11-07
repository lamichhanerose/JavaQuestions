package Questions;

import java.util.Scanner;

//Write a Java program to check if a given number is prime or not.
public class Third {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }

        }
        if (count == 2) {
            System.out.println(" prime number");
        } else {
            System.out.println(" not prime number");
        }

    }
}

