package co.com.bancolombia.mongo;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserMongoRepositoryAdapter extends AdapterOperations<User, User, String, UserMongoDBRepository>implements UserRepository


{

    public UserMongoRepositoryAdapter(UserMongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, User.class));
    }

    @Override
    public User createUser(User user) {

        return this.repository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return this.repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<User> getUserById(String id) {
        return this.repository.findById(id);
    }
}
