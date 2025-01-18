package az.edu.turing;

import java.util.List;
import java.util.Optional;

public class UserRepository implements GenericRepository<User>{
    @Override
    public Optional<User> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
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
