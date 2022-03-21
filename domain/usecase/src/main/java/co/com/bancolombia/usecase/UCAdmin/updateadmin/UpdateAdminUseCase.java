package co.com.bancolombia.usecase.UCAdmin.updateadmin;

import co.com.bancolombia.model.admin.Admin;
import co.com.bancolombia.model.admin.gateways.AdminRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class UpdateAdminUseCase {
    private final AdminRepository repository;
    public Admin updateAdmin(Admin admin){
        return repository.updateAdmin(admin);
    }
}
