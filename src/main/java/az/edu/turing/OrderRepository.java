package az.edu.turing;

import java.util.List;
import java.util.Optional;

public class OrderRepository implements GenericRepository<Order>{
    @Override
    public Optional<Order> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Order> findAll() {
        return List.of();
    }


    @Override
    public void save() {

    }

    @Override
    public void update(long id) {

    }

    @Override
    public void delete(long id) {

    }
}
