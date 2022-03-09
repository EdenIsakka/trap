package co.com.bancolombia.usecase.getallcollector;

import co.com.bancolombia.model.collector.Collector;
import co.com.bancolombia.model.collector.gateways.CollectorRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GetAllCollectorUseCase {
    private final CollectorRepository repository;
    public List<Collector> getAllCollector(){
        return repository.getAllCollector();
    }
}
