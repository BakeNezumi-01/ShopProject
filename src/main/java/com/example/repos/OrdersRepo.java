package com.example.repos;
import com.example.domain.Orders;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
public interface OrdersRepo extends CrudRepository<Orders, Integer> {
    Optional<Orders> findById(Integer id);
}
