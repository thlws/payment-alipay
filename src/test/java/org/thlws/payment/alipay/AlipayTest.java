package org.thlws.payment.alipay;

import com.alipay.api.AlipayConstants;
import com.alipay.trade.model.GoodsDetail;
import org.junit.Before;
import org.junit.Test;
import org.thlws.payment.alipay.core.AlipayCore;
import org.thlws.payment.alipay.model.*;
import org.thlws.payment.alipay.utils.JsonUtil;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * 支付宝接口测试
 * Created by HanleyTang on 2017/3/6.
 */
public class AlipayTest {

    /**
     * Alipay 支付相关接口.
     */
    static AlipayCore alipayCore;

    /**
     * 查看地址[应用列表] https://openhome.alipay.com/platform/appManage.htm
     */
    public static final String appid = "2016042501333089";

    /**
     * 支付宝账户
     */
    public static final String seller_email="zhifubao2016@enjar.cn";

    /**
     * 合作者ID https://b.alipay.com/order/signManage.htm?channel=ent
     */
    public static final String partner_id="2088221719313094";

    /**
     * 设置时先记录,秘钥生成方式 https://doc.open.alipay.com/docs/doc.htm?treeId=291&articleId=105971&docType=1
     */
    public static final String private_key = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAOGAI1Nf+T3F/BGb CxLQg04h1tqxtIz31T0GuiPHq25xvRacoyI4HMeJrFt72iSxnNiFjGqCLySTrKs2 zrGjbxA2dGSKkNVDWFjAx4yaDjG/nOK0sXyKwjbaf4gGjW4fq9BzP6KKG+LoZj/e wa5syDvK1UTstAc3fqCKXqOQN24vAgMBAAECgYBr5aIBfMSHWDo6OlNcF0Ucl3h0 f98CLHttjdB22k0etXFiZmRwNSUgHLHJvEMul4WS3KPJOq1P9REDg1/3A1paI345 r6qZdn8dovEX9DG6cVnjLxx7zoobCz/eGt/nWhgIQqPXSdTYhcnlncJPogSQhnUF 0lOUUIsC/RddZYXyMQJBAPlSqy5QXB/LudH8orRSjzRWHlhVswknzIMOJX9o0Tje nlwRM3vqnstvCZKaHc0lbmitHKqDfXNCA4u49zlKB5UCQQDniiVFKY5v+VQm6724 hkVvd8ctYwdx2Qj4HXdnoXfOKxOJQuSRUW2xvTSBFtFcFlC/KZNS4Zr9u01+s5Bh J12zAkAgTWimUH0PFYsWvL+r00KAimPWGAxhNEnX9P5AuqjY0Gb+ELB17pjyTImV 9+fCi4X5g+xB31VimHvzH1zQjFndAkAz0zMGaQfNvmP8ljWP8NXn3kqBuTG4ZNji GE5arsSPLAsiZQueDzjbWLtAzaes0f3e2+Jy4bZ8Zokw++YsKNCLAkBKB1vZplV2 NG9ryG2C7KGG2AgcfkUthcFPT9tXoIYPxPXwYbChjMddMDK3QK99e9CoSKLq+RY/ B0fCEdSbADgS";

    /**
     * 应用,查看支付宝公钥
     */
    public static final String alipay_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";

    /**
     * 进入应用,查看应用公钥
     */
    public static final String public_key="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDhgCNTX/k9xfwRmwsS0INOIdbasbSM99U9Brojx6tucb0WnKMiOBzHiaxbe9oksZzYhYxqgi8kk6yrNs6xo28QNnRkipDVQ1hYwMeMmg4xv5zitLF8isI22n+IBo1uH6vQcz+iihvi6GY/3sGubMg7ytVE7LQHN36gil6jkDduLwIDAQAB";


    /**
     * MD5密钥，安全检验码，由数字和字母组成的32位字符串，查看地址：https://b.alipay.com/order/pidAndKey.htm
     */
    public static String key = "rtsqsqp9wk59t9b82y5af7g7yzp75l60";


