package co.com.bancolombia.model.user.gateways;

import co.com.bancolombia.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User createUser(User user);
    User updateUser(User user);
    List<User> getAll();
    Optional<User> getUserById(String id);
    void deleteUser(String id);
}
