package co.com.bancolombia.usecase.updateuser;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class UpdateUserUseCase {
    private final UserRepository repository;
    public User updateUser(User user){
        return repository.updateUser(user);
    }
}
