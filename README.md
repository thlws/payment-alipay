支付宝支付
============
[![](https://img.shields.io/badge/release-v1.0.5-blue.svg)](https://github.com/thlws/payment-alipay)   [![](https://img.shields.io/badge/license-Apache--2-yellowgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0.html) [![](https://img.shields.io/badge/maven%20central-v1.0.5-brightgreen.svg)](https://search.maven.org/artifact/org.thlws/payment-alipay/1.0.5/jar) 
[![](https://img.shields.io/badge/jdk-1.7%2B-red.svg)](https://www.oracle.com/technetwork/java/javase/downloads/index.html)

> 基于支付宝官方Java SDK,封装支付相关接口, 整合多种支付场景于一体。

#### <span style="color:red">功能已整合到payment-thl中，此项目不再维护，新用户请直接使用 payment-thl</span>
【微信、支付宝、翼支付 三合一】 [https://gitee.com/thlws/payment-thl](https://gitee.com/thlws/payment-thl)

### 功能说明
1. 用于支付宝支付，基于Java语言实现的依赖库；
2. 接口参数全部封装，使用者仅需创建对象并设置参数；
3. 封装官方SDK，整合多种支付场景于一体，降低接入门槛；

### 更新日志
- v1.0.0 支付宝支付依赖库发布;
- v1.0.1 日常bug修复;
- v1.0.2 新增RSA2签名方式（RSA2时，支付宝公钥为必须参数）;
- v1.0.3 返回参数新增code & msg;
- v1.0.4 升级支付宝依赖至201809版本
- v1.0.5 项目重构,对外提供统一支付入口 `org.thlws.payment.AlipayClient`

### 在线文档
- [API 文档](https://apidoc.gitee.com/thlws/payment-alipay)
- [支付宝开发平台](https://docs.open.alipay.com/api)


### 在线交流
- 邮箱：hanley@thlws.com 
- QQ群：  [![](https://img.shields.io/badge/chat-on%20qq-red.svg)](//shang.qq.com/wpa/qunwpa?idkey=521df1fba7ef96db15c898e48feb26b6a82f6c2a60612154181b301febb30494) 693169203


### 依赖安装
- Maven
```
<dependency>
    <groupId>org.thlws</groupId>
    <artifactId>payment-alipay</artifactId>
    <version>1.0.5</version>
</dependency>
```
- Gradle
```
compile 'org.thlws:payment-alipay:1.0.5'
```

### 接口列表
**支付宝**
[org.thlws.payment.AlipayClient](src/main/java/org/thlws/payment/AlipayClient.java) 


| 方法名称 | 功能说明 |
|:--------|:--------|
| payInMobileSite | 手机网页支付 |
| payInWebSite | 普通网站支付 |
| preCreate | 创建预订单 |
| pay | 刷卡支付(当面付) |
| query | 支付查询 |
| refund | 支付退款 |
| cancel | 订单取消|


### 如何使用
```java
//支付宝支付
AlipayCore alipayCore = clientBuilder
 .setAlipayPublicKey(alipay_public_key_2)
 .setAppId(appid_2)
 .setPrivateKey(alipay_public_key_2)
 .setSignType(AlipayConstants.SIGN_TYPE_RSA2).build();
 
AlipayTradeRequest request = new AlipayTradeRequest();
request.setTotalAmount("0.01");
request.setStoreId("123456");
request.setOperatorId("hanley001");
request.setAuthCode("288609492126942746");
request.setOutTradeNo(System.currentTimeMillis()+"");
request.setSubject("测试买单001");
AlipayTradeResponse response = AlipayClient.pay(request,alipayCore);
boolean isSuccess = response.isSuccess();
```



### 全部支付
<b style="color:red">payment-*</b> 是一系列基于Java实现的支付类库，包含支付宝、微信、翼支付等，其目的是以最简单的方式完成各种支付方式接入。目前支付类库各自独立，使用时需单独引用，详见“支付类库”各自主页说明，后续不排除对所有支付类库整体打包，请留意文档更新。另源码会同时push到gitee&github,可能的话帮忙star下~😍
#### Gitee
- [https://gitee.com/thlws/payment-alipay](https://gitee.com/thlws/payment-alipay)
- [https://gitee.com/thlws/payment-wechat](https://gitee.com/thlws/payment-wechat)
- [https://gitee.com/thlws/payment-bestpay](https://gitee.com/thlws/payment-bestpay)   
#### Github
- [https://github.com/thlws/payment-alipay](https://github.com/thlws/payment-alipay)
- [https://github.com/thlws/payment-wechat](https://github.com/thlws/payment-wechat)
- [https://github.com/thlws/payment-bestpay](https://github.com/thlws/payment-bestpay)   


