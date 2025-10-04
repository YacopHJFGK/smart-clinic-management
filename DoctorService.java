package main;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class DoctorService {

    public List<String> getAvailableSlots(String doctorName, String date) {
        return Arrays.asList("10:00", "14:00");
    }

    public String validateLogin(String email, String password) {
        if(email.equals("doctor@test.com") && password.equals("123")) {
            return "Login success";
        }
        return "Invalid credentials";
    }
}
