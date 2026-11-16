/**
 * Abstract parent class for all health professionals.
 * We cannot create an instance of this class directly.
 */
public abstract class HealthProfessional {
    private int id;
    private String name;
    private String workingDays;

    /**
     * Constructor
     * @param id unique identification number
     * @param name name of the health professional
     * @param workingDays available working days
     */
    public HealthProfessional(int id, String name, String workingDays) {
        this.id = id;
        this.name = name;
        this.workingDays = workingDays;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    /**
     * Abstract method to print details.
     * All subclasses must implement this method.
     */
    public abstract void printInfo();
}
