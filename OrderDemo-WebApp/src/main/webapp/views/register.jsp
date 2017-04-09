<%--
  Created by IntelliJ IDEA.
  User: angelqiqi
  Date: 2017/3/17
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="http://localhost/web/css/register/register.css">
    <script language="javascript" src="../js/jquery-1.8.2.min.js"></script>
    <script language="javascript" src="../js/template.js"></script>
</head>
<body>
<div class="register-container">
    <div class="form-item">
        <span class="lab">姓名</span>
        <input type="text" class="jd" id="Name" placeholder="姓名" >
        <i id="checkResult_name"></i>
    </div>
    <div class="form-item">
        <span class="lab">用户名</span>
        <input type="text" class="jd" id="username" placeholder="您的用户名" >
        <i id="checkResult_username"></i>
    </div>
    <div class="form-item">
        <span class="lab">设置密码</span>
        <input type="password" class="jd" id="password" placeholder="建议至少使用两种字符组合">
        <i id="checkResult_password"></i>
    </div>
    <button class="jd_btn" id="btn">注册</button>
</div>

</body>
<script type="text/javascript" src="http://localhost/web/js/user/register.js"></script>
</html>
