package repo;

import model.businesslayer.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hyh on 17-1-13.
 * 分类仓库接口
 */
@Repository
public interface ProductClassificationRepo extends MongoRepository<Product, String> {
}
