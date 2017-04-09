<%--
  Created by IntelliJ IDEA.
  User: lukuanpc
  Date: 2017/1/9
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <script language="javascript" src="../js/jquery-1.8.2.min.js"></script>
    <script language="javascript" src="../js/template.js"></script>
    <script language="JavaScript" src="../js/easyui135/jquery.easyui.min.js"></script>
    <script src="../js/jquery-easyui-1.4/locale/easyui-lang-zh_CN.js"></script>
    <link href="../js/jquery-easyui-1.4/themes/default/easyui.css" rel="stylesheet" />
    <link href="../js/jquery-easyui-1.4/themes/icon.css" rel="stylesheet" />

    <link href="../css/main.css" rel="stylesheet" type="text/css"/>
    <script src="../js/cloud.js" type="text/javascript"></script>
    <script src="../js/jquery-easyui-1.3.6/plugins/jquery.validatebox.js" type="text/javascript"></script>
    <script src="../js/jquery-easyui-1.3.6/plugins/messages_zh.js" type="text/javascript"></script>

</head>
<body style="background-color:#1c77ac; background-image:url(../images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">
<form id="login" name="login">
    <div id="mainBody">
        <div id="cloud1" class="cloud"></div>
        <div id="cloud2" class="cloud"></div>
    </div>


    <div class="logintop">
        <span>欢迎登录</span>

    </div>

    <div class="loginbody">

        <span class="systemlogo"></span>
        <div class="main">
            <div class="center">
                <ul>
                    <li>

                        <input maxlength="15" id="text_LoginName" name="UserName" type="text" class="loginuser inputlogin easyui-validatebox" data-options="required:true" placeholder="用户名" value="" />
                    </li>
                    <li>
                        <input maxlength="15" id="text_LoginPwd" name="PassWord" type="password" class="loginpwd inputlogin easyui-validatebox" data-options="required:true" placeholder="密  码" value="" />
                    </li>
                    <li>
                       <input id="button_LoginSubmit" name="button_LoginSubmit777" type="button" class="loginbtn inputlogin" value="登  录"/>
                        <label style="color: black; font-size: 10pt; font-family: 'Open Sans', 'Microsoft YaHei', 宋体, verdana, arial;"><input id="checkbox_RememberPwd" name="checkbox_RememberPwd" type="checkbox" checked="checked" />自动登录</label>
                        <input type="hidden" id="hidden_IsRememberPwd" name="IsRemember" value="false"/>

                    </li>
                    <p class="loginp" style="margin-bottom: 5px; color: red;" id="p_errorMessage">&nbsp;</p>
                </ul>
            </div>
        </div>
        <input name="ReturnUrl" type="hidden" value="" />
    </div>
    <div class="loginbm">Copyright© 2009-2016   </div>
</form>
<script language="javascript" src="http://localhost/web/js/login/login1.js"></script>
</body>
</html>
