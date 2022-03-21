package co.com.bancolombia.api;
import co.com.bancolombia.model.admin.Admin;
import co.com.bancolombia.usecase.UCAdmin.createadmin.CreateAdminUseCase;
import co.com.bancolombia.usecase.UCAdmin.deleteadmin.DeleteAdminUseCase;
import co.com.bancolombia.usecase.UCAdmin.getadminbyid.GetAdminByIdUseCase;
import co.com.bancolombia.usecase.UCAdmin.getalladmin.GetAllAdminUseCase;
import co.com.bancolombia.usecase.UCAdmin.updateadmin.UpdateAdminUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class AdminRestController {
    private final CreateAdminUseCase createAdmin;
    private final UpdateAdminUseCase updateAdmin;
    private final GetAllAdminUseCase getAllAdmin;
    private final GetAdminByIdUseCase getAdminById;
    private final DeleteAdminUseCase deleteAdmin;

    @PostMapping(path = "/create-admin")
    public String createAdmin(@RequestBody Admin admin) {
        createAdmin.createAdmin(admin);
        return "Admin creado";
    }
    @PutMapping(path = "/update-admin")
    public Admin updateAdmin(@RequestBody Admin admin){
        return updateAdmin.updateAdmin(admin);
    }

    @GetMapping(path = "/get-all-admin")
    public List<Admin> getAllAdmin(){
        return getAllAdmin.getAllAdmin();
    }

    @GetMapping(path = "/get-admin-by-id/{id}")
    public Optional<Admin> getAdminById(@PathVariable String id){
        return getAdminById.getAdminById(id);
    }

    @DeleteMapping(path = "/delete-admin/{id}")
    public void deleteAdmin(@PathVariable String id){
        deleteAdmin.deleteAdmin(id);
    }
}
