package main;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody String prescription, @RequestParam String token) {
        if(token == null || token.isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid token");
        }
        return ResponseEntity.ok("Prescription saved: " + prescription);
    }
}
