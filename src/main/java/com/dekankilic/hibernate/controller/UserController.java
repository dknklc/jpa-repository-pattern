package com.dekankilic.hibernate.controller;


import com.dekankilic.hibernate.repository.UserRepository;
import com.dekankilic.hibernate.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        userRepository.save(user);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userRepository.findById(id));
    }
}
