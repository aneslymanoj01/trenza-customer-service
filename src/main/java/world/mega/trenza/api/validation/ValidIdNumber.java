package world.mega.trenza.api.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdNumberValidator.class)
public @interface ValidIdNumber {
    String message() default "ID number length is invalid for the given ID type: NIC (9–12), PASSPORT (6–9), DRIVING_LICENSE (5–20)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
