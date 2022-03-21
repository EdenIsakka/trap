package co.com.bancolombia.mongo;

import co.com.bancolombia.model.admin.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface AdminMongoDBRepository extends MongoRepository<Admin/* change for adapter model */, String> , QueryByExampleExecutor<Admin/* change for adapter model */> {
}
