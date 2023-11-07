package Questions;
//Write a Java function that takes in an array of integers and performs the following operations:
//    Count and return the number of practice.even numbers in the array.
//    Count and return the number of practice.odd numbers in the array.
//    Find and return the sum of all the elements in the array.
//    Find and return the largest number in the array.
//    Check and return whether a prime number exists in the array.
public class First {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 8, 10, 15, 17, 20, 23};



        System.out.print("Even numbers: ");
        printEvenNumbers(numbers);

        System.out.print("Odd numbers: ");
        printOddNumbers(numbers);

        System.out.println("Sum of all elements: " + calculateSum(numbers));
        System.out.println("Largest number: " + findLargestNumber(numbers));

        System.out.print("Prime numbers: ");
        printPrimeNumber(numbers);
    }



    public static void printEvenNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int findLargestNumber(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void printPrimeNumber(int[] arr){

        int counter = 0;
        int i = arr[0];

        while (counter < arr.length) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
                counter++;
            }

            i++;
        }
        System.out.println();
    }
    }
