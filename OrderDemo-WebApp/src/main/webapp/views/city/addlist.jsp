<%--
  Created by IntelliJ IDEA.
  User: angelqiqi
  Date: 2017/3/14
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加</title>
    <link rel="stylesheet" type="text/css" href="http://localhost/web/css/addlist/addlist.css">
    <script language="javascript" src="../js/jquery-1.8.2.min.js"></script>
    <script language="javascript" src="../js/template.js"></script>

</head>
<body>
<input type="hidden" id="hdid"  >
<div >
    <ul class="search-content">
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
<button class="sure" id="btn" >确定</button>
</body>
<script language="javascript" src="http://localhost/web/js/city/addlist.js"></script>
</html>
