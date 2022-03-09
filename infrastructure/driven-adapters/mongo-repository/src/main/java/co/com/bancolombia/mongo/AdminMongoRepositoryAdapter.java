package co.com.bancolombia.mongo;

import co.com.bancolombia.model.admin.Admin;

import co.com.bancolombia.model.admin.gateways.AdminRepository;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;


@Repository
public class AdminMongoRepositoryAdapter extends AdapterOperations<Admin, Admin, String, AdminMongoDBRepository>implements AdminRepository


{

    public AdminMongoRepositoryAdapter(AdminMongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Admin.class));
    }

    @Override
    public Admin createAdmin(Admin admin) {

        return this.repository.save(admin);
    }


}
