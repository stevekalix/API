package com.example.Secondabi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class std {

    @GetMapping("/")
    public List<Student> hello() {
            return List.of(
                    new Student("alex","robert",12),
                    new Student("Don","robert",90),
                    new Student("martin","gabtil",21)
            );
    }
}
