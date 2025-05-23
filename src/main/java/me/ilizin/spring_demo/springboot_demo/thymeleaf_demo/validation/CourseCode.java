package me.ilizin.spring_demo.springboot_demo.thymeleaf_demo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) //Retain this annotation in the Java class file
public @interface CourseCode {
    public String value() default "LUV";

    public String message() default "must start with LUV";

    // Define default groups
    public Class<?>[] groups() default {};

    // Define default payloads
    // Payloads: provide custom details about validation failure (severity level, error code, etc.)
    public Class<? extends Payload>[] payload() default {};
}
