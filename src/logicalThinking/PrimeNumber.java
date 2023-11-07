package logicalThinking;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]) {

//        for (int i = 2; i <= 29; i++) {
//            int a = 0;
//
//            for (int j = 1; j <= i; j++) {
//                if (i % j == 0) {
//                    a++;
//                }
//            }
//
//            if (a == 2) {
//                System.out.println(i );
//            }
//        }



        int c = 1;
        do {

            for (int b = 2; b <= 10; b++) {
                int a = 0;

                for (int j = 1; j <= b; j++) {
                    if (b % j == 0) {
                        a++;
                    }
                }

                if (a == 2) {
                    System.out.println(b);
                }
            }
            c++;
        }

        while (c >= 10);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }

        }
        if (count == 2) {
            System.out.println(" prime number");
        } else {
            System.out.println(" not prime number");
        }

    }
}

