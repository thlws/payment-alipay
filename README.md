## 项目介绍
- payment是一系列基于Java实现的支付类库，包含支付宝、微信、翼支付等，其目的是以最简单的方式完成各种支付方式接入。

## 支付类库
- [https://gitee.com/thlws/payment-alipay](https://gitee.com/thlws/payment-alipay)
- [https://gitee.com/thlws/payment-wechat](https://gitee.com/thlws/payment-wechat)
- [https://gitee.com/thlws/payment-bestpay](https://gitee.com/thlws/payment-bestpay)

## 详细教程
- 支付宝-官方文档：[https://docs.open.alipay.com/api](https://docs.open.alipay.com/api)

## 功能说明
1. 用于支付宝支付，基于Java语言实现的依赖库；
2. 接口参数全部封装，使用者仅需创建对象并设置参数；
3. 封装官方SDK，整合多种支付场景于一体，降低接入门槛；

## 依赖安装
- Maven
```
<dependency>
    <groupId>org.thlws</groupId>
    <artifactId>payment-alipay</artifactId>
    <version>1.0.1</version>
</dependency>
```
- Gradle
```
compile 'org.thlws:payment-alipay:1.0.1'
```

## 源码测试
1. ```git clone https://github.com/thlws/payment-alipay.git```
2. 导入到 Eclipse 或 Intellij IDEA
3. 运行 Junit Class AlipayTest (支付相关接口)

## 项目依赖
- [https://github.com/zxing/zxing](https://github.com/zxing/zxing)
- [https://github.com/google/gson](https://github.com/google/gson)
- [http://commons.apache.org/proper/commons-lang/](http://commons.apache.org/proper/commons-lang/)
- [http://commons.apache.org/proper/commons-beanutils/](http://commons.apache.org/proper/commons-beanutils/)

## 更新日志
- v1.0.0 支付宝支付依赖库发布;

## FAQ
- 能不能直接 dependency 添加依赖?<br>
_已发布至公有仓库，添加方式如上._

- 是否有JDK版本要求?<br>
_JDK版本 >= 1.6 即可._

- 有没有支付相关文档？<br>
_[https://docs.open.alipay.com/api](https://docs.open.alipay.com/api)_

## 打赏一下
![](imgs/award.png)