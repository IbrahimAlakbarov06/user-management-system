package az.edu.turing.repository;

import az.edu.turing.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository implements GenericRepository<Product> {

    private List<Product> products =new ArrayList<>();

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void save(Product product) {
        products.add(product);

    }

    @Override
    public void update(Long id, Product product) {

    }

    @Override
    public void delete(Long id) {

    }
}
