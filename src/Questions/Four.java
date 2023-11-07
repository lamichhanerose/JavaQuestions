package Questions;

import java.util.Scanner;

//Write a Java program to reverse a string.
public class Four {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any word to reverse that word: ");
            String inputString = scanner.nextLine();

            String reversedString = reverseString(inputString);

            System.out.println("Original String: " + inputString);
            System.out.println("Reversed String: " + reversedString);

            scanner.close();
        }

        public static String reverseString(String str) {
            char[] charArray = str.toCharArray();
            int start = 0;
            int end = charArray.length - 1;

            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }

            return new String(charArray);
        }
    }
