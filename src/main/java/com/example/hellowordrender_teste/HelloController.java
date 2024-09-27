package com.example.hellowordrender_teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloRENDERteste")
    public String helloWorld() {
        return "Hello, World RENDER TESTE com PIPELINE correta!";
    }
}
