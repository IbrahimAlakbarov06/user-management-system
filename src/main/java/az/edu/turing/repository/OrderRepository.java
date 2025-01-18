package az.edu.turing.repository;

import az.edu.turing.model.Order;
import az.edu.turing.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderRepository implements GenericRepository<Order> {

    private List<Order> orders = new ArrayList<>();

    @Override
    public Optional<Order> findById(Long id) {
        for (Order order: orders){
            if (order.getId().equals(id)){
                return Optional.of(order);
            }
        }
        return null;    }

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
        delete(id);
        save(order);
    }

    @Override
    public void delete(Long id) {
        for (int i =0; i<orders.size();i++){
            if (orders.get(i).getId().equals(id)){
                orders.remove(i);
                break;
            }
        }
    }
}
