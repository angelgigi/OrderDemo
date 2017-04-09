<%--
  Created by IntelliJ IDEA.
  User: lukuanpc
  Date: 2016/12/25
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <script language="javascript" src="../js/jquery-1.8.2.min.js"></script>
    <script language="javascript" src="../js/template.js">
    </script>
    <script id="testtm" type="text/html">
        <table border="1">
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
                    <td>hsuiuhc</td>
                    <td>huisvhisuv</td>
                </tr>
            {{/each}}
        </table>
    </script>


</head>
<body>



<br>
<table border="1">
    <tr>
        <th>Id</th>
        <th>name</th>
        <th>District</th>
        <th>CountryCode</th>
        <th>Population</th>

    </tr>
    <c:forEach items="${list}" var="CityEntity">
        <tr>
            <td><a href="/city/city?id=${CityEntity.id}">${CityEntity.id}</a></td>
            <td>${CityEntity.name}</td>
            <td>${CityEntity.district}</td>
            <td>${CityEntity.countryCode}</td>
            <td>${CityEntity.population}</td>

        </tr>
    </c:forEach>
</table>
<div id="content"> </div>
<button id="btn_cityList">单击</button>
<button id="btn_update">update</button>
<select id="country">

</select>
<input type="text" id="country_text" />
</br>
<form id="myform"></form>
<input type="button" id="btn" value="点击按钮"/>
<ul id="cityul">

</ul>
</body>
<script language="javascript" src="http://localhost/web/js/city/citylist.js"></script>




</html>
