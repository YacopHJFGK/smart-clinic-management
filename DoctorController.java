package main;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    // Q5 - GET endpoint
    @GetMapping("/availability")
    public ResponseEntity<List<String>> getAvailability(@RequestParam String name) {
        // mock
        List<String> times = Arrays.asList("2025-10-05 10:00", "2025-10-05 14:00");
        return ResponseEntity.ok(times);
    }
}
