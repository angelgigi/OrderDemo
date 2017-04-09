/**
 * Created by angelqiqi on 2017/3/30.
 */
//页面Dom对象
 var PageElment={
    hdid:$("#hdid"),
    btn_ok:$("#btn_ok"),
    ID:$("#ID"),
    Name:$("#Name"),
    Username:$("#Username"),
    Password:$("#Password")
};
//主对象 闭包
var Update=(function () {
    //Ajax获取数据对象
     function getUserInfo(id) {
         var userinfo = null;
             $.ajax({
             type:"post",
             url:"/user/getuserInfo",
             contentType: 'application/json',
             data:JSON.stringify(id),
             async:false,  //同步请求
             success:function (data) {
                 userinfo = data.user;
             }
         });
         return userinfo;
     }
     //修改方法
    function UpdateUser(user) {
        $.ajax({
            type:"post",
            url:"/user/updateCity",
            contentType: 'application/json',
            data:JSON.stringify(user),
            async:false,  //同步请求
            success:function (data) {
              //  alert(data);
                if(data==1){
                    initUser();
                    window.location.href="/user/userlist";
                }
            }
        });
    }
    //绑定事件
     function bindEvent() {
         PageElment.btn_ok.bind('click',function () {
             var txtVal=$("input[type='text']").val();
             if(txtVal!="" && txtVal!=null){
                 var usermodel={id:null,name:null,userName:null,passWord:null};
                 usermodel.id=PageElment.ID.val();
                 usermodel.name=PageElment.Name.val();
                 usermodel.userName=PageElment.Username.val();
                 usermodel.passWord=PageElment.Password.val();
                 UpdateUser(usermodel);
             }
             else {
                 alert("内容不能为空")
             }
         })
     }
     //初始化用户信息
    function initUser() {
        var userInfo=getUserInfo(PageElment.hdid.val());
        if(userInfo!=null){
            PageElment.ID.val(userInfo.id);
            PageElment.Name.val(userInfo.name);
            PageElment.Username.val(userInfo.userName);
            PageElment.Password.val(userInfo.passWord);
        }
        else {
           alert("用户名不能为空")
        }
    }
    //return公共方法
    return{
       initUser:initUser,
       bindEvent:bindEvent
    }

})();
//Dom ready
$(document).ready(function () {
    Update.bindEvent();
    Update.initUser()
});