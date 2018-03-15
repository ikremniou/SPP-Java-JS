package com.ilyashutko.buspark.bl.validator;

import com.ilyashutko.buspark.bl.UserService;
import com.ilyashutko.buspark.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

@Component
public class UserValidator implements Validator {
    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirm", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "surname", "NotEmpty");

        if (user.getUsername().length() < 8 || user.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        if (userService.findByUsername(user.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!user.getPasswordConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }

        if (user.getName().length() < 2){
            errors.rejectValue("name", "Size.name.surname.small");
        }

        if (user.getName().length() > 100){
            errors.rejectValue("name", "Size.name.surname.big");
        }

        if (user.getSurname().length() < 2){
            errors.rejectValue("surname", "Size.name.surname.small");
        }

        if (user.getSurname().length() > 100){
            errors.rejectValue("surname", "Size.name.surname.big");
        }

        Pattern pattern = Pattern.compile("^[a-z,A-Z]+$");

        if (!pattern.matcher(user.getName()).matches()){
            errors.rejectValue("name", "Name.surname.patternMissmatch");
        }

        if (!pattern.matcher(user.getSurname()).matches()){
            errors.rejectValue("surname", "Name.surname.patternMissmatch");
        }

        Pattern patternLogin = Pattern.compile("^[a-z,A-Z,0-9]+$");

        if (!patternLogin.matcher(user.getUsername()).matches()){
            errors.rejectValue("username", "Name.surname.patternMissmatch");
        }
    }
}