package repo;

import model.systemlayer.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hyh on 17-1-13.
 * 用户资源仓库
 */
@Repository
public interface UserRepo extends MongoRepository<User, String> {
}
