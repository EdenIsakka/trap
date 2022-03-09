package co.com.bancolombia.api;
import co.com.bancolombia.model.collector.Collector;
import co.com.bancolombia.usecase.createcollector.CreateCollectorUseCase;
import co.com.bancolombia.usecase.updatecollector.UpdateCollectorUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class CollectorRestController {
    private final CreateCollectorUseCase createCollector;
    private final UpdateCollectorUseCase updateCollector;


    @PostMapping(path = "/create-collector")
    public String createCollector(@RequestBody Collector collector) {
        createCollector.createCollector(collector);
        return "Collector creado";
    }
    @PutMapping(path = "/update-collector")
    public Collector updateCollector(@RequestBody Collector collector){
        return updateCollector.updateCollector(collector);
    }
}
