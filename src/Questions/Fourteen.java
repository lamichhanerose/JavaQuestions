package Questions;

import java.util.Scanner;

public class Fourteen {

    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0 , remainder);
            decimalNumber = decimalNumber / 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = decimalToBinary(decimalNumber);

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryNumber);

        scanner.close();
    }
}


