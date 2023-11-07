package Questions;
//Write a Java program to find the sum of all the elements in an array.
public class Five {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 8, 10, 15, 17, 20, 23};

        System.out.println("Sum of all elements: " + calculateSum(numbers));
    }


    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

}

