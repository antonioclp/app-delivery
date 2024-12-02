package app.backend.code.controllers;

import app.backend.code.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
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

}
