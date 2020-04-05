package com.infosys.ekart.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = ConfirmPasswordConstraintValidator.class)
@Target({ ElementType.ANNOTATION_TYPE ,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfirmPassword {

    String message() default "Passwords do not match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    String first();
    String second();
}