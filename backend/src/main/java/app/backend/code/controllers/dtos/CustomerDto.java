package app.backend.code.controllers.dtos;

import app.backend.code.models.entities.Customer;

/**
 * Customer dto.
 */
public record CustomerDto(
    Integer id,
    String cpf,
    String email,
    String fullname,
    String username,
    String password,
    int age) {

  /**
   * From entity.
   * Customer @param customer
   * Customer dto @return
   */
  public static CustomerDto fromEntity(Customer customer) {
    return new CustomerDto(
        customer.getId(),
        customer.getCpf(),
        customer.getEmail(),
        customer.getFullname(),
        customer.getUsername(),
        customer.getPassword(),
        customer.getAge());
  }
}
