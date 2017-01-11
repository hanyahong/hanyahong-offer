/*
 * Copyright (c) 2017.版权所有
 */

package constant;

/**
 * 项目基本常亮
 *
 * @author hyh
 */
public class Constant {

    public final static String BASEPATH = "/data/zhanyun/cloudoffer/";//基础路径
    public final static String EMAIL = "ybj@zhanyun.cc";//服务器发送邮箱
    public final static String IMAGESURL = "http://101.201.62.255/";//图片服务器地址(负载均衡)
    public final static String OFFERFILENAME = "offerFiles";//报价单文件夹
    public final static String CONTRANTFILENAME = "contrantFiles";//合同文件夹
    //任务单文件夹
    public final static String TASKFILENAME = "taskFiles";
    //报价模板文件夹
    public final static String OFFERMODELS = "filemodel";
    //临时文件存储地址(高读写)
    public final static String TMPFOLDER = "tmp";
    //系统默认模板
    public final static String SYSTEMDEFAULTMODEL = BASEPATH + "offerlist.xls";
    //文件文件夹
    public final static String FILELIB = "fileLib";
    //任务单模板库文件夹
    public final static String TASKMODEL = "taskmodel";

    //短信服务常量
    public final static String SMS_URL = "http://gw.api.taobao.com/router/rest";
    public final static String SMS_APP_kEY = "23357149";
    public final static String SMS_APP_SECRET = "8fd289cf17374db94e1b2184462b822e";
    public final static String SMS_FREE_SIGN_NAME = "展云互联";

    //短信验证码模板
    public final static String SMS_MODEL_TO_USER = "SMS_8926569";//注册验证码
    public final static String SMS_MODEL_TO_FORGET_PWD = "SMS_33660596";//忘记密码验证码
    public final static String SMS_MODEL_TO_UPDATE_PHONE = "SMS_34510042";//修改手机号验证码
    //业务通知模板
    public final static String SMS_MODEL_TO_CLIENT = "SMS_34295099";//通知客户
    public final static String SMS_MODEL_TO_COMPANY_OWNER_1 = "SMS_34315100";//通知公司管理员，新员工入职
    public final static String SMS_MODEL_TO_COMPANY_OWNER_2 = "SMS_34510063";//通知公司管理员，新员工离职
    public final static String SMS_MODEL_TO_SUPPLIER_1 = "SMS_39390021";//通知供应商suppliers
    public final static String SMS_MODEL_TO_SUPPLIER_2 = "SMS_39295006";//通知供应商报价通过可以使用suppliers

    //后台管理通知模板
    public final static String SMS_MODEL_TO_BOSS = "SMS_34460081";//用户量注册统计模板
    public final static String SMS_MODEL_TO_ADMIN = "SMS_33555488";//服务器异常通知模板

    //询价单服务器网址
    public final static String INQUIRY_WEBSITE = "http://inquiry.zhanyun.cc";
//    public final static String INQUIRY_WEBSITE = "http://www.zhanyun.cc/";


}
