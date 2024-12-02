package app.backend.code.controllers.dtos;

import app.backend.code.models.entities.Customer;

/**
 * Customer dto.
 */
public record CustomerDto(
    String email,
    String fullname,
    String username,
    int age) {

  /**
   * From entity.
   * Customer @param customer
   * Customer dto @return
   */
  public static CustomerDto fromEntity(Customer customer) {
    return new CustomerDto(
        customer.getEmail(),
        customer.getFullname(),
        customer.getUsername(),
        customer.getAge());
  }
}
