<%--
  Created by IntelliJ IDEA.
  User: angelqiqi
  Date: 2017/3/22
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserList</title>
    <link rel="stylesheet" type="text/css" href="http://localhost/web/css/list/list.css">
    <script language="javascript" src="../js/jquery-1.8.2.min.js"></script>
    <script language="javascript" src="../js/template.js"></script>
    <script id="testtm" type="text/html">
        <div class="table_style">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
                {{each list as value i}}
                <tr>
                    <td><a href="/user/user?id={{value.id}}">{{value.id}}</a></td>
                    <td>{{value.name}}</td>
                    <td>{{value.userName}}</td>
                    <td>{{value.passWord}}</td>
                    <td><a href="javascript:void(0)" class="del" cityid="{{value.id}}">删除</a></td>
                    <td><a href="/user/edituser?id={{value.id}}">修改</a></td>

                </tr>
                {{/each}}
            </table>
        </div>
    </script>
</head>
<body>
   <div id="content"></div>
   <div id="btn" class="btn"><a href="/register">添加</a></div>
</body>
<script language="javascript" src="http://localhost/web/js/user/userlist.js"></script>
</html>
