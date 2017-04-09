<%--
  Created by IntelliJ IDEA.
  User: lukuanpc
  Date: 2017/1/2
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>city</title>
    <link rel="stylesheet" type="text/css" href="http://localhost/web/css/list/list.css">
</head>
<body>
<table >
    <tr>
        <th>Id</th>
        <th>District</th>
        <th>CountryCode</th>
        <th>Population</th>
    </tr>
        <tr>
            <td>${entity.id}</td>
            <td>${entity.name}</td>
            <td>${entity.countryCode}</td>
            <td><a href="#">${entity.population} </a></td>
        </tr>
</table>
</body>
</html>
