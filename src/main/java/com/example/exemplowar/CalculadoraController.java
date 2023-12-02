package com.example.exemplowar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/ola")
    public String hello(){
        return "Mini Curso de Jenkins!";
    }
}
