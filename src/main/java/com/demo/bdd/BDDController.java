package com.demo.bdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BDDController {

    @GetMapping("/api/bdd")
    public String testBdd() {
        return "This is return from BDD";
    }
}
