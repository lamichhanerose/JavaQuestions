package classesQuestions.four;

public class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, int employeeId, double salary, String specialization) {
        super(name, employeeId, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }

    public void code() {
        System.out.println("Engineer is working.");
    }
}