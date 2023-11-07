package classesQuestions.four;

public class Intern extends Employee {
    private String collegeName;


    public Intern(String name, int employeeId, double salary, String collegeName) {
        super(name, employeeId, salary);
        this.collegeName = collegeName;
    }


    public String getCollegeName() {
        return collegeName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("College Name: " + collegeName);
    }

    public void learningJava() {
        System.out.println("Intern is learning java.");
    }
}