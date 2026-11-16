/**
 * Appointment stores information of one patient appointment.
 */
public class Appointment {
    private String patientName;
    private String patientPhone;
    private String time;
    private HealthProfessional professional;

    /**
     * Constructor
     * @param patientName name of patient
     * @param patientPhone phone number of patient
     * @param time appointment time
     * @param professional the health professional for this appointment
     */
    public Appointment(String patientName, String patientPhone, String time, HealthProfessional professional) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.time = time;
        this.professional = professional;
    }

    // Getters
    public String getPatientPhone() {
        return patientPhone;
    }

    public String getTime() {
        return time;
    }

    public void printAppointment() {
        System.out.println("----- Appointment -----");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Phone: " + patientPhone);
        System.out.println("Time: " + time);
        System.out.println("Professional: " + professional.getName());
    }
}

