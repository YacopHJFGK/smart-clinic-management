package com.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/{id}/availability")
    public ResponseEntity<?> getDoctorAvailability(@PathVariable Long id,
                                                   @RequestHeader("Authorization") String token) {
        // TODO: validate token (fake check for now)
        if (!token.startsWith("Bearer ")) {
            return ResponseEntity.status(401).body("Invalid token");
        }

        // fake data for now
        List<String> availableTimes = List.of("2025-10-05 10:00", "2025-10-05 14:00");
        return ResponseEntity.ok(availableTimes);
    }
}
