/**
 * Created by angelqiqi on 2017/3/17.
 */
//全局变量
//Dom ready
$(document).ready(function () {

  init.bindEvent();
});
   
//页面Dom对象
var Page={
    Name:$("#Name"),
    username:$("#username"),
    password:$("#password"),
    checkResult_name:$("#checkResult_name"),
    checkResult_username:$("#checkResult_username"),
    checkResult_password:$("#checkResult_password"),
    btn:$("#btn")
};


//主对象 闭包形式
var init=(function () {

     function register(user) {
       //Ajax获取数据对象
        /* $.ajax({
          type:"post",
          url:"/register",
          contentType: 'application/json',
          data:JSON.stringify(user),
          async:false,  //同步请求
          success:function (data) {
          // alert(data)
          window.location.href="login"
          },
          error:function () {
          alert("error")
          }
          });*/
         $.ajax({
            type:"post",
            url:"/register",
             contentType:'application/json',
             data:JSON.stringify(user),
             async:false, //同步请求
             success:function (data) {
             //alert(data)
                 window.location.href="login"
         },
             error:function () {
              alert("error")
             }
         });
     }
    //绑定元素事件  页面初始化
    function bindEvent() {
        Page.btn.bind("click",function () {
            if(Page.Name.val()!="" && Page.username.val()!="" && Page.password.val()!=""){
                var user={
                    name:Page.Name.val(),
                    userName:Page.username.val(),
                    passWord:Page.password.val()
                };

                register(user);
            }else {

            }
        })
    }
    //return 公共方法
    return{
       bindEvent:bindEvent
    }
    })();
