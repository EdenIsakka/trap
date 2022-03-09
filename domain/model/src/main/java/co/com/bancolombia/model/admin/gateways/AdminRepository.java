package co.com.bancolombia.model.admin.gateways;

import co.com.bancolombia.model.admin.Admin;

import java.util.List;
import java.util.Optional;

public interface AdminRepository {
    Admin createAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    List<Admin> getAllAdmin();
    Optional<Admin> getAdminById(String id);
}
