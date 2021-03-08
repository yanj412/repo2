<%--
  Created by IntelliJ IDEA.
  User: Hassee
  Date: 2021/2/25
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <a href="/hello"> chaolianjie  xxxx</a>

  <br />
  <a href="/haha?name=yanjie&key=123"> 参数绑定  两个参数</a>

  <br />

  <p>绑定参数  基本类型  pojo类型 </p>
  <form action="/haha_account" method="post" >
      account的id<input type="text" name="id" />   <br />
             的name<input type="text" name="name" />   <br />
             的money<input type="text" name="money" />  <br />
      User 的name<input type="text" name="user.name" />   <br />
            的address<input type="text" name="user.address" />  <br />
         <input type="submit" />
  </form>

  <p>绑定参数  基本类型  pojo类型 </p>
  <form action="/haha_account_list" method="post" >

      account的id<input type="text" name="id" />   <br />
      的name<input type="text" name="name" />   <br />
      的money<input type="text" name="money" />  <br />
      userList 的name<input type="text" name="userList[0].name" />   <br />
      的address<input type="text" name="userList[0].address" />  <br />
      userList2 的name<input type="text" name="userList[1].name" />   <br />
      的address<input type="text" name="userList[1].address" />  <br />
      <input type="submit" />

  </form>

  <br/>
  <a href="/test_RequestParam?name=yanj">requestParm测试</a>
  <br/>
  <form action="/test_RequestBody" method="post">
      <br/> <p>测试 RequestBody 的东西，</p>
      姓名<input type="text" name="name"/>
      年龄<input type="text" name="age"/>
      <input type="submit" value="上交"/>
  </form>

  <br/>
  <a href="/test_PathVaribale/120">测试 PathVaribale</a>

  <br />
  <a href="/test_RequestHeader">测试  requestheader</a>
  <br/>
  <a href="/oldservlet">测试原生的servlet</a>
  <br/>
  <a href="/test_cookie">测试cookievalue 值</a>
  <br/>
  <a href="/test_sessionAttribute">测试 sessionAttribute</a>
  <br/>
  <a href="/get_sessionAttribute">获取 sessionAttribute</a>
  <br/>
  <a href="/delete_sessionAttribute">删除 sessionAttribute</a>



</body>
</html>
