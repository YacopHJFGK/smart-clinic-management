package main;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String name;
    private String email;
    private String specialization;

    @ElementCollection
    private List<String> availableTimes; // Q3 yêu cầu

    // getters & setters
}
