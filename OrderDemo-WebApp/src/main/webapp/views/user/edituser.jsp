<%--
  Created by IntelliJ IDEA.
  User: angelqiqi
  Date: 2017/3/30
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新</title>
    <link rel="stylesheet" type="text/css" href="http://localhost/web/css/addlist/addlist.css">
    <script language="javascript" src="../js/jquery-1.8.2.min.js"></script>
    <script language="javascript" src="../js/template.js"></script>
</head>
<body>
<input id="hdid" type="hidden" value=${user.id}>
<div >
    <ul class="search-content">
        <li class="list">
            <span class="name">Id</span>
            <div class="inputbox">
                <input type="text" id="ID">
            </div>
        </li>
        <li class="list">
            <span class="name">name</span>
            <div class="inputbox">
                <input type="text" id="Name">
            </div>
        </li>
        <li class="list">
            <span class="name">Username</span>
            <div class="inputbox">
                <input type="text" id="Username">
            </div>
        </li>
        <li class="list">
            <span class="name">Password</span>
            <div class="inputbox">
                <input type="text" id="Password" maxlength="9">
            </div>
        </li>
    </ul>
</div>
<button class="sure" id="btn_ok" >确定</button>
</body>
<script type="text/javascript" src="http://localhost/web/js/user/edituser.js"></script>
</html>
