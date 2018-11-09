## 发布说明
- 软文介绍 https://my.oschina.net/songxinqiang/blog/313226
- https://www.ezloo.com/2015/01/pgp_for_mac_os_x.html
- 发布命令 mvn clean deploy -P release

### 以后的发布流程：
a）构件准备好之后，在命令行上传构建；

b）在https://oss.sonatype.org/ “close”并“release”构件；

c)等待同步好（大约2小时多）之后，就可以使用了

