package az.edu.turing.repository;

import az.edu.turing.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements GenericRepository<User> {
    private List<User> users = new ArrayList<>();

    @Override
    public Optional<User> findById(Long id) {
        for (User user: users){
            if (user.getId().equals(id)){
                return Optional.of(user);
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(Long id, User user) {
        delete(id);
        save(user);
    }

    @Override
    public void delete(Long id) {
        for (int i =0; i<users.size();i++){
            if (users.get(i).getId().equals(id)){
                users.remove(i);
                break;
            }
        }

    }
}
