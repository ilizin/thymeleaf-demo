package me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.controller;

import me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafDemoCustomerController {

    @GetMapping("/")
    // The Model allows to share information between Controllers and view pages (Thymeleaf)
    public String showForm(Model model) {
        /* The first item here is the name and then the second item's the value. The name is something important
            because we'll actually use that name in our view pages like our HTML forms and so forth.
            And also the value here we simply start off with an empty customer instance. And this is required
            because we're using HTML form data binding. */
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }
}
