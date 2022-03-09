package co.com.bancolombia.usecase.createadmin;

import co.com.bancolombia.model.admin.Admin;
import co.com.bancolombia.model.admin.gateways.AdminRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CreateAdminUseCase {
    private final AdminRepository repository;

    public Admin createAdmin(Admin admin){
        return this.repository.createAdmin(admin);
    }
}
