package co.com.bancolombia.api;
import co.com.bancolombia.model.collector.Collector;
import co.com.bancolombia.usecase.createcollector.CreateCollectorUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class CollectorRestController {
    private CreateCollectorUseCase createCollector;


    @PostMapping(path = "/create-collector")
    public String createCollector(@RequestBody Collector collector) {
        createCollector.createCollector(collector);
        return "Collector creado";
    }
}
