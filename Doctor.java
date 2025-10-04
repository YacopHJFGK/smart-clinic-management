package com.clinic.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String specialization;

    @ElementCollection
    private List<String> availableTimes;

    // Getters & Setters
}
