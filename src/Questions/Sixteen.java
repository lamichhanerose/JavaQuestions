package Questions;

//Write a Java program to implement bubble sort.
public class Sixteen {

    public static void main(String args[]) {

        int[] a = {12, 3, 5, 8, 10, 15, 17, 2, 23};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
        System.out.println("Sorted array:");
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

