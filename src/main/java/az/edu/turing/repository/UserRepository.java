package az.edu.turing.repository;

import az.edu.turing.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GenericRepository<User> {
    private List<User> users = new ArrayList<>();

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(Long id, User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
