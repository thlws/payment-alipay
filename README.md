## 简介说明
- 支付宝”支付相信很多开发者朋友在工作中遇到过这样的需求，虽说支付宝提供了SDK示例，基本可以直接拿过来使用，但支付宝分的比较详细，例如：当面付、手机网站支付、电脑网站支付等，需要下载各自的SDK并加入到自己的项目中，如果是maven项目，还需要把SDK上传到公司内部的maven私有库，显得比较繁琐，所以考虑上面的问题，整合支付宝多种支付场景的项目来了，如你所见 它叫 payment-alipay 。


## 条码支付
- AlipayCore.pay(AlipayTradeInput input)
```
AlipayTradeInput input = new AlipayTradeInput();
input.setSellerId(partner_id);
input.setTotalAmount("0.01");
input.setStoreId("0000102678762");
input.setOperatorId("operator01");
input.setBody("test pay");
input.setDiscountableAmount("0");
input.setUndiscountableAmount("0");
input.setOutTradeNo(System.currentTimeMillis()+"");
input.setSubject("subject01");
List<GoodsDetail> list = new ArrayList<GoodsDetail>();
list.add(GoodsDetail.newInstance("g01","name1",10,1));
list.add(GoodsDetail.newInstance("g02","name2",12,3));
input.setGoodsDetailList(list);
input.setAuthCode("289296533713001450");
AlipayTradeOutput output = alipayCore.pay(input);
//output就是支付结果,具体请参考相关属性说明
```


## 退款操作
- AlipayCore.refund(AlipayRefundInput input) </em></p>
```
AlipayRefundInput input = new AlipayRefundInput();
input.setOutTradeNo("1508487673867");
input.setTradeNo("2017102021001004515315574686");
input.setRefundAmount("0.01");
input.setRefundReason("测试退款");
input.setStoreId("0000102678762");
input.setTerminalId("10007");
AlipayRefundOutput output = alipayCore.refund(input);
//output 就是退款结果
```

## 查询操作
- AlipayCore.query(String outTradeNo)
```
AlipayQueryOutput output = alipayCore.query("5113811987100800791");
```

## H5支付
- AlipayCore.pay_in_h5(AlipayH5Input input)
```
AlipayH5Input input = new AlipayH5Input();
AlipayH5Input.BizContent bizContent = new AlipayH5Input.BizContent();
bizContent.setTotal_amount("0.01");
bizContent.setSubject("测试H5支付");
bizContent.setSeller_id(partner_id);
bizContent.setProduct_code("p0001");
bizContent.setOut_trade_no(System.currentTimeMillis()+"");
String html = alipayCore.pay_in_h5(input);
//html结果直接显示在页面即可
```

## 其他接口
- AlipayCore.cancel(String outTradeNo)//撤销支付
- AlipayCore.precreate(AlipayQrcodeInput input)//订单预创建


## 其他说明

 使用如上接口前，必须先行初始化AlipayCore，初始化需要如下3个参数</p>
- appid 支付宝应用ID
- private_key 应用私钥
- alipay_public_key 支付宝公钥


