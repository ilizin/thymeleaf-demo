package me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    /* We're basically going to make use of RequestParam spring annotation, behind the scene spring will read
       the parameter 'somethingToSay' from the request and bind it to the variable somethingToSay. */
    @RequestMapping("/processForm2")
    public String processForm2(@RequestParam("somethingToSay") String somethingToSay, Model model) {
        model.addAttribute("somethingToSayInUppercase", somethingToSay.toUpperCase());
        return "hello";
    }
}
