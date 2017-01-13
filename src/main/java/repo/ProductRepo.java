package repo;

import model.businesslayer.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by hyh on 17-1-13.
 * 产品仓库接口
 */
public interface ProductRepo extends MongoRepository<Product, String> {
}
