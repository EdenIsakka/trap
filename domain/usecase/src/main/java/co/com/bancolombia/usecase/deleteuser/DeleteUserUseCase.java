package co.com.bancolombia.usecase.deleteuser;

import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class DeleteUserUseCase {
    private final UserRepository repository;
    public void deleteUser(String id){
        repository.deleteUser(id);
    }
}
