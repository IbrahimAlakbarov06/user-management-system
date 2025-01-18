package az.edu.turing.repository;

import az.edu.turing.exception.OrderException;
import az.edu.turing.exception.ProductException;
import az.edu.turing.model.Order;
import az.edu.turing.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderRepository implements GenericRepository<Order> {

    private List<Order> orders = new ArrayList<>();

    @Override
    public Optional<Order> findById(Long id) {
        try {
            for (Order order : orders) {
                if (order.getId().equals(id)) {
                    return Optional.of(order);
                }
            }
            throw new ProductException("Order with id-" + id + " not found.");
        } catch (OrderException e) {
            System.out.println(e.getMessage());
            return null;

        }
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public void save(Order order) {
        orders.add(order);
    }

    @Override
    public void update(Long id, Order order) {
        try {
            delete(id);
            save(order);
        } catch (OrderException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Long id) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId().equals(id)) {
                orders.remove(i);
                break;
            }
        }
    }
}
