package az.edu.turing.repository;

import az.edu.turing.model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderRepository implements GenericRepository<Order> {

    private List<Order> orders = new ArrayList<>();

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Order> findAll() {
        return List.of();
    }

    @Override
    public void save(Order order) {
        orders.add(order);
    }

    @Override
    public void update(Long id, Order order) {

    }

    @Override
    public void delete(Long id) {

    }
}
