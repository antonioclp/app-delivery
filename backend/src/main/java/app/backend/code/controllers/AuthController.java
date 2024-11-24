package app.backend.code.controllers;

import app.backend.code.controllers.dtos.AuthDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Authentication controller.
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

  private final AuthenticationManager authenticationManager;

  /**
   * Dependencies injection.
   * Authentication manager @param authenticationManager
   */
  @Autowired
  public AuthController(AuthenticationManager authenticationManager) {
    this.authenticationManager = authenticationManager;
  }

  /**
   * Method that authenticate the login.
   * AuthDto @param authDto
   * Response @return
   */
  @PostMapping("/login")
  public String login(@RequestBody AuthDto authDto) {
    UsernamePasswordAuthenticationToken usernamePassword = new UsernamePasswordAuthenticationToken(
        authDto.username(),
        authDto.password());

    Authentication auth = authenticationManager.authenticate(usernamePassword);

    return "Pessoa autenticada com sucesso: %s".formatted(auth.getName());
  }
}