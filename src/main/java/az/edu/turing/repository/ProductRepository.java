package az.edu.turing.repository;

import az.edu.turing.model.Product;
import az.edu.turing.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository implements GenericRepository<Product> {

    private List<Product> products =new ArrayList<>();

    @Override
    public Optional<Product> findById(Long id) {
        for (Product product: products){
            if (product.getId().equals(id)){
                return Optional.of(product);
            }
        }
        return null;
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
        delete(id);
        save(product);
    }

    @Override
    public void delete(Long id) {
        for (int i =0; i<products.size();i++){
            if (products.get(i).getId().equals(id)){
                products.remove(i);
                break;
            }
        }
    }
}
