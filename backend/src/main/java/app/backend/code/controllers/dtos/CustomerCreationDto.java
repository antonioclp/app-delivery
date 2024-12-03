package app.backend.code.controllers.dtos;

import app.backend.code.models.entities.Customer;
import java.time.LocalDateTime;

/**
 * Creation customer record.
 */
public record CustomerCreationDto(
    String cpf,
    String email,
    String fullname,
    String username,
    String password,
    int age,
    LocalDateTime createdAt) {

  /**
   * To entity.
   * Customer @return
   */
  public Customer toEntity() {
    return new Customer(null, cpf, email, fullname, username, password, age, createdAt);
  }
}
