package main;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.*;

@Service
public class AppointmentService {

    private final List<Appointment> appointments = new ArrayList<>();

    // Q6 - booking method
    public Appointment book(Appointment appointment) {
        appointments.add(appointment);
        return appointment;
    }

    // Q6 - retrieve by date
    public List<Appointment> getAppointmentsForDoctor(Long doctorId, LocalDate date) {
        return appointments.stream()
                .filter(a -> a.getDoctor().getDoctorId().equals(doctorId)
                        && a.getAppointmentTime().toLocalDate().equals(date))
                .toList();
    }
}
