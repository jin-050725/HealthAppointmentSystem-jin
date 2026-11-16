/**
 * Main class to demonstrate all functions of the system.
 */
public class AssignmentOne {
    public static void main(String[] args) {
        // Create health professionals
        HealthProfessional gp = new GeneralPractitioner(1, "Dr Smith", "Mon,Tue", "City Clinic");
        HealthProfessional nurse = new Nurse(2, "Amy", "Wed,Thu", true);
        HealthProfessional dietitian = new Dietitian(3, "Lily", "Fri", "Weight management");
        HealthProfessional surgeon = new Surgeon(4, "Dr Brown", "Mon,Thu", "Bone surgery");

        // Print professional info
        gp.printInfo();
        nurse.printInfo();

        AppointmentManager manager = new AppointmentManager();

        // Create appointments
        Appointment app1 = new Appointment("Tom", "0411111111", "2026-11-20 10:00", gp);
        Appointment app2 = new Appointment("Tom", "0411111111", "2026-11-20 10:00", nurse);
        Appointment app3 = new Appointment("Anna", "0422222222", "2026-11-20 14:00", dietitian);

        System.out.println("\n--- Add appointments ---");
        manager.addAppointment(app1);
        manager.addAppointment(app2); // This one is duplicate, will be rejected
        manager.addAppointment(app3);

        System.out.println("\n--- Search Tom's appointment ---");
        manager.findByPhone("0411111111");

        System.out.println("\n--- Cancel appointment ---");
        manager.cancelAppointment("0411111111", "2026-11-20 10:00");

        System.out.println("\n--- All appointments now ---");
        manager.printAllAppointments();
    }
}
