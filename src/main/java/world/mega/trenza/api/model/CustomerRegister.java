package world.mega.trenza.api.model;

import jakarta.validation.constraints.*;
import world.mega.trenza.api.enums.IdType;
import world.mega.trenza.api.validation.ValidIdNumber;

@ValidIdNumber
public record CustomerRegister(

        @NotBlank(message = "First name is required")
        @Size(min = 1, max = 100, message = "First name must be between 1 and 100 characters")
        String firstName,

        @NotBlank(message = "Last name is required")
        @Size(min = 1, max = 100, message = "Last name must be between 1 and 100 characters")
        String lastName,

        @NotBlank(message = "Email is required")
        @Email(message = "Email must be a valid address (e.g. user@domain.tld)")
        @Size(max = 320, message = "Email must not exceed 320 characters")
        String email,

        @NotBlank(message = "Phone number is required")
        @Pattern(regexp = "^\\+[1-9]\\d{1,18}$", message = "Phone must be in E.164 format (e.g. +447911123456)")
        @Size(max = 20, message = "Phone number must not exceed 20 characters")
        String phoneNo,

        @NotNull(message = "ID type is required and must be one of: NIC, PASSPORT, DRIVING_LICENSE")
        IdType idType,

        @NotBlank(message = "ID number is required")
        @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "ID number must be alphanumeric with no spaces")
        String idNumber
) {}
