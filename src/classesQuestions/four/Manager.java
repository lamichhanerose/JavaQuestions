package classesQuestions.four;

public class Manager extends Employee {
    private String department;


    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    public void conductMeeting() {
        System.out.println("Manager is conducting a meeting.");
    }
}