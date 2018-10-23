支付宝支付
============
[![](https://img.shields.io/badge/release-v1.0.4-blue.svg)](https://github.com/thlws/payment-alipay)   [![](https://img.shields.io/badge/license-Apache--2-yellowgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0.html) [![](https://img.shields.io/badge/maven%20central-v1.0.4-brightgreen.svg)](https://search.maven.org/artifact/org.thlws/payment-alipay/1.0.4/jar) 

> 基于支付宝官方Java SDK,封装支付相关接口, 整合多种支付场景于一体。

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

### 官方文档
- [https://docs.open.alipay.com/api](https://docs.open.alipay.com/api)

### 在线交流
- 邮箱：hanley@thlws.com 
- QQ群：  [![](https://img.shields.io/badge/chat-on%20qq-red.svg)](//shang.qq.com/wpa/qunwpa?idkey=521df1fba7ef96db15c898e48feb26b6a82f6c2a60612154181b301febb30494) 693169203


### 依赖安装
- Maven
```
<dependency>
    <groupId>org.thlws</groupId>
    <artifactId>payment-alipay</artifactId>
    <version>1.0.4</version>
</dependency>
```
- Gradle
```
compile 'org.thlws:payment-alipay:1.0.4'
```
- 普通项目
    
        下载全部的jar并加入您的项目
    
    - [payment-alipay-1.0.4.jar](https://search.maven.org/remotecontent?filepath=org/thlws/payment-alipay/1.0.4/payment-alipay-1.0.4.jar)
    - [commons-lang-2.6.jar](http://central.maven.org/maven2/commons-lang/commons-lang/2.6/commons-lang-2.6.jar)
    - [commons-beanutils-1.8.3.jar](http://central.maven.org/maven2/commons-beanutils/commons-beanutils/1.8.3/commons-beanutils-1.8.3.jar)
    - [gson-2.3.1.jar](http://central.maven.org/maven2/com/google/code/gson/gson/2.3.1/gson-2.3.1.jar)
    - [zxing-core-2.2.jar](http://central.maven.org/maven2/com/google/zxing/core/2.2/core-2.2.jar)
    - [zxing-javase-2.2.jar](http://central.maven.org/maven2/com/google/zxing/javase/2.2/javase-2.2.jar)
    - [commons-logging-1.1.1.jar](http://central.maven.org/maven2/commons-logging/commons-logging/1.1.1/commons-logging-1.1.1.jar)
    - [hamcrest-core-1.3.jar](http://central.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar)



### 如何使用

```
  //第0步.初始化 AlipayCore
  //根据项目实际情况选择上面支付安装方式引入支付依赖.

  //第一步.初始化 AlipayCore
  AlipayCore.ClientBuilder clientBuilder = new AlipayCore.ClientBuilder();
  //sign_type=rsa时，可不传 支付宝公钥 alipay_public_key
  //alipayCore = clientBuilder.setApp_id(appid).setPrivate_key(private_key).setSign_type(AlipayConstants.SIGN_TYPE_RSA).build();

  //sign_type=rsa2时，必须传 支付宝公钥 alipay_public_key
  AlipayCore alipayCore = clientBuilder.setAlipay_public_key(alipay_public_key_0).setApp_id(appid_0).setPrivate_key(private_key_0).setSign_type(AlipayConstants.SIGN_TYPE_RSA2).build();
    

//第二步.调用支付
 public void test_pay(){
     try {
         AlipayTradeInput input = new AlipayTradeInput();

         //必须参数
         input.setTotalAmount("0.01");
         input.setStoreId("00001025104487");
         input.setOperatorId("hanley001");
         input.setAuthCode("289055913572087398");
         input.setOutTradeNo(System.currentTimeMillis()+"");
         input.setSubject("测试买单");
         
         AlipayTradeOutput output = alipayCore.pay(input);
         assertTrue(output.isSuccess());
         //output就是支付结果,具体请参考相关属性说明
     } catch (Exception e) {
         e.printStackTrace();
     }
 }


 ////第三步.调用退款
 public void  test_refund(){
    
     try {
         AlipayRefundInput input = new AlipayRefundInput();
         //input.setOutTradeNo("1508487673867");
         input.setTradeNo("2018050721001004510538867002");
         input.setRefundAmount("0.01");
         input.setRefundReason("测试退款");
         input.setStoreId("00001025104487");
         input.setTerminalId("10007");
         AlipayRefundOutput output = alipayCore.refund(input);
         System.out.println("output="+JsonUtil.format(output));
         assertTrue(output.isSuccess());
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
```


### 全部支付
<b style="color:red">payment-*</b> 是一系列基于Java实现的支付类库，包含支付宝、微信、翼支付等，其目的是以最简单的方式完成各种支付方式接入。
目前支付类库各自独立，使用时需单独引用，详见“支付类库”各自主页说明，后续不排除对所有支付类库整体打包，请留意文档更新。
- [https://gitee.com/thlws/payment-alipay](https://gitee.com/thlws/payment-alipay)
- [https://gitee.com/thlws/payment-wechat](https://gitee.com/thlws/payment-wechat)
- [https://gitee.com/thlws/payment-bestpay](https://gitee.com/thlws/payment-bestpay)   


