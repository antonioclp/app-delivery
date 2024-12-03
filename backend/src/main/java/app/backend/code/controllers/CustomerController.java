package app.backend.code.controllers;

import app.backend.code.controllers.dtos.CustomerCreationDto;
import app.backend.code.controllers.dtos.CustomerDto;
import app.backend.code.controllers.dtos.ResponseDto;
import app.backend.code.models.entities.Customer;
import app.backend.code.services.CustomerService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Customer controller.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
  private CustomerService customerService;

  /**
   * Dependencies injection.
   * Customer service @param customerService
   */
  @Autowired
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  /**
   * Method that comunicate with service and register new costumer.
   * Object customer @param customer
   * Default response @return
   */
  @PostMapping("/create")
  public ResponseEntity<ResponseDto<CustomerDto>> create(
      @RequestBody CustomerCreationDto customer) {
    try {
      Customer newCustomer = customerService.create(customer.toEntity());
      CustomerDto customerDto = CustomerDto.fromEntity(newCustomer);

      ResponseDto<CustomerDto> res = new ResponseDto<CustomerDto>(
          customerDto, "customer registered sucessfully.");

      return ResponseEntity.status(HttpStatus.SC_CREATED).body(res);
    } catch (Exception e) {
      ResponseDto<CustomerDto> res = new ResponseDto<CustomerDto>(
          null, "an internal error occurred.");

      return ResponseEntity.status(HttpStatus.SC_INTERNAL_SERVER_ERROR).body(res);
    }
  }
}
