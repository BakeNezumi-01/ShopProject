package com.example.repos;
import com.example.domain.Good;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
public interface GoodRepo extends CrudRepository<Good, Integer> {
    Optional<Good> findById(Integer id);
}
