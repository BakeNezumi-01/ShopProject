package com.example.repos;
import com.example.domain.Cart;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
public interface CartRepo extends CrudRepository<Cart, Integer> {
    Optional<Cart> findById(Integer id);
}
