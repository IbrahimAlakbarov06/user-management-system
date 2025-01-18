package az.edu.turing.repository;

import az.edu.turing.exception.OrderException;
import az.edu.turing.exception.ProductException;
import az.edu.turing.model.Product;
import az.edu.turing.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository implements GenericRepository<Product> {

    private List<Product> products = new ArrayList<>();

    @Override
    public Optional<Product> findById(Long id) {
        try {
            for (Product product : products) {
                if (product.getId().equals(id)) {
                    return Optional.of(product);
                }
            }
            throw new ProductException("Product with id-" + id + " not found.");
        } catch (ProductException e) {
            System.out.println(e.getMessage());
            return Optional.empty();

        }
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);

    }

    @Override
    public void update(Long id, Product product) {
        try {
            delete(id);
            save(product);
        } catch (OrderException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Long id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.remove(i);
                break;
            }
        }
    }
}
