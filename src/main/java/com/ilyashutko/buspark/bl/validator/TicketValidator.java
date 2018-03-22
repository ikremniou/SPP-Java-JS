package com.ilyashutko.buspark.bl.validator;

import com.ilyashutko.buspark.modelViews.TicketView;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TicketValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        TicketView ticket = (TicketView) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "departmentTime", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "arrivalTime", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "driver", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "departmentCity", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "arrivalCity", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bus", "NotEmpty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "isInternational", "NotEmpty");

        if (ticket.getCount() < 1) {
            errors.rejectValue("count", "Size.count");
        }
        if (ticket.getPrice() < 1) {
            errors.rejectValue("price", "Size.price");
        }
        if (ticket.getDistance() < 1) {
            errors.rejectValue("distance", "Size.distance");
        }
        if (!isThisDateValid(ticket.getDepartmentTime(), "dd/MM/yyyy")) {
            errors.rejectValue("departmentTime", "Size.distance");
        }
        if (!isThisDateValid(ticket.getArrivalTime(), "dd/MM/yyyy")) {
            errors.rejectValue("arrivalTime", "Size.distance");
        }

    }

    public boolean isThisDateValid(String dateToValidate, String dateFromat){

        if(dateToValidate == null){
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e) {

            e.printStackTrace();
            return false;
        }

        return true;
    }
}
