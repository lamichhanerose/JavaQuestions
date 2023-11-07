package Questions;

import java.util.Scanner;
//Write a Java program to find the LCM (Least Common Multiple) of two numbers.
public class Nineteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int lcm = calculateLCM(num1, num2);

        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    public static int calculateLCM(int num1, int num2) {

        return (num1 * num2) / calculateGCD(num1, num2);
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

}
