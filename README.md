## 项目介绍
- payment是一系列基于Java实现的支付类库，包含支付宝、微信、翼支付等，其目的是以最简单的方式完成各种支付方式接入。
- 目前支付类库各自独立，使用时需单独引用，详见“支付类库”各自主页说明，后续不排除对所有支付类库整体打包，请留意文档更新。

### 支付类库
- [https://gitee.com/thlws/payment-alipay](https://gitee.com/thlws/payment-alipay)
- [https://gitee.com/thlws/payment-wechat](https://gitee.com/thlws/payment-wechat)
- [https://gitee.com/thlws/payment-bestpay](https://gitee.com/thlws/payment-bestpay)   

### 在线交流
- 邮箱：hanley@thlws.com   
- QQ群：693169203  <a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=521df1fba7ef96db15c898e48feb26b6a82f6c2a60612154181b301febb30494"><img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="thlws" title="thlws"></a>

## 支付宝支付

### 详细教程
- 文档:准备中
- 支付宝-官方文档：[https://docs.open.alipay.com/api](https://docs.open.alipay.com/api)

### 功能说明
1. 用于支付宝支付，基于Java语言实现的依赖库；
2. 接口参数全部封装，使用者仅需创建对象并设置参数；
3. 封装官方SDK，整合多种支付场景于一体，降低接入门槛；

### 依赖安装
- Maven
```
<dependency>
    <groupId>org.thlws</groupId>
    <artifactId>payment-alipay</artifactId>
    <version>1.0.2</version>
</dependency>
```
- Gradle
```
compile 'org.thlws:payment-alipay:1.0.2'
```

### 源码测试
1. ```git clone https://github.com/thlws/payment-alipay.git```
2. 导入到 Eclipse 或 Intellij IDEA
3. 运行 Junit Class AlipayTest (支付相关接口)

### 项目依赖
- [https://github.com/zxing/zxing](https://github.com/zxing/zxing)
- [https://github.com/google/gson](https://github.com/google/gson)
- [http://commons.apache.org/proper/commons-lang/](http://commons.apache.org/proper/commons-lang/)
- [http://commons.apache.org/proper/commons-beanutils/](http://commons.apache.org/proper/commons-beanutils/)

### 更新日志
- v1.0.0 支付宝支付依赖库发布;
- v1.0.1 日常bug修复;
- v1.0.2 新增RSA2签名方式（RSA2时，支付宝公钥为必须参数）;

### FAQ
- 能不能直接 dependency 添加依赖?<br>
_已发布至公有仓库，添加方式如上._

- 是否有JDK版本要求?<br>
_JDK版本 >= 1.6 即可._

- 有没有支付相关文档？<br>
_[https://docs.open.alipay.com/api](https://docs.open.alipay.com/api)_

## 打赏一下
![](imgs/award.png)