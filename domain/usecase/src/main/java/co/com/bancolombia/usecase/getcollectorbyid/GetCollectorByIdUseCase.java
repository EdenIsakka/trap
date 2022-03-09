package co.com.bancolombia.usecase.getcollectorbyid;

import co.com.bancolombia.model.collector.Collector;
import co.com.bancolombia.model.collector.gateways.CollectorRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class GetCollectorByIdUseCase {
    private final CollectorRepository repository;
    public Optional<Collector> getCollectorById(String id){
        return repository.getCollectorById(id);
    }
}