    //RSA2 秘钥长度为2048
    public static  String private_key_0 = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCvt3gRX0IIkGVaCCUWAj8icw05Npj6bj+04Qn6nKgfwaTCSQ9IfzbhanLLXljq3JUA+6M/8VuzbCoM/COyJ+wFK8t4QnyTp0XuxjyD4Q1otLWEtkvqwTyDOQtQ+L4jp+voJxEqlP+W7GaOw/k620zjWCppVOh+RTiWynjG+cnzmiccMwp2SH4GOAhYoKFz3MqYgcBcx70ZltBCcvrGQIJ8tNwh/B60b5aErEBfYERhAiJbh85srmy6DebjR5MPm42O3/RaswMsG9Dt+Lqi07KWXfjviv28FUqjwQXGpsudBwIUPxMo4pI1KfONaSJcSx0sl9wX1qXdgeBFObZp1rg7AgMBAAECggEAWUtK4MkfrWpzlsT806pgmwkMdz6fjuPny+twPsLNTRYCvBiUg6riILsPivlvBisCLXWzCBOHHi6hT+fx298duaL/yyU+WWpvx19F8V60ibkLZV2eRrXcInMipQtC1KvI3ji8KH9/QxrvIy3DwX0gHYf4RX64hzJ2B2rs5XCaiAe98MpY5QDe2cYxxSGuqmyQmVlJ9+udQoQUF7K90k1PbImnF4XvQbuo2xNqIvOzn71HS5+Fckv5wwAZU8eq21wEO4Uc2XkBM5fNxZxa5qS/QUf7vqGn99uLxQYWBIVUS00OEtctC+gmYAYdwyrr01eYnHiFmI3qcmLSMB29KfJUgQKBgQDm6QIla1DgoXUUd3dunAL+UaS+WG+oMr/96ZDDTNV0m21bdWLk5XPRNhyCS0eYbS9KQ/2Z+llKpT/nxe+Aa9jaoFPFnvv4sGI2pW1i/jA53TYaShiJFhKW4KobJIPVAmGOxeNXF8j8hEgnQUqTa9sLvvZcnswYrMhOKAy0PH+JMwKBgQDCzzMItuQnLnwlS5SpP8//RX71N4aXxothC8dsoMAWWhtiKgIFawh66KIHFaZ88cmQ3/VRw+yfmT+qeApLEWnIFuCccxtg+F2okePzkbN56CSiJY8vJgOogReR0NisEYEJC4kOgbebaJeHuLZ04Qm2I8SIoI4Qelq2MD1TSk7k2QKBgG+HP5gfO1Mj6M7X3QG5rOB1QqMFR/jvejgDpf4OkFLf93PjQL7Z7JSyFBcCkTQYGG1AZa8HcjVRl4o02jcm3/jI021yGrXFS8qlIC5eI6DvLYCJJUyhMp1ZKhAuFNa/batt/R5FyLfelJMRQBnwUD5eH9QghuesHJtTUL+FMPxtAoGBAIFDNxvLL2yIPbwJgKUlQICjvnA73cUL6yQDytnbeFnchFsIgLrToJbdkdWdmhFB5nuI/6C3nmTwLPySFlJlRYmNFJD7F+mqI4tc8qKFxU9YqCYnQfEJClhfACKzL3JNUw+LZfAIRqqKJjHacMbxI56F8TyvPFTWuyY0sBx6LAtRAoGBAITw3IHr+ho7SMyj2RSWbBStkO6VwOtT2cnnFLgER9Er4/Fx0dMVizOwtf0wWlzFNb0NyvDshkIBAiODAZNw8WBlfyjLx2WzVEbv8jIpn1FwvtgOWpxDysn8nXYKnUW4MI5htDW7P1Wht+0PXBMhl56HaqW3z4Q/ttYneS1wrr2u";
    private static String appid_0 = "2018013002112467";
    public static String partner_id_0 = "2088522278337421";
    public  static String alipay_public_key_0 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlgm+W+vV8PiFPsLR0UAcdsi15CBZXYWfHlTh9dU3XHd4f+keE6fGGzKbkW3ULHKAUBecwWHYFsnK6rzAt/kpsDsafZQzSMVGhMhLK3u49oOVV6hRl14Xc2QNTqxDRgiEt2QeBaAi7emEthkm4FhcASvvf1T7CtaGT4PCvrIxw1ipf4W9FpnKgdA6ydQ6GSuix/McFIu4S/7t7nD17mNlOJz7IwZNGqNt5FUQ4HlKsa8KPA08cEsLxsHrVkc0r4Fn/OnH1POYEmUyWXcC+sPtNFtiiOPR1KFjMZ91Rlg1ImQNSiOkRCH23p9OKNDf99Ue2MvIQRNX1XcQWKJv4eRQzQIDAQAB";



