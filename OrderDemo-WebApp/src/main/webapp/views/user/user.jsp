<%--
  Created by IntelliJ IDEA.
  User: angelqiqi
  Date: 2017/3/30
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
    <link rel="stylesheet" type="text/css" href="http://localhost/web/css/list/list.css">
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Username</th>
        <th>Password</th>
    </tr>
      <tr>
          <td>${entity.id}</td> <%-- user实体的属性 --%>
          <td>${entity.name}</td>
          <td>${entity.userName}</td>
          <td>${entity.passWord}</td>
      </tr>
</table>

</body>
</html>
