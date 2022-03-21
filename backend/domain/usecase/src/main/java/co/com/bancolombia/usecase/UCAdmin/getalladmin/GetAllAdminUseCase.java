package co.com.bancolombia.usecase.UCAdmin.getalladmin;

import co.com.bancolombia.model.admin.Admin;
import co.com.bancolombia.model.admin.gateways.AdminRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GetAllAdminUseCase {
    private final AdminRepository repository;
    public List<Admin> getAllAdmin(){
        return repository.getAllAdmin();
    }
}
