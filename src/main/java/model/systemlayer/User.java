package model.systemlayer;

/**
 * Created by hyh on 17-1-10.
 * 用户实体类
 */
public class User {
    //账户信息
    private String id;
    private String phone;//电话
    private String email;//邮箱
    private String wechat_id;//wechat
    private String qq_id;//qq
    //个人信息
    private String name;//姓名
    private String image;//图片
    private String sex;//性别
    //公司信息
    private String industry;//行业
    private String group;//团队
    private String group_tel;//电话
    private String address;//地址

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWechat_id() {
        return wechat_id;
    }

    public void setWechat_id(String wechat_id) {
        this.wechat_id = wechat_id;
    }

    public String getQq_id() {
        return qq_id;
    }

    public void setQq_id(String qq_id) {
        this.qq_id = qq_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup_tel() {
        return group_tel;
    }

    public void setGroup_tel(String group_tel) {
        this.group_tel = group_tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
