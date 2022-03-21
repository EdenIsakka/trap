package co.com.bancolombia.model.admin;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.annotation.Documented;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Admin {
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String password;
}
