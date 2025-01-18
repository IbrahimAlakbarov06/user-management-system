package az.edu.turing;

import java.util.List;
import java.util.Optional;

public class ProductRepository implements GenericRepository<Product>
{
    @Override
    public Optional<Product> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
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
