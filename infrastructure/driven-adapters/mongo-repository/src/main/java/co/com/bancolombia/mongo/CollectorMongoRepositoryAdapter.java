package co.com.bancolombia.mongo;

import co.com.bancolombia.model.admin.Admin;
import co.com.bancolombia.model.admin.gateways.AdminRepository;
import co.com.bancolombia.model.collector.Collector;
import co.com.bancolombia.model.collector.gateways.CollectorRepository;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class CollectorMongoRepositoryAdapter extends AdapterOperations<Collector, Collector, String, CollectorMongoDBRepository>implements CollectorRepository


{

    public CollectorMongoRepositoryAdapter(CollectorMongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Collector.class));
    }


    @Override
    public Collector createCollector(Collector collector) {
        return this.repository.save(collector);
    }

    @Override
    public Collector updateCollector(Collector collector) {
        return null;
    }

    @Override
    public List<Collector> getAllCollector() {
        return null;
    }

    @Override
    public Optional<Collector> getCollectorById(String id) {
        return Optional.empty();
    }

    @Override
    public void deleteCollector(String id) {

    }
}
