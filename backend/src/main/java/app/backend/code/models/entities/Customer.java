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

  @Column(name = "fullname", nullable = false)
  private String fullname;

  @Column(name = "name", nullable = false)
  private String username;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "age", nullable = false)
  private int age;

  /**
   * Entity constructor.
   * Customer id @param id
   * Customer cpf @param cpf
   * Customer email @param email
   * Customer fullname @param fullname
   * Customer username @param username
   * Customer password @param password
   * Customer age @param age
   */
  public Customer(
      Integer id,
      String cpf,
      String email,
      String fullname,
      String username,
      String password,
      int age) {
    this.id = id;
    this.cpf = cpf;
    this.email = email;
    this.fullname = fullname;
    this.username = username;
    this.password = password;
    this.age = age;
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

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
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
