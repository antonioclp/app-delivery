package app.backend.code.models.repositories;

import app.backend.code.models.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Customer repository.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
