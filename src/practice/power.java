package practice;

import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        System.out.println("Enter Power");
        int power = sc.nextInt();
        int mul = 1;
        for(int i = 1 ; i <= power ; i++) {
              mul = num * mul;
        }
        System.out.println(mul);
    }
}
