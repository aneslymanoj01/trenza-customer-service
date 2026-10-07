package world.mega.trenza.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.mega.trenza.api.model.CustomerRegister;
import world.mega.trenza.api.model.CustomerRegisterResponse;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

    @PostMapping
    public ResponseEntity<CustomerRegisterResponse> onBoardCustomer(@Valid @RequestBody CustomerRegister customerRegister){

        return new ResponseEntity<>(new CustomerRegisterResponse(0, "Success", "1"), HttpStatus.CREATED);
    }
}
