package az.edu.turing.repository;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<T> {
    Optional<T> findById(Long id);

    List<T> findAll();

    void save(T entity);

    void update(Long id, T entity);

    void delete(Long id);
}
