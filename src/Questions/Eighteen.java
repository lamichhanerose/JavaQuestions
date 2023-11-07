package Questions;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 1, 2, 3, 5, 6, 7, 8, 1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its frequency: ");
        int number = sc.nextInt();



        int frequency = checkFrequency(array, number);

        System.out.println("Frequency of " + number + " is: " + frequency);
    }

    public static int checkFrequency(int[] arr, int fr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == fr) {
                count++;
            }
        }

        return count;
    }
}
