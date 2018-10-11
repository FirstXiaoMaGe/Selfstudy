ssms
======

### 本版说明
#### ssms 开发工具
- IDEA

#### ssms 运行环境
- JDK 8 162+
- Tomcat 8.5.32
- Maven 3.5.x +

#### ssms 技术选型
- 核心框架：SpringBoot、SpringMvc、Mybatis
- 安全框架：Apache Shiro
- 数据库连接池：Druid
- 数据库: MySql

#### 集成shiro
##### shiro特性

Authentication：身份认证/登录，验证用户是不是拥有相应的身份；

Authorization：授权，即权限验证，验证某个已认证的用户是否拥有某个权限；即判断用户是否能做事情，常见的如：验证某个用户是否拥有某个角色。或者细粒度的验证某个用户对某个资源是否具有某个权限；

Session Manager：会话管理，即用户登录后就是一次会话，在没有退出之前，它的所有信息都在会话中；会话可以是普通JavaSE环境的，也可以是如Web环境的；

Cryptography：加密，保护数据的安全性，如密码加密存储到数据库，而不是明文存储；

Web Support：Web支持，可以非常容易的集成到Web环境；

Caching：缓存，比如用户登录后，其用户信息、拥有的角色/权限不必每次去查，这样可以提高效率；

Concurrency：shiro支持多线程应用的并发验证，即如在一个线程中开启另一个线程，能把权限自动传播过去；

Testing：提供测试支持；

Run As：允许一个用户假装为另一个用户（如果他们允许）的身份进行访问；

