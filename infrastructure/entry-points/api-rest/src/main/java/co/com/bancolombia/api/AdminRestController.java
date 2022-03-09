package co.com.bancolombia.api;
import co.com.bancolombia.model.admin.Admin;
import co.com.bancolombia.usecase.createadmin.CreateAdminUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class AdminRestController {
    private final CreateAdminUseCase createAdmin;

    @PostMapping(path = "/create-admin")
    public String createAdmin(@RequestBody Admin admin) {
        createAdmin.createAdmin(admin);
        return "Admin creado";
    }
}
