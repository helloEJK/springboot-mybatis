                    springboot-mybatis 单数据源示例
1、单数据源下，mysql链接关键字是url
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/sbm_db_test01?useSSL=false&serverTimezone=UTC
        username: root
        password: 123456
        driverClassName: com.mysql.cj.jdbc.Driver
2、resources/static文件下用于放静态文件（前后端分离，前端的项目直接放进来，请求不用写端口和域名,直接写请求路径就行，例如：localhost:8080/a/s可写成/a/s）