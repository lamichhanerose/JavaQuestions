package practice;

public class nestedLoop {
    public static void main(String[] args) {
        System.out.println("practice.Table of 1 To 10 :");
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; ++j) {
                System.out.println(i + " " + "*" + " " + j + " " + "="  + " " + i * j);
            }
        }
    }
}

