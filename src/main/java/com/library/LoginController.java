package com.library;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    // VULNERABLE: hardcoded secret - will be detected by secret scanning
    private static final String DB_PASSWORD = "admin123";

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        // VULNERABLE: SQL injection pattern - will be detected by SAST
        String query = "SELECT * FROM users WHERE username='"
                       + username + "' AND password='" + password + "'";

        if (username.equals("admin") && password.equals(DB_PASSWORD)) {
            return "Login successful";
        }
        return "Login failed";
    }
}