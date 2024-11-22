package app.backend.code.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Customer entity.
 */
@Entity
@Table(name = "customers")
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

  @Column(name = "cpf", unique = true, nullable = false)
  String cpf;

  @Column(name = "email", unique = true, nullable = false)
  String email;

  @Column(name = "name", nullable = false)
  String username;

  @Column(name = "password", nullable = false)
  String password;

  /**
   * Entity constructor.
   * Customer id @param id
   * Customer cpf @param cpf
   * Customer email @param email
   * Customer username @param username
   * Customer password @param password
   */
  public Customer(Integer id, String cpf, String email, String username, String password) {
    this.id = id;
    this.cpf = cpf;
    this.email = email;
    this.username = username;
    this.password = password;
  }

  /**
   * Default constructor.
   */
  public Customer() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
