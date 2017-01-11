package model.businesslayer.offer;

import model.businesslayer.client.Client;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hyh on 17-1-10.
 * 报价单实体类
 */
public class Offer {
    //基本属性
    @Id
    private String id;
    private String offer_num;//编号
    private String name;//名称
    private String date;//日期
    private Client client;//客户
    private List<OfferClassification> classifications = new ArrayList<OfferClassification>();//明细
    //系统属性
    private String uid;//归属
    private Date timestamp;//时间戳


    public Date getTimestamp() {
        return timestamp;
    }

    public List<OfferClassification> getClassifications() {
        return classifications;
    }

    public void setClassifications(List<OfferClassification> classifications) {
        this.classifications = classifications;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOffer_num() {
        return offer_num;
    }

    public void setOffer_num(String offer_num) {
        this.offer_num = offer_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
