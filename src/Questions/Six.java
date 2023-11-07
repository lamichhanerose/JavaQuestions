package Questions;

import java.util.Scanner;

//Write a Java program to check if a given string is a palindrome.
public class Six {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String palindrome = palindrome(inputString);
        if( inputString.equals( palindrome )){
            System.out.println("String is palindrome");
        } else {
            System.out.println("not palindrome");
        }
        scanner.close();
    }

    public static String palindrome(String str){

        char[] charArray = str.toCharArray();
        int start = 0 ;
        int end = charArray.length - 1 ;
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
