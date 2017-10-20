<h1>payment-alipay </h1>

<h2>简介说明</h2>

<p>“支付宝”支付相信很多开发者朋友在工作中遇到过这样的需求，虽说支付宝提供了SDK示例，基本可以直接拿过来使用，但支付宝分的比较详细，例如：当面付、手机网站支付、电脑网站支付等，需要下载各自的SDK并加入到自己的项目中，如果是maven项目，还需要把SDK上传到公司内部的maven私有库，显得比较繁琐，所以考虑上面的问题，整合支付宝多种支付场景的项目来了，如你所见 它叫 payment-alipay 。</p>

<h2>使用说明</h2>

<h3>引入方式</h3>

<ul>
	<li>maven项目</li>
</ul>

<pre><code>&lt;dependency&gt;
&lt;groupId&gt;org.thlws.payment&lt;/groupId&gt;
&lt;artifactId&gt;payment-alipay&lt;/artifactId&gt;
&lt;version&gt;2.0.0&lt;/version&gt;
&lt;/dependency&gt;
</code></pre>

<ul>
	<li>普通项目</li>
</ul>

<p>点击下载 <a href="www.baidu.com">payment-alipay-2.0.0.jar</a></p>

<h3>条码支付</h3>

<p><em>AlipayCore.pay(AlipayTradeInput input) </em></p>

<pre><code>//条码支付示例代码
AlipayTradeInput input = new AlipayTradeInput();
input.setSellerId(partner_id);
input.setTotalAmount(&quot;0.01&quot;);
input.setStoreId(&quot;0000102678762&quot;);
input.setOperatorId(&quot;operator01&quot;);
input.setBody(&quot;test pay&quot;);
input.setDiscountableAmount(&quot;0&quot;);
input.setUndiscountableAmount(&quot;0&quot;);
input.setOutTradeNo(System.currentTimeMillis()+&quot;&quot;);
input.setSubject(&quot;subject01&quot;);
List&lt;GoodsDetail&gt; list = new ArrayList&lt;GoodsDetail&gt;();
list.add(GoodsDetail.newInstance(&quot;g01&quot;,&quot;name1&quot;,10,1));
list.add(GoodsDetail.newInstance(&quot;g02&quot;,&quot;name2&quot;,12,3));
input.setGoodsDetailList(list);
input.setAuthCode(&quot;289296533713001450&quot;);
AlipayTradeOutput output = alipayCore.pay(input);
//output就是支付结果,具体请参考相关属性说明
</code></pre>

<h3>退款操作</h3>

<p><em>AlipayCore.refund(AlipayRefundInput input) </em></p>

<pre><code>//退款示例代码
AlipayRefundInput input = new AlipayRefundInput();
input.setOutTradeNo(&quot;1508487673867&quot;);
input.setTradeNo(&quot;2017102021001004515315574686&quot;);
input.setRefundAmount(&quot;0.01&quot;);
input.setRefundReason(&quot;测试退款&quot;);
input.setStoreId(&quot;0000102678762&quot;);
input.setTerminalId(&quot;10007&quot;);
AlipayRefundOutput output = alipayCore.refund(input);
//output 就是退款结果
</code></pre>

<h3>查询操作</h3>

<p><em>AlipayCore.query(String outTradeNo)</em></p>

<pre><code>//查询示例代码
AlipayQueryOutput output = alipayCore.query(&quot;5113811987100800791&quot;);
</code></pre>

<h3>H5支付</h3>

<p><em>AlipayCore.pay<em>in</em>h5(AlipayH5Input input)</em></p>

<pre><code>//H5支付示例代码
AlipayH5Input input = new AlipayH5Input();
AlipayH5Input.BizContent bizContent = new AlipayH5Input.BizContent();
bizContent.setTotal_amount(&quot;0.01&quot;);
bizContent.setSubject(&quot;测试H5支付&quot;);
bizContent.setSeller_id(partner_id);
bizContent.setProduct_code(&quot;p0001&quot;);
bizContent.setOut_trade_no(System.currentTimeMillis()+&quot;&quot;);
String html = alipayCore.pay_in_h5(input);
//html结果直接显示在页面即可
</code></pre>

<h3>其他接口</h3>

<ul>
	<li>AlipayCore.cancel(String outTradeNo)//撤销支付</li>
	<li>AlipayCore.precreate(AlipayQrcodeInput input)//订单预创建</li>
</ul>

<h3>其他说明</h3>

<p>使用如上接口前，必须先行初始化AlipayCore，初始化需要如下3个参数</p>

<ol>
	<li>appid 支付宝应用ID</li>
	<li>private_key 应用私钥</li>
	<li>alipay_public_key 支付宝公钥</li>
</ol>


