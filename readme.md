

## 项目简介

这是springboot整合mybatis的单数据源demo，其架构简洁清晰，采用全注解方式，适用于单体项目，能够快速开始你的业务代码

极简版 springboot（默认连接池HirakiCP）、mybatis（纯注解[复杂sql]）、mysql，模板直接套用



## 项目结构

```
src									# 源码包
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─example
    │  │          └─springbootmybatis					# 业务逻辑包
    │  │              │  SpringbootMybatisApplication.java
    │  │              │
    │  │              ├─controller					# 控制器包
    │  │              │      UserController.java
    │  │              │
    │  │              ├─entity						# 实体类包
    │  │              │      Page.java
    │  │              │
    │  │              ├─mapper						# mapper接口包
    │  │              │      UserMapper.java
    │  │              │
    │  │              ├─service						# 服务接口包
    │  │              │  │  UserService.java
    │  │              │  │
    │  │              │  └─impl						# 服务接口实现包
    │  │              │          UserServiceImpl.java
    │  │              │
    │  │              └─util						# 工具类包
    │  │                      Const.java
    │  │
    │  └─resources							# 资源文件存放路径
    │      │  application.yml
    │      │
    │      └─static							# 静态资源存放路径
    └─test								# 测试包
        └─java
            └─com
                └─example
                    └─springbootmybatis				        # 测试逻辑业务包
                            SpringbootMybatisApplicationTests.java	# 测试启动类
```



## 涉及软件

springboot 2.1.1.RELEASE，java 1.8, mybatis-spring-boot-starter 1.3.2



## 使用说明

### 修改application.yml (端口号、数据库连接、mybatis配置、日志配置)

```
server:
  port: 8082

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/sbm_db_test01?useSSL=false&serverTimezone=UTC
    username: root
    password: 123456
    driverClassName: com.mysql.cj.jdbc.Driver

    #jackson
  jackson:
    time-zone: GMT+8
    date-format: yyyy-MM-dd HH:mm:ss
    joda-date-time-format: yyyy-MM-dd HH:mm:ss
#mybatis实体映射
mybatis:
  type-aliases-package: com.example.springbootmybatis.entity

logging:
  level:
    com.example.springbootmybatis.mapper: debug
  path: /springbootmybatis_log/
```

### static目录说明

resources/static文件下用于放静态文件（前后端分离，前端的项目直接放进来，请求不用写端口和域名,直接写请求路径就行，例如：localhost:8080/a/s可写成/a/s）

## 说明

此文档是按照个人标准开源项目文档结构书写，欢迎留言