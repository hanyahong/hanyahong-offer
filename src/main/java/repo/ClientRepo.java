package repo;

import model.businesslayer.client.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hyh on 17-1-13.
 * 客户仓库
 */
@Repository
public interface ClientRepo extends MongoRepository<Client, String> {
}
