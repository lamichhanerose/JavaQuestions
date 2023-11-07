package classesQuestions.four;

 public class EmployeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager("Ram Thapa", 101, 180000, "Manager");
        Engineer engineer = new Engineer("Sujin Shrestha", 102, 270000, "Senior Data Engineer");
        Intern intern = new Intern("Annya Parajuli", 103, 15000, "TBC");


        System.out.println("Manager Information:");
        manager.displayInfo();
        manager.conductMeeting();

        System.out.println();

        System.out.println("Engineer Information:");
        engineer.displayInfo();
        engineer.code();

        System.out.println();

        System.out.println("Intern Information:");
        intern.displayInfo();
        intern.learningJava();
    }
    }