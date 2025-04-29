package com.seccion4.respo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/api/personas")
@RestController

public class PersonaController {
    @GetMapping
    public String saludar()
    {
        return "Hola mundo";
    }
    
    
}
