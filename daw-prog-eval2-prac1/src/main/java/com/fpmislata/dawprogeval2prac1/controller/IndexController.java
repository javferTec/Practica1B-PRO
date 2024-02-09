package com.fpmislata.dawprogeval2prac1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("")
    public String index() {
        return "redirect:/libros";
    }
}
