package Questions;

import java.util.Scanner;

//TOTAL NUMBER OF STING

public class Twelve {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a sentence ");
            String inputString = scanner.nextLine();

            int wordCount = countWords(inputString);

            System.out.println("The total number of words in the string: " + wordCount);

            scanner.close();
        }

        private static int countWords(String input) {

            String[] words = input.split(" ");

            return words.length;
        }
    }
