<%--
  Created by IntelliJ IDEA.
  User: angelqiqi
  Date: 2017/3/15
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>editcity</title>
    <link rel="stylesheet" type="text/css" href="http://localhost/web/css/addlist/addlist.css">
    <script language="javascript" src="../js/jquery-1.8.2.min.js"></script>
    <script language="javascript" src="../js/template.js"></script>
</head>
<body>
<input type="hidden" id="hdid" value=${city.id}>
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
            <span class="name">District</span>
            <div class="inputbox">
                <input type="text" id="District">
            </div>
        </li>
        <li class="list">
            <span class="name">CountryCode</span>
            <div class="inputbox">
                <input type="text" id="CountryCode" maxlength="3">
            </div>
        </li>
        <li class="list">
            <span class="name">Population</span>
            <div class="inputbox">
                <input type="text"  id="Population">
            </div>
        </li>
    </ul>
</div>
<button class="sure" id="btn_ok" >确定</button>
</body>
<script language="javascript" src="http://localhost/web/js/city/editcity.js"></script>
</html>
