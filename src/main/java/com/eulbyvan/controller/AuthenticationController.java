package com.eulbyvan.controller;

import com.eulbyvan.model.User;
import com.eulbyvan.shared.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private User user = new User("stu", "pid");

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping
    public ResponseEntity login(@RequestBody User reqUser) {
        String username = user.getUsername();
        String password = user.getPassword();
        String reqUsername = reqUser.getUsername();
        String reqPassword = reqUser.getPassword();

        if (username.equals(reqUsername) && password.equals(reqPassword)) return ResponseEntity.ok(jwtUtil.generateToken("stupid"));

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("gagal bos");
    }

    @GetMapping
    public ResponseEntity validate(@RequestParam String token) {
        return ResponseEntity.ok(jwtUtil.validateToken(token));
    }

}
