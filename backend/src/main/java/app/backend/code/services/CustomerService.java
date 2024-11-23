package app.backend.code.services;

import app.backend.code.models.entities.Customer;
import app.backend.code.models.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Customer service.
 */
@Service
public class CustomerService implements UserDetailsService {
  private CustomerRepository customerRepository;

  /**
   * Dependency injection.
   */
  @Autowired
  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  /**
   * Method that create a new customer in database.
   * Customer object @param customer
   * Customer @return
   */
  public Customer create(Customer customer) {
    String hashedPassword = new BCryptPasswordEncoder()
        .encode(customer.getPassword());

    customer.setPassword(hashedPassword);

    return customerRepository.save(customer);
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return customerRepository.findByUsername(username)
        .orElseThrow(() -> new UsernameNotFoundException(username));
  }
}