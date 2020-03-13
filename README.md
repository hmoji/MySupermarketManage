# MySupermarketManage
以ssm框架搭建的超市管理系统

一个用来学习的小项目。

*这配置文件能要我半条命~~~*

- 项目管理工具是maven
- 服务器是tomcat
- 数据库是mysql
- [x] spring和mybatis的连接
- [x] spring整合mybatis的配置
- [x] springMVC的配置
- [x] ssm基本配置
- [x] 通过测试
- [x] 编写基本业务，实现参数的前后端传递
- [ ] 权限管理
- [ ] 更多业务逻辑······

## 开发日志

之前的忘写了。。。。
- 2020年3月8日<br/>
  * 现在数据库可以正常保存中文
  * 使用了注解注入代替new，更纯正的spring。
  * 添加了一个前置通知测试，将一个前置通知插在了controller之前（不过感觉没啥用）
  * 添加了一个拦截器测试，暂时还想不到怎么用。

- 2020年3月9日<br/>
  * 添加了log4j日志模块，现在可以把日志输出到文件里。
  * 把spring配置文件名改成了applicationContext，更加符合规范。
  * 增删改功能实现类使用mybatis自带的返回值（boolen），使返回结果更加准确。

- 2020年3月10日
  * 增加了登录功能

- 2020年3月12日
  * 增加了登录超时功能，拦截器派上了用场。
  * 除登录界面之外，将所有视图都放在了WEB-INF文件夹之下，使项目更加安全。

- 2020年3月13日
  * 增加了事务管理，将增删改变成了事务。