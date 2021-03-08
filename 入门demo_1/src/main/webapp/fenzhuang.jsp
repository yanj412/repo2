<%--
  Created by IntelliJ IDEA.
  User: Hassee
  Date: 2021/3/6
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <p> --------------测试list数据，map数据对象的封装-------------</p>   <br/>
    <form action="/fenzhuang" method="post">
        姓名：<input type="text" name="name"/> <br/>
        金钱：<input type="text" name="money"/> <br/>
        姓名：<input type="text" name="userList[0].name"/> <br/>
        金钱：<input type="text" name="userList[0].money"/> <br/>
        姓名：<input type="text" name="userList[1].name"/> <br/>
        金钱：<input type="text" name="userList[1].money"/> <br/>
        姓名：<input type="text" name="map['大大'].name"/> <br/>
        金钱：<input type="text" name="map['大大'].address"/> <br/>
        提交 <input type="submit" value="提交答案"/>
    </form>
    <p> --------------测试modelattribute-------------</p>   <br/>
    <form action="/test_modelattribute" method="post">
        userid:<input type="text" name="uid" /> <br/>
        姓名：<input type="text" name="name"/> <br/>
        地址：<input type="text" name="address"/> <br/>
        性别：<input type="text" name="sex"/> <br/>

        提交 <input type="submit" value="提交用户"/>
    </form>


</body>
</html>
