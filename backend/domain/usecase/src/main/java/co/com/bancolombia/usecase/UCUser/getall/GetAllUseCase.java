package co.com.bancolombia.usecase.UCUser.getall;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GetAllUseCase {
    private final UserRepository repository;
    public List<User> getAll(){
        return repository.getAll();
    }

}
