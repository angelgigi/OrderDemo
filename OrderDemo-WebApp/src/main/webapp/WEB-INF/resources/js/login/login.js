/**
 * Created by angelqiqi on 2017/3/16.
 */
$(document).ready(function () {

    var user = {userName: 'yldk', passWord: '123456'}

    $.ajax({
        type: "post",
        url: "/dologin",
        contentType: 'application/json',
        data: JSON.stringify(user),
        async: false,  //同步请求
        success: function (data) {
            if (data.result === "OK") {
             //登录成功
            }
            else {
                //登录失败
                alert(data.result)
            }

        }
    });

});
