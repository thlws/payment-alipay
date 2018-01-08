## 简介说明
- 基于支付宝官方SDK,封装支付相关接口, 整合多种支付场景于一体，降低接入门槛。


## 详细教程
- 支付宝官方文档：[https://docs.open.alipay.com/api](https://docs.open.alipay.com/api)

## 项目说明
1. 用于支付宝支付，基于Java语言实现的依赖库；
2. 接口参数全部封装，使用者仅需创建对象并设置参数；

## 依赖安装
- Maven
```
<dependency>
    <groupId>org.thlws</groupId>
    <artifactId>payment-alipay</artifactId>
    <version>1.0.0</version>
</dependency>
```
- Gradle
```
compile 'org.thlws:payment-alipay:1.0.0'
```

## 源码测试
1. ```git clone https://github.com/thlws/payment-alipay.git```
2. 导入到 Eclipse 或 Intellij IDEA
3. 运行 Junit Class AlipayTest (支付相关接口)

## FAQ
- 能不能直接 dependency 添加依赖?<br>
_已发布至公有仓库，添加方式如上._

- 是否有JDK版本要求?<br>
_JDK版本 >= 1.6 即可._

- 有没有支付相关文档？<br>
_[https://docs.open.alipay.com/api](https://docs.open.alipay.com/api)_

## 打赏一下
![](imgs/award.png)