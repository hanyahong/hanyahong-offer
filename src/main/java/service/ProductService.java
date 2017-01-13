package service;

import model.businesslayer.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hyh on 17-1-13.
 * 产品服务层类
 */
@Service
public interface ProductService {
    /**
     * 查询产品
     *
     * @param id
     * @return
     */
    Product selProductService(String id);

    /**
     * 更新产品
     *
     * @param product
     */
    void updateProductService(Product product);

    /**
     * 删除产品
     *
     * @param id
     */
    void delProductService(String id);

    /**
     * 查询列表
     *
     * @return
     */
    List<Product> selProductListService(String uid);
}
