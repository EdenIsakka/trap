package co.com.bancolombia.model.admin;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Admin {
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String password;
}
