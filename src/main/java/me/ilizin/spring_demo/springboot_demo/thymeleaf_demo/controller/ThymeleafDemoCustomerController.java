package me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.controller;

import jakarta.validation.Valid;
import me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ThymeleafDemoCustomerController {

    // Pre-process every String form data
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        // Removes whitespaces leading and trailing, true parameter means trim empty string to null
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/showCustomerForm")
    // The Model allows to share information between Controllers and view pages (Thymeleaf)
    public String showCustomerForm(Model model) {
        /* The first item here is the name and then the second item's the value. The name is something important
            because we'll actually use that name in our view pages like our HTML forms and so forth.
            And also the value here we simply start off with an empty customer instance. And this is required
            because we're using HTML form data binding. */
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/processCustomerForm")
    /* The Valid annotation tells Spring MVC to perform validation using the validation rules
       we've defined in the Customer class.
       The bindingResult holds the result of the validation */
    public String processCustomerForm(@Valid @ModelAttribute("customer") Customer customer,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}
