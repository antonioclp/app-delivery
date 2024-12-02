package app.backend.code.secutiry;

import app.backend.code.services.CustomerService;
import app.backend.code.services.TokenService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Token filter.
 */
@Component
public class JwtFilter extends OncePerRequestFilter {

  private final TokenService tokenService;
  private final CustomerService customerService;

  /**
   * Constructor.
   * Token service @param tokenService
   * Customer service @param customerService
   */
  @Autowired
  public JwtFilter(TokenService tokenService, CustomerService customerService) {
    this.tokenService = tokenService;
    this.customerService = customerService;
  }

  private Optional<String> extractToken(HttpServletRequest request) {
    String authHeader = request.getHeader("Authorization");

    if (authHeader == null) {
      return Optional.empty();
    }

    return Optional.of(
        authHeader.replace("Bearer ", ""));
  }

  @Override
  protected void doFilterInternal(HttpServletRequest request,
      HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {

    Optional<String> token = extractToken(request);

    // (2) verificamos se ele existe
    if (token.isPresent()) {

      // (3) se existir, validamos o token
      String subject = tokenService.validateToken(token.get());

      // (4) se o token for válido (não houve exceção), encontramos a pessoa associada
      UserDetails userDetails = customerService.loadUserByUsername(subject);

      // (5) informamos o Spring Security que a pessoa está autenticada
      UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
          userDetails, null, userDetails.getAuthorities());
      SecurityContextHolder.getContext().setAuthentication(authentication);
    }

    // (6) continuamos com a cadeia de filtros de qualquer forma
    filterChain.doFilter(request, response);
  }

}