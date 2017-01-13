package repo;

import model.businesslayer.offer.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by hyh on 17-1-13.
 * 报价单仓库类
 */
public interface OfferRepo extends MongoRepository<Offer, String> {
}
