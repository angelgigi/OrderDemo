/**
 * Created by angelqiqi on 2017/3/17.
 */
//Dom Ready
$(document).ready(function () {

    Submit.bindEvent();
});

//单实例对象 普通模式创建
var InitData={
    text_LoginName:$("#text_LoginName"),
    text_LoginPwd:$("#text_LoginPwd"),
    button_LoginSubmit:$("#button_LoginSubmit")
};
//单实例对象 闭包
var Submit = (function () {
       //判断用户名密码是否为空
    function login(username,password) {
        var user = {userName:username,passWord:password};
        if(username!="" && password!="" ){
            $.ajax({
                type: "post",
                url: "/dologin", //后台方法名
                contentType: 'application/json',   //发送请求 参数格式
                data: JSON.stringify(user),        //请求的参数  stringify()用于从一个对象解析出字符串
                async: false,  //同步请求
                //ajax执行成功的回调方法
                success: function (data) {     //成功所返回的值
                    if (data.result === "OK") {
                        //登录成功
                       window.location.href="/user/userlist"
                    }
                    else {
                        //登录失败
                        alert(data.result)
                    }

                }

            })

        }else {
            alert("内容不能为空")
        }
    }
    function bindEvent() {
        InitData.button_LoginSubmit.bind("click",function(){
            login(InitData.text_LoginName.val(),InitData.text_LoginPwd.val());
        });
        InitData.text_LoginPwd.bind('keypress', function (event) {
            if (event.keyCode == "13") {
                login(InitData.text_LoginName.val(),InitData.text_LoginPwd.val());
            }
        });
    }
    return{
      login:login,
      bindEvent:bindEvent
    }
})();