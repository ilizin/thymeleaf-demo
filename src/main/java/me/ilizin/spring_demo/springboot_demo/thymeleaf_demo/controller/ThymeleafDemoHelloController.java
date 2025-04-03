package me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafDemoHelloController {

    // The controller method to show the initial form
    @RequestMapping("/showForm")
    public String showForm() {
        return "hello-form";
    }

    // The controller method to process the form
    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) {
        // read the request parameter from the HTML form
        String something = request.getParameter("somethingToSay");
        model.addAttribute("somethingToSayInUppercase", something.toUpperCase());

        return "hello";
    }
}
