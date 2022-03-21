package co.com.bancolombia.model.collector.gateways;

import co.com.bancolombia.model.collector.Collector;

import java.util.List;
import java.util.Optional;

public interface CollectorRepository {
    Collector createCollector(Collector collector);
    Collector updateCollector(Collector collector);
    List<Collector> getAllCollector();
    Optional<Collector> getCollectorById(String id);
    void deleteCollector(String id);
}
