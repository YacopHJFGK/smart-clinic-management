package com.clinic.controller;

import com.clinic.model.Prescription;
import com.clinic.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping
    public ResponseEntity<?> addPrescription(@RequestBody Prescription prescription) {
        return ResponseEntity.ok(prescriptionService.addPrescription(prescription));
    }

    @GetMapping("/{appointmentId}")
    public ResponseEntity<?> getPrescription(@PathVariable Long appointmentId) {
        Prescription p = prescriptionService.getPrescriptionByAppointment(appointmentId);
        if (p == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(p);
    }
}
