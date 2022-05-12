#   基于SpringBoot的个人博客系统



------
快速部署
```shell
echo "请先cd到本项目的docker目录下"
cp ../target/Blog-0.0.1-SNAPSHOT.jar .
docker bliud -t czyblog:1.0 .
docker-compose up -d

##停止项目 docker-compose down
```
**预览图**
![index](https://raw.githubusercontent.com/1412849797/blog/xml/src/main/resources/static/images/demo/index.png)
---
![admin](https://raw.githubusercontent.com/1412849797/blog/xml/src/main/resources/static/images/demo/admin.png)


---

**使用技术**:

✔️框架：Springboot

✔️数据库持久层：Mybatis

✔️分页插件：PageHelper

✔️数据库连接池：hikari

✔️数据库：MySQL

✔️日志：Log4J

✔️后台配置: properties

✔️缓存实现: Redis

----
感谢
[文若君](https://github.com/laowenruo/)
