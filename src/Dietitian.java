/**
 * Dietitian is a subclass of HealthProfessional.
 */
public class Dietitian extends HealthProfessional {
    private String specialty;

    /**
     * Constructor
     * @param id professional id
     * @param name dietitian name
     * @param workingDays working days
     * @param specialty nutrition specialty
     */
    public Dietitian(int id, String name, String workingDays, String specialty) {
        super(id, name, workingDays);
        this.specialty = specialty;
    }

    @Override
    public void printInfo() {
        System.out.println("==== Dietitian ====");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Working Days: " + getWorkingDays());
        System.out.println("Specialty: " + specialty);
    }
}