    //RSA2 秘钥长度为2048
    public static  String private_key_ci = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCuVBRIRrH3lUsLjp93koaH1Ngg1WvGFXFOD8ac0aqQzuBWU+jZViZ0v8DFfBVjW6pJQ/e84i0Lh2JpFuWVLVh9YgjIv0mNQ83iC1n3Ab28gg8p1783/5QSEmNjg6+vCySJAxctqjbE0tqWhsAtM7O+38Oro91B3Gicn3GzFJQ9VydrwMda+hd5U5FYP2sNSf6cNHS6A5PasKhMaQOCGiQhW40kD7u5TklyzAiXT7t18aq8J6VlGlPe31tX8iFLiSCV87v7COH7krXHKhpNoM/SWf8Z+rlbUe2pbkuX38JsPt3l80fooTf7sYhj0I4LnjIg/Aoh8QE1sMuASSbGCS+VAgMBAAECggEABQDiyCRHTVzal41TZGIvPEzOmzqk6j2JT/1B7RRTee6GH9QutbY0SluKk+B42K4z2AB8Zs5zDoanO27tzfdMN+UNbX2YBdbxXNCIl39US8nL156anWfXfyFJ+vw3maWPOeN90dC127ZVkcZyU5nNSegwPIfqfM5vrjchU0t+6be/gZAyIocA6PaRxPWSf567ANs7jguedeMPdVVdvee6rY1ROhKwdyLP2kls4pKzXv3FSQcbs/alyfqhZWvcWdNebjvFTJszsipjPFGOnIQmxzxOZbPEF++nyiM2OeOoO36bDVBFsXtfttm8qsxs+tWQwGRsJEW0h2a3qBMI4+hpYQKBgQDh0YbN76tcW255XMiGsHIazfct4Ji6JYCkqBPTiVa9NingCL+aCC/4sqKoKN8FNlvWaTR4YmpT4tAYpeyW40vcLqYZT+0gbucWkbBTWB0o2qmkEeIczr4IZON0QW1rV9clpXWpl4HR1qxvFq3zxXDRcnAUqSK9o8ajUlwbJoH1bQKBgQDFoMy6lGPnFLYKTPDF/JdLbqqkuAy87BmlrkqylrVw0MquJHFm/UujNmSOS+2FbmI17wAkSl0Dku9c0bKNTtPBquqeq5Wol/SEB4C6Sr5oCaRtz92Sp48rYuRYEoy6AI6Rv0osKg2t+UVnE42bDiq2SwkYoG5Xj9b1lFBD+bhRyQKBgDZZNEWKIkb3Jm6FGyn3e27iFVRwUrGyZvS6ExN9YWfmikuGL38F623CqI0qUQqzG4VOCrfSj96inwzfmkJycAaNH6LF7r84kduHstVMRrBXeC6psy7VvzzL80Y+nPQRzxEbcmcftLnpHdUas0ERSubN0RXX4ymbKiqSnuJV8T89AoGAP0x8pnom8XnJwMzaBaAc2XVNxMqKkexRXqbPmBn7bXICqPpVNDaHBnTCim05W5Z6cGnnsrf6yM1ES4eC2A3ad1qGIWI14jUhhTRd/8025V3JQ77jajiu+6eGGct/NYg+IeKSIEkr7oA7wYMaxQIpng+0jyW7keIpaKkjeFJAvjkCgYBnu5KAZWBHuv/nr+P43zFTYylMZhoKN3IqT4PO5f06xiWxTX3zn9k5Fg/M7WdzgHak7H/MgSoQoftVfFgD5YWklUNh4AXjprdf4oSMIzM88QHTFplHh2hFLnplJrP6qGCsW2MUWQR0CF/uNdOaDp/AYOUCAqnI/WWzd3ceFxj0FQ==";
    private static String appid_ci = "2018082461122382";
    public  static String alipay_public_key_ci = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlpmpIhPr7pqm+v9wHQTd3xD7Wo1Ko7VTkMBgkw/V9jKd8h9vpUSKnx8la4SlJBY2Rcn72YXwMB3fjvh9MhrxY0yGsGJzwcpFjYa9z/ivwxke8uuyT9jVtDGWIMeVPPChaRF5pEyb6kJ6jDsdrp34GnNYthrblWqUKuw7QvRfvpARwl/Gp3pczwcPRWnkHrcnoZzU6YndLSVAqT+gmFia0DJ2H4S27r8igegbfbOpTJc+n+YuN734LLvcaoKINR9CbRPSkF5JOMmuwWThBdKBU5VwT/mrLwbIxdZkLcZ/w/17NZMHy963efhwIqTOEAup6WTD27sJi+MLjIkD9B4/6QIDAQAB";


