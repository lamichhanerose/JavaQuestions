package classesQuestions.one;

import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);
        System.out.println("Area of Circle: " + circle.calculateArea());


        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Shape rectangle = new Rectangle(rectangleLength, rectangleWidth);

        scanner.close();

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}