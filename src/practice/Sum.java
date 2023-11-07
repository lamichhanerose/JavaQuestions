package practice;

public class Sum {
    public static void main(String[] args) {
        System.out.println("practice.Sum of practice.even number :");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
