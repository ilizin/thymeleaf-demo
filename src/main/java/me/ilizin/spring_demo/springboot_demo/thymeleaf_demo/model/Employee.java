package me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.model;

public class Employee {
    private String name;

    private String surname;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
