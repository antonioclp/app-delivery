package app.backend.code.controllers.dtos;

import app.backend.code.models.entities.Customer;

/**
 * Creation customer record.
 */
public record CustomerCreationDto(
    String cpf, // remove after (maybe)
    String email, // remove after (maybe)
    String fullname,
    String username,
    String password, // remove after
    int age) {

  /**
   * To entity.
   * Customer @return
   */
  public Customer toEntity() {
    return new Customer(null, cpf, email, fullname, username, password, age);
  }
}
