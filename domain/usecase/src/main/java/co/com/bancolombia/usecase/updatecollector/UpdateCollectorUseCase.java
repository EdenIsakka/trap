package co.com.bancolombia.usecase.updatecollector;

import co.com.bancolombia.model.collector.Collector;
import co.com.bancolombia.model.collector.gateways.CollectorRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class UpdateCollectorUseCase {
    private final CollectorRepository repository;
    public Collector updateCollector(Collector collector){
        return repository.updateCollector(collector);
    }
}
