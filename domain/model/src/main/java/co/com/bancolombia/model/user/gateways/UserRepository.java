package co.com.bancolombia.model.user.gateways;

import co.com.bancolombia.model.user.User;

import java.util.List;

public interface UserRepository {
    User createUser(User user);
    User updateUser(User user);
    List<User> getAll();
}
