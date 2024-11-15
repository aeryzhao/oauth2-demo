
## OAuth2.0的四种授权方式

### 授权码模式
第一步：跳转请求授权页面

http://localhost:8080/oauth/authorize?client_id=client1&response_type=code&redirect_uri=http://localhost:8081/oauth/access-token

第二步：弹出登录页面，进行登录

第三步：登录后重定向到 Client 客户端，通过 code 换取 token


### 隐式授权
直接请求授权服务返回 token

http://localhost:8080/oauth/authorize?client_id=client1&response_type=token

### 密码模式
http://localhost:8080/oauth/token?grant_type=password&client_id=client1&client_secret=secret&username=admin&password=123456

### 客户端凭证模式
http://localhost:8080/oauth/token?grant_type=client_credentials&client_id=client1&client_secret=secret

参考文章
- [理解 OAuth2.0-阮一峰](https://www.ruanyifeng.com/blog/2014/05/oauth_2_0.html)
- [Spring Security oauth2（一）快速入门，搭建授权服务器](https://blog.csdn.net/m0_37892044/article/details/116599077)