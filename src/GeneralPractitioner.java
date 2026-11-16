/**
 * GeneralPractitioner is a subclass of HealthProfessional.
 * It represents a family doctor.
 */
public class GeneralPractitioner extends HealthProfessional {
    private String clinicName;

    /**
     * Constructor
     * @param id professional id
     * @param name doctor name
     * @param workingDays working days
     * @param clinicName the clinic this doctor belongs to
     */
    public GeneralPractitioner(int id, String name, String workingDays, String clinicName) {
        super(id, name, workingDays);
        this.clinicName = clinicName;
    }

    @Override
    public void printInfo() {
        System.out.println("==== General Practitioner ====");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Working Days: " + getWorkingDays());
        System.out.println("Clinic: " + clinicName);
    }
}
