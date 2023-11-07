package classesQuestions.two;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", "2020", 2022, 4);
        Vehicle motorcycle = new Motorcycle("Pulsar", "2020", 2021, true);


        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println();

        System.out.println("Motorcycle Details:");
        motorcycle.displayInfo();
    }
}