package co.com.bancolombia.usecase.deleteadmin;

import co.com.bancolombia.model.admin.gateways.AdminRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class DeleteAdminUseCase {
    private final AdminRepository repository;
    public void deleteAdmin(String id){
        repository.deleteAdmin(id);
    }
}