    /**
     * 初始化函数.
     */
    @Before
    public  void init(){
        AlipayCore.ClientBuilder clientBuilder = new AlipayCore.ClientBuilder();
        //sign_type=rsa时，可不传 支付宝公钥 alipay_public_key
        //alipayCore = clientBuilder.setApp_id(appid).setPrivate_key(private_key).setSign_type(AlipayConstants.SIGN_TYPE_RSA).build();

        //alipayCore = clientBuilder.setApp_id(Params.appid_ln).setPrivate_key(Params.private_key_nl).setSign_type(AlipayConstants.SIGN_TYPE_RSA).build();


        //sign_type=rsa2时，必须传 支付宝公钥 alipay_public_key
        alipayCore = clientBuilder.setAlipay_public_key(alipay_public_key_ci).setApp_id(appid_ci).setPrivate_key(private_key_ci).setSign_type(AlipayConstants.SIGN_TYPE_RSA2).build();
    }



    /***
     * 统一收单交易支付接口（条码支付）
     */
    @Test
    public void test_pay(){

        try {

            AlipayTradeInput input = new AlipayTradeInput();

            //必须参数
            input.setTotalAmount("0.01");
            input.setStoreId("00001025104487");
            input.setOperatorId("hanley001");
            input.setAuthCode("288609492126942746");
            input.setOutTradeNo(System.currentTimeMillis()+"");
            input.setSubject("CI测试买单001");

//            如下为可选参数，全部参数请查看 AlipayTradeInput
//            input.setBody("测试支付");
//            input.setDiscountableAmount("0");
//            input.setUndiscountableAmount("0");
//            input.setSellerId(partner_id_0);
//            List<GoodsDetail> list = new ArrayList<GoodsDetail>();
//            list.add(GoodsDetail.newInstance("g01","name1",10,1));
//            list.add(GoodsDetail.newInstance("g02","name2",12,3));
//            input.setGoodsDetailList(list);

            AlipayTradeOutput output = alipayCore.pay(input);
            assertTrue(output.isSuccess());
            //output就是支付结果,具体请参考相关属性说明
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    @Test
    public void test_refund(){
        try {
            AlipayRefundInput input = new AlipayRefundInput();
            input.setTradeNo("2018102322001444515405783599");
            input.setRefundAmount("0.01");
            input.setRefundReason("测试退款");
            AlipayRefundOutput output = alipayCore.refund(input);
            System.out.println("output="+JsonUtil.format(output));
            assertTrue(output.isSuccess());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /***
     * 统一收单交易退款接口(部分退款)
     */
    @Test
    public void  test_part_refund(){

        try {
            AlipayRefundInput input = new AlipayRefundInput();
            //input.setOutTradeNo("1508487673867");
            input.setTradeNo("2018062821001004510561182960");
            input.setRefundAmount("0.05");
            input.setRefundReason("测试部分退款");
            input.setStoreId("00001025104487");
            input.setTerminalId("10007");
            input.setOutRequestNo(System.currentTimeMillis()+"");
            AlipayRefundOutput output = alipayCore.refund(input);
            System.out.println("output="+JsonUtil.format(output));
            assertTrue(output.isSuccess());
            //output 就是退款结果
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /***
     * 统一收单线下交易查询
     */
    @Test
    public void test_query(){
        try {
            AlipayQueryOutput output = alipayCore.query("1540262464959");
            System.out.println("output="+JsonUtil.format(output));
            assertTrue(output.isSuccess());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /***
     * 统一收单线下交易预创建（扫码支付）
     * 暂未开启异步通知,完成预订单创建后,请自行实现Thread调用query()查询支付结果
     */
    @Test
    public void test_precreate(){

        try {
            AlipayQrcodeInput input = new AlipayQrcodeInput();
            input.setSubject("购买商品");
            input.setOutTradeNo(System.currentTimeMillis()+"");
            input.setBody("测试下单");
            input.setOperatorId("990001");
            input.setStoreId("0001025104489");
            input.setTotalAmount("0.01");
            //input.setSellerId(partner_id);
            AlipayQrcodeOutput output = alipayCore.precreate(input);
            System.out.println("output="+JsonUtil.format(output));
            assertTrue(output.isSuccess());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /***
     * H5网页支付接口（手机网站支付）
     */
    @Test
    public void test_pay_in_h5(){

        try {
            AlipayH5Input input = new AlipayH5Input();
            input.setNotify_url("异步通知地址,支付宝通知支付结果");
            input.setReturn_url("同步返回地址,完成支付后自动转向的地址");
            AlipayH5Input.BizContent bizContent = new AlipayH5Input.BizContent();
            bizContent.setTotal_amount("0.01");
            bizContent.setSubject("测试H5(手机网页)支付");
            //bizContent.setSeller_id(partner_id);
            bizContent.setProduct_code("p0001");
            bizContent.setOut_trade_no(System.currentTimeMillis()+"");
            input.setBizContent(bizContent);
            String html = alipayCore.pay_in_h5(input);
            System.out.println("html="+html);
            assertNotNull(html);
            //html结果直接显示在页面即可
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /***
     * 电脑网页支付接口[待测试]
     */
    @Test
    public void test_pay_in_pc(){

        try {
            AlipayPcInput input = new AlipayPcInput();
            input.setNotify_url("异步通知地址,支付宝通知支付结果");
            input.setReturn_url("同步返回地址,完成支付后自动转向的地址");
            AlipayPcInput.BizContent bizContent = new AlipayPcInput.BizContent();
            bizContent.setTotal_amount("0.01");
            bizContent.setSubject("测试电脑网站支付");
            bizContent.setBody("测试");
            bizContent.setProduct_code("p0001");
            bizContent.setOut_trade_no(System.currentTimeMillis()+"");
            String html = alipayCore.pay_in_pc(input);
            assertNotNull(html);
            //html结果直接显示在页面即可
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /***
     * 统一收单交易撤销接口
     */
    @Test
    public void test_cancel(){
        try {
            AlipayCancelOutput output = alipayCore.cancel("1488867095321");
            System.out.println("output="+JsonUtil.format(output));
            assertTrue(output.isSuccess());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
