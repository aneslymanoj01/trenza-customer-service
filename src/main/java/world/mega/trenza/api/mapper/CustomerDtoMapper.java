package world.mega.trenza.api.mapper;


import org.mapstruct.Mapper;
import world.mega.trenza.api.model.CustomerRegister;
import world.mega.trenza.service.dto.CustomerRegisterDto;

@Mapper(componentModel = "spring")
public interface CustomerDtoMapper {

    CustomerRegisterDto requestToDto(CustomerRegister request);
}
