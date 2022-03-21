package co.com.bancolombia.usecase.UCAdmin.getadminbyid;

import co.com.bancolombia.model.admin.Admin;
import co.com.bancolombia.model.admin.gateways.AdminRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class GetAdminByIdUseCase {
    private final AdminRepository repository;
    public Optional<Admin> getAdminById(String id){
        return repository.getAdminById(id);
    }
}
