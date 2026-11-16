/**
 * Nurse is a subclass of HealthProfessional.
 */
public class Nurse extends HealthProfessional {
    private boolean canTakeBloodSample;

    /**
     * Constructor
     * @param id professional id
     * @param name nurse name
     * @param workingDays working days
     * @param canTakeBloodSample whether this nurse can take blood samples
     */
    public Nurse(int id, String name, String workingDays, boolean canTakeBloodSample) {
        super(id, name, workingDays);
        this.canTakeBloodSample = canTakeBloodSample;
    }

    @Override
    public void printInfo() {
        System.out.println("==== Nurse ====");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Working Days: " + getWorkingDays());
        System.out.println("Can take blood sample: " + canTakeBloodSample);
    }
}

