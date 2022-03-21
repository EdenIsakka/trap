package co.com.bancolombia.usecase.UCUser.createuser;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CreateUserUseCase {
    private final UserRepository repository;

    public User createUser(User user){
        return repository.createUser(user);
    }
}
