package com.clinic.service;

import com.clinic.model.Appointment;
import com.clinic.model.Doctor;
import com.clinic.repository.AppointmentRepository;
import com.clinic.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepo;

    @Autowired
    private DoctorRepository doctorRepo;

    public String bookAppointment(Long doctorId, Appointment appointment) {
        Doctor doctor = doctorRepo.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        LocalDateTime time = appointment.getAppointmentTime();
        boolean exists = appointmentRepo.existsByDoctorAndAppointmentTime(doctor, time);

        if (exists) {
            return "Time slot already booked.";
        }

        appointment.setDoctor(doctor);
        appointmentRepo.save(appointment);
        return "Appointment booked successfully.";
    }
}
