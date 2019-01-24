springboot-mybatis 单数据源示例
单数据源下，mysql链接关键字是url(多数据源jdbc-url)
resources/static文件下用于放静态文件（前后端分离，前端的项目直接放进来，请求不用写端口和域名,直接写请求路径就行，例如：localhost:8080/a/s可写成/a/s）

#极简版 springboot（默认连接池）、mybatis（纯注解[复杂sql]）、mysql，模板直接套用 #springboot 2.1.1.RELEASE，java 8,mybatis-spring-boot-starter 1.3.2
