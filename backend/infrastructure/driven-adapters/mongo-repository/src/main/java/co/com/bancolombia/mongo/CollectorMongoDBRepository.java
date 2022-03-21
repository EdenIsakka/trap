package co.com.bancolombia.mongo;

import co.com.bancolombia.model.collector.Collector;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface CollectorMongoDBRepository extends MongoRepository<Collector/* change for adapter model */, String> , QueryByExampleExecutor<Collector/* change for adapter model */> {
}
