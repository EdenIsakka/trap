package co.com.bancolombia.usecase.createcollector;

import co.com.bancolombia.model.collector.Collector;
import co.com.bancolombia.model.collector.gateways.CollectorRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CreateCollectorUseCase {
    private final CollectorRepository repository;
    public Collector createCollector(Collector collector){
        return repository.createCollector(collector);
    }
}
