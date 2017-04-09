<%--
  Created by IntelliJ IDEA.
  User: angelqiqi
  Date: 2017/3/12
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="http://localhost/web/css/list/list.css">
    <%--<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">--%>
    <script language="javascript" src="../js/jquery-1.8.2.min.js"></script>
    <script language="javascript" src="../js/template.js"></script>
    <script id="testtm" type="text/html">
        <div class="table_style">
        <table>
            <tr>
                <th>Id</th>
                <th>name</th>
                <th>District</th>
                <th>CountryCode</th>
                <th>Population</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
            {{each list as value i}}
            <tr>
                <td><a href="/city/city?id={{value.id}}">{{value.id}}</a></td>
                <td>{{value.name}}</td>
                <td>{{value.district}}</td>
                <td>{{value.countryCode}}</td>
                <td>{{value.population}}</td>
                <td><a href="javascript:void(0)" class="del" cityid={{value.id}}>删除</a></td>
                <td><a href="/city/editcity?id={{value.id}}">修改</a></td>
            </tr>
            {{/each}}
        </table>
        </div>
    </script>
</head>
<body>
<div id="content"> </div>
<div id="btn" class="btn"><a href="/city/addlist">添加</a></div>
</body>
<%--<script language="javascript" src="http://localhost/web/js/city/list.js"></script>--%>
<script language="javascript" src="http://localhost/web/js/city/list.js"></script>
</html>
