package co.com.bancolombia.model.collector;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class Collector {
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String password;
}
