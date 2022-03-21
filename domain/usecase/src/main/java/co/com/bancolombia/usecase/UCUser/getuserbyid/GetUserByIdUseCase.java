package co.com.bancolombia.usecase.UCUser.getuserbyid;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class GetUserByIdUseCase {
    private final UserRepository repository;
    public Optional<User> getUserById(String id){
        return repository.getUserById(id);
    }

}
