package payment.alipay.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import payment.alipay.model.AlipayH5Input;

/**
 * Created by HanleyTang on 2017/3/6.
 */
public class JsonUtil {

    public static String format(Object o){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(o);
        return prettyJson;
    }

    public static String format(String uglyJson){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jsonParser = new JsonParser();
        JsonElement jsonElement = jsonParser.parse(uglyJson);
        String prettyJson = gson.toJson(jsonElement);
        return prettyJson;
    }

    public static void main(String[] args) {
        AlipayH5Input input = new AlipayH5Input();
        AlipayH5Input.BizContent bizContent = new AlipayH5Input.BizContent();
        input.setNotify_url("www.iquickgo.com/notify.html");
        input.setReturn_url("www.iquickgo.com/return.html");
        bizContent.setOut_trade_no("11129399403");
        bizContent.setProduct_code("cat0098");
        bizContent.setSeller_id("seller001");
        bizContent.setSubject("top store shopping");
        bizContent.setTotal_amount("100.58");
        input.setBizContent(bizContent);
        String json = format(input);
        System.out.println(json);
    }
}
