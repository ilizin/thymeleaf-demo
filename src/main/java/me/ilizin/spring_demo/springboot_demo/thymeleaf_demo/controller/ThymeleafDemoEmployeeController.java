package me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.controller;

import me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ThymeleafDemoEmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(ThymeleafDemoEmployeeController.class);

    @Value("${countries}")
    private List<String> countries;

    @GetMapping("/showEmployeeForm")
    public String showEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        model.addAttribute("countries", countries);
        return "employee-form";
    }

    @PostMapping("/processEmployeeForm")
    public String processEmployeeForm(@ModelAttribute("employee") Employee employee) {
        logger.debug("Name: {}, surname: {}", employee.getName(), employee.getSurname());
        return "employee-confirmation";
    }
}
