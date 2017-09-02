package com.alipay.trade.service.impl;

import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradeQueryResponse;
import com.alipay.trade.model.TradeStatus;
import com.alipay.trade.model.builder.AlipayTradePayRequestBuilder;
import com.alipay.trade.model.builder.AlipayTradeQueryRequestBuilder;
import com.alipay.trade.model.result.AlipayF2FPayResult;
import com.alipay.trade.config.Constants;

import org.apache.commons.lang.StringUtils;

/**
 * Created by liuyangkly on 15/7/29.
 * Modified By Hanley on 17/3/7
 * 支付宝核心接口,使用API前需先行初始化.
 */
public class AlipayTradeServiceImpl extends AbsAlipayTradeService {

    public static class ClientBuilder {
        private String gatewayUrl;
        private String appid;
        private String privateKey;
        private String format;
        private String charset;
        private String alipayPublicKey;

        /***
         * Modified By Hanley
         * 移除properties中读取支付宝参数
         * @return
         */
        public AlipayTradeServiceImpl build() {
            if (StringUtils.isEmpty(gatewayUrl)) {
                throw new NullPointerException("gatewayUrl should not be NULL!"); // 与mcloudmonitor网关地址不同
            }
            if (StringUtils.isEmpty(appid)) {
                throw new NullPointerException("appid should not be NULL!");
            }
            if (StringUtils.isEmpty(privateKey)) {
                throw new NullPointerException("privateKey should not be NULL!");
            }
            if (StringUtils.isEmpty(format)) {
                format = "json";
            }
            if (StringUtils.isEmpty(charset)) {
                charset = "utf-8";
            }
            if (StringUtils.isEmpty(alipayPublicKey)) {
                throw new NullPointerException("alipayPublicKey should not be NULL!");
            }

            return new AlipayTradeServiceImpl(this);
        }

        public ClientBuilder setAlipayPublicKey(String alipayPublicKey) {
            this.alipayPublicKey = alipayPublicKey;
            return this;
        }

        public ClientBuilder setAppid(String appid) {
            this.appid = appid;
            return this;
        }

        public ClientBuilder setCharset(String charset) {
            this.charset = charset;
            return this;
        }

        public ClientBuilder setFormat(String format) {
            this.format = format;
            return this;
        }

        public ClientBuilder setGatewayUrl(String gatewayUrl) {
            this.gatewayUrl = gatewayUrl;
            return this;
        }

        public ClientBuilder setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public String getAlipayPublicKey() {
            return alipayPublicKey;
        }

        public String getAppid() {
            return appid;
        }

        public String getCharset() {
            return charset;
        }

        public String getFormat() {
            return format;
        }

        public String getGatewayUrl() {
            return gatewayUrl;
        }

        public String getPrivateKey() {
            return privateKey;
        }
    }

    public AlipayTradeServiceImpl(ClientBuilder builder) {
        if (StringUtils.isEmpty(builder.getGatewayUrl())) {
            throw new NullPointerException("gatewayUrl should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getAppid())) {
            throw new NullPointerException("appid should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getPrivateKey())) {
            throw new NullPointerException("privateKey should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getFormat())) {
            throw new NullPointerException("format should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getCharset())) {
            throw new NullPointerException("charset should not be NULL!");
        }
        if (StringUtils.isEmpty(builder.getAlipayPublicKey())) {
            throw new NullPointerException("alipayPublicKey should not be NULL!");
        }

        client = new DefaultAlipayClient(builder.getGatewayUrl(), builder.getAppid(), builder.getPrivateKey(),
                builder.getFormat(), builder.getCharset(), builder.getAlipayPublicKey());
    }


}
