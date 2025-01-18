package az.edu.turing;

import java.util.List;
import java.util.Optional;

public interface GenericRepository <T>{
    Optional<T> findById(long id);
    List<T> findAll();
    void save();
    void update(long id);
    void delete(long id);
}
