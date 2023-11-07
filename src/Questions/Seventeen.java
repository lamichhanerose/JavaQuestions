package Questions;

import java.util.Scanner;

//AREA OF CIRCLE

public class Seventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = calculateCircleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }

    public static double calculateCircleArea(double radius) {

        return Math.PI * Math.pow(radius, 2);
    }

}
