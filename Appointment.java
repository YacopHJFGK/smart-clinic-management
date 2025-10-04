package main;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private Patient patient;

    @Column(nullable = false)
    private LocalDateTime appointmentTime; // Q4 yêu cầu

    private String status;

    // getters & setters
}
