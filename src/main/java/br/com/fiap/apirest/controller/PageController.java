package br.com.fiap.apirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @GetMapping("/")
    public String inicio() {
        return  "Página inicial";
    }
}
