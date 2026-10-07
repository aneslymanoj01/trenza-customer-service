package world.mega.trenza.api.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import world.mega.trenza.api.model.CustomerRegister;

public class IdNumberValidator implements ConstraintValidator<ValidIdNumber, CustomerRegister> {

    @Override
    public boolean isValid(CustomerRegister value, ConstraintValidatorContext context) {
        if (value.idType() == null || value.idNumber() == null) return true;
        int len = value.idNumber().length();
        return switch (value.idType()) {
            case NIC -> len >= 9 && len <= 12;
            case PASSPORT -> len >= 6 && len <= 9;
            case DRIVING_LICENSE -> len >= 5 && len <= 20;
        };
    }
}
