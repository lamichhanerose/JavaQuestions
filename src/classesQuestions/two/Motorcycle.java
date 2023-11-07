package classesQuestions.two;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}