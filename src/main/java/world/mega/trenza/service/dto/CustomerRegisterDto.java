package world.mega.trenza.service.dto;

public record CustomerRegisterDto(
        String firstName,
        String lastName,
        String email,
        String phoneNo,
        String idType,
        String idNumber
) {}
