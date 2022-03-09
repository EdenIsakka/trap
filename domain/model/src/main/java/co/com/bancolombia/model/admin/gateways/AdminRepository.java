package co.com.bancolombia.model.admin.gateways;

import co.com.bancolombia.model.admin.Admin;

import java.util.List;

public interface AdminRepository {
    Admin createAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    List<Admin> getAllAdmin();
}
