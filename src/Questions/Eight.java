package Questions;

import java.util.Scanner;

//Write a Java program to implement a binary search algorithm.
public class Eight {

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter any number to find in array : ");
        int target = scanner.nextInt();

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Searched Number " + target + " found at index " + result);
        } else {
            System.out.println("Searched Number " + target + " not found in the array.");
        }

        scanner.close();
    }
}
