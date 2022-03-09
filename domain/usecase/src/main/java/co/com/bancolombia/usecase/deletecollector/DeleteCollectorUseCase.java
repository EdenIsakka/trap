package co.com.bancolombia.usecase.deletecollector;

import co.com.bancolombia.model.collector.gateways.CollectorRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class DeleteCollectorUseCase {
    private final CollectorRepository repository;
    public void deleteCollector(String id){
        repository.deleteCollector(id);
    }
}
