package az.edu.turing;

import az.edu.turing.model.Order;
import az.edu.turing.model.Product;
import az.edu.turing.model.User;
import az.edu.turing.repository.OrderRepository;
import az.edu.turing.repository.ProductRepository;
import az.edu.turing.repository.UserRepository;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        OrderRepository orderRepository = new OrderRepository();
        ProductRepository productRepository = new ProductRepository();

        userRepository.save(new User(1L, "Vusal"));
        userRepository.save(new User(2L, "Revan"));
        userRepository.save(new User(3L, "Ibis"));


        productRepository.save(new Product(4L, "Computer", 2000));
        productRepository.save(new Product(5L, "Iphone", 2500));

        orderRepository.save(new Order(1L, 1L, 1L));
        orderRepository.save(new Order(2L, 2L, 2L));

        System.out.println("Users: " + userRepository.findAll());
        System.out.println("Products: " + productRepository.findAll());

        productRepository.update(4l, new Product(4L, "TV", 10000));
        System.out.println("Updated Products: " + productRepository.findAll());

        orderRepository.delete(1L);
        System.out.println("Orders: " + orderRepository.findAll());

        Optional<User> user = userRepository.findById(3L);
        System.out.println("User is: " + user.get().getName());

    }
}
