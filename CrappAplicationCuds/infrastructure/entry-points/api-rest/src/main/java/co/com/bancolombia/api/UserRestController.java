package co.com.bancolombia.api;
import co.com.bancolombia.model.user.User;
import co.com.bancolombia.usecase.UCUser.createuser.CreateUserUseCase;
import co.com.bancolombia.usecase.UCUser.deleteuser.DeleteUserUseCase;
import co.com.bancolombia.usecase.UCUser.getall.GetAllUseCase;
import co.com.bancolombia.usecase.UCUser.getuserbyid.GetUserByIdUseCase;
import co.com.bancolombia.usecase.UCUser.updateuser.UpdateUserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UserRestController {
    private final CreateUserUseCase createUser;
    private final UpdateUserUseCase updateUserUseCase;
    private final GetAllUseCase getAllUseCase;
    private final GetUserByIdUseCase getUserByIdUseCase;
    private final DeleteUserUseCase deleteUserUseCase;

    @PostMapping(path = "/create-user")
    public String createUser(@RequestBody User user) {
        createUser.createUser(user);
        return "Usuario creado";
    }

    @PutMapping(path = "/update-user")
    public User updateUser(@RequestBody User user){
        return updateUserUseCase.updateUser(user);

    }

    @GetMapping(path = "/get-all-user")
    public List<User> getAll(){
        return getAllUseCase.getAll();

    }

    @GetMapping(path = "/get-user-by-id/{id}")
    public Optional<User> getUserById(@PathVariable String id){
        return getUserByIdUseCase.getUserById(id);
    }

    @DeleteMapping(path = "/delete-user/{id}")
    public void deleteUser(@PathVariable String id){
        deleteUserUseCase.deleteUser(id);
    }


}
