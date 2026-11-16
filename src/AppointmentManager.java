/**
 * AppointmentManager manages all appointments.
 * It can add, search and cancel appointments.
 */
import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> appointmentList;

    /**
     * Constructor
     */
    public AppointmentManager() {
        appointmentList = new ArrayList<>();
    }

    /**
     * Add a new appointment.
     * Reject if the patient already has an appointment at the same time.
     * @param newAppointment new appointment object
     */
    public void addAppointment(Appointment newAppointment) {
        boolean exist = false;
        for (Appointment a : appointmentList) {
            if (a.getPatientPhone().equals(newAppointment.getPatientPhone())
                    && a.getTime().equals(newAppointment.getTime())) {
                exist = true;
                break;
            }
        }
        if (exist) {
            System.out.println("Cannot add. This appointment already exists.");
        } else {
            appointmentList.add(newAppointment);
            System.out.println("Appointment added successfully.");
        }
    }

    /**
     * Find all appointments by patient phone number
     * @param phone patient phone
     */
    public void findByPhone(String phone) {
        boolean found = false;
        for (Appointment a : appointmentList) {
            if (a.getPatientPhone().equals(phone)) {
                a.printAppointment();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No appointment found for this phone.");
        }
    }

    /**
     * Cancel appointment by phone and time
     * @param phone patient phone
     * @param time appointment time
     */
    public void cancelAppointment(String phone, String time) {
        for (int i = 0; i < appointmentList.size(); i++) {
            Appointment a = appointmentList.get(i);
            if (a.getPatientPhone().equals(phone) && a.getTime().equals(time)) {
                appointmentList.remove(i);
                System.out.println("Appointment cancelled.");
                return;
            }
        }
        System.out.println("Cancel failed, appointment not found.");
    }

    /**
     * Print all appointments in the system
     */
    public void printAllAppointments() {
        if (appointmentList.isEmpty()) {
            System.out.println("No appointments.");
            return;
        }
        for (Appointment a : appointmentList) {
            a.printAppointment();
        }
    }
}

