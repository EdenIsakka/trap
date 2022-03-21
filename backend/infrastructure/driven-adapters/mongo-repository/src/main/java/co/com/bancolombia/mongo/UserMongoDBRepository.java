package co.com.bancolombia.mongo;

import co.com.bancolombia.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UserMongoDBRepository extends MongoRepository<User/* change for adapter model */, String> , QueryByExampleExecutor<User/* change for adapter model */> {
}
