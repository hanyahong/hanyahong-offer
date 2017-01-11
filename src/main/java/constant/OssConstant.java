/*
 * Copyright (c) 2017.版权所有
 */

package constant;

import cc.zhanyun.util.RandomUtil;

/**
 * Created by hyh on 17-1-8.
 */
public class OssConstant {
    /**
     * api地址
     */
    public final static String STS_API_URL = "https://sts.aliyuncs.com";
    /**
     * 格式化类型
     */
    public final static String FORMAT = "JSON";
    /**
     * 版本
     */
    public final static String VERSION = "2015-04-01";
    /**
     * RAM子账号秘钥ＩＤ
     */
    public final static String ACCESS_KEY_ID = "LTAIuvxSrrPVaNsx";
    /**
     * RAM子账号秘钥
     */
    public final static String AccessKeySecret = "p4z69kroYmzOfwYOkP9K1gMyFuUVgq";
    /**
     * 签名算法
     */
    public final static String SIGNATURE_METHOD = "HMAC-SHA1";
    /**
     * 签名版本
     */
    public final static String SIGNATURE_VAESION = "1.0";
    /**
     * 签名随机数
     */
    public final static String SIGNATURE_NONCE = RandomUtil.getRandomFileName();

    /**
     * 访问OSS的权限
     */
    public final static String ROLEARN = "acs:ram::1075822415561561:role/aliyunosstokengeneratorrole";//文件OSS系统服务权限
    /**
     * 用户存储空间地址
     */
    public final static String BUCKET_NAME_OF_USER = "cloud-offer-user";
    /**
     * 平台存储空间地址
     */
    public final static String BUCKET_NAME_OF_MANAGER = "cloud-offer-p-manager";
    /**
     * 北京OSS节点
     */
    public final static String ENDPOINT = "oss-cn-beijing.aliyuncs.com";

    /**
     * 北京OSS节点 带有协议头
     */
    public final static String ENDPOINT_WITH_HTTP = "http://" + ENDPOINT;
    /**
     * 用户存储的bucket网址
     */
    public final static String BUCKET_URL_OF_USER = "http://file.zhanyun.cc/";
    /**
     * 平台存储的bucket网址
     */
    public final static String BUCKET_URL_OF_MANAGER = "http://manager.zhanyun.cc/";
}
