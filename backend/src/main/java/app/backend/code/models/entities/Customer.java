package app.backend.code.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Customer entity.
 */
@Entity
@Table(name = "customers")
public class Customer implements UserDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "cpf", unique = true, nullable = false)
  private String cpf;

  @Column(name = "email", unique = true, nullable = false)
  private String email;

  @Column(name = "name", nullable = false)
  private String username;

  @Column(name = "password", nullable = false)
  private String password;

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

  @Override
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return List.of();
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
