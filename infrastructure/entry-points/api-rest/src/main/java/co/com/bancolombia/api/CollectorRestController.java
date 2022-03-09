package co.com.bancolombia.api;
import co.com.bancolombia.model.collector.Collector;
import co.com.bancolombia.usecase.createcollector.CreateCollectorUseCase;
import co.com.bancolombia.usecase.getallcollector.GetAllCollectorUseCase;
import co.com.bancolombia.usecase.getcollectorbyid.GetCollectorByIdUseCase;
import co.com.bancolombia.usecase.updatecollector.UpdateCollectorUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class CollectorRestController {
    private final CreateCollectorUseCase createCollector;
    private final UpdateCollectorUseCase updateCollector;
    private final GetAllCollectorUseCase getAllCollector;
    private final GetCollectorByIdUseCase getCollectorById;


    @PostMapping(path = "/create-collector")
    public String createCollector(@RequestBody Collector collector) {
        createCollector.createCollector(collector);
        return "Collector creado";
    }
    @PutMapping(path = "/update-collector")
    public Collector updateCollector(@RequestBody Collector collector){
        return updateCollector.updateCollector(collector);
    }

    @GetMapping(path = "/get-all-collector")
    public List<Collector> getAllCollector(){
        return getAllCollector.getAllCollector();
    }

    @GetMapping(path = "/get-collector-by-id/{id}")
    public Optional<Collector> getCollectorById(@PathVariable String id){
        return getCollectorById.getCollectorById(id);
    }
}
