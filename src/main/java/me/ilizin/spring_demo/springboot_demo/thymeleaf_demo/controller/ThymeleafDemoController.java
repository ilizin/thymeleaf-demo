package me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class ThymeleafDemoController {

    @GetMapping("/serverDateAndTime")
    public String getServerDateAndTime(Model model) {
        model.addAttribute("theDate", LocalDateTime.now());
        /* We've Thymeleaf dependency in maven pom, so springboot will autoconfigure to use thymeleaf.
           So when we return server-date-and-time, it's gonna look in source/main/resources/templates
           for a server-date-and-time.html. */
        return "server-date-and-time";
    }
}
