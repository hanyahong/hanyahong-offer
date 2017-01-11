package model.businesslayer.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyh on 17-1-11.
 * 报价明细
 */
public class OfferClassification {
    private String cid;//分类 id
    private String classification;//分类名称
    private List<OfferProduct> offerProducts =new ArrayList<OfferProduct>();

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public List<OfferProduct> getOfferProducts() {
        return offerProducts;
    }

    public void setOfferProducts(List<OfferProduct> offerProducts) {
        this.offerProducts = offerProducts;
    }
}
