package co.com.bancolombia.api;
import co.com.bancolombia.model.user.User;
import co.com.bancolombia.usecase.createuser.CreateUserUseCase;
import co.com.bancolombia.usecase.getall.GetAllUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class UserRestController {
    private final CreateUserUseCase createUser;
    private final GetAllUseCase getAllUseCase;

    @PostMapping(path = "/create-user")
    public String createUser(@RequestBody User user) {
        createUser.createUser(user);
        return "Usuario creado";
    }

    @GetMapping(path = "/get-all-user")
    public List<User> getAll(){
        return getAllUseCase.getAll();

    }




}
