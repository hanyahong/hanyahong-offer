package model.businesslayer.client;

import org.springframework.data.annotation.Id;

/**
 * Created by hyh on 17-1-11.
 * 客户分类
 */
public class Client {
    //基本属性
    @Id
    private String id;
    private String name;
    private String phone;
    private String contacts;
    private String email;

    //系统属性
    private String uid;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
