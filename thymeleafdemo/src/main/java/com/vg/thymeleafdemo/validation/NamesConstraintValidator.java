package com.vg.thymeleafdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NamesConstraintValidator implements ConstraintValidator<OnlyAlpha, String> {

    @Override
    public void initialize(OnlyAlpha constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null) return true;
        return s.matches("[a-zA-Z]+");
    }
}
