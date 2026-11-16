/**
 * Surgeon is a subclass of HealthProfessional.
 */
public class Surgeon extends HealthProfessional {
    private String surgeryType;

    /**
     * Constructor
     * @param id professional id
     * @param name surgeon name
     * @param workingDays working days
     * @param surgeryType type of surgery this surgeon does
     */
    public Surgeon(int id, String name, String workingDays, String surgeryType) {
        super(id, name, workingDays);
        this.surgeryType = surgeryType;
    }

    @Override
    public void printInfo() {
        System.out.println("==== Surgeon ====");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Working Days: " + getWorkingDays());
        System.out.println("Surgery type: " + surgeryType);
    }
}
