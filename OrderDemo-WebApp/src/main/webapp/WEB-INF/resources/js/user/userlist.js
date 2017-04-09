/**
 * Created by angelqiqi on 2017/3/23.
 */
//页面Dom对象
var Page ={
    content:$("#content")
    
};
//主对象 闭包模式
var User=(function () {
     function getUserList() {
        var list=new Array;
         //Ajax 获取数据对象
        $.ajax({
            type:"post",
            url:"getuserlist",
            async:false, //同步请求
            success:function (data) {
                list = data.list
            }
        });
         return list
     }
     function showList() {
         var tempData=[];
         tempData.list=getUserList();
         var html=template('testtm',tempData);
         Page.content.html(html);
         bindEvent();
     }
     //删除方法
     function deleteUser(id) {
         $.ajax({
             type:"post",
             url:"/user/deleteUser",
             contentType: 'application/json',
             data:JSON.stringify(id),
             async:false,  //同步请求
             success:function (data) {
                // alert(data)
             }
         });
     }
     //修改方法
    function UpdateUser(user) {
        $.ajax({
           type:"post",
           url:"/user/updateCity" ,
            contentType:'application/json',
            data:JSON.stringify(user),
            async:false,  //同步请求
            success:function (data) {
                alert(data)
            }
        });
    }
     //事件绑定方法
     function bindEvent() {
         $(".del").each(function (i) {
             $(this).bind('click',function () {
                 if(confirm("是否删除这条数据")){
                     deleteUser($(this).attr("cityid"));
                     showList();
                 }
                 else {
                     return false
                 }
             })
         })
     }
    
     //return 公共方法
    return{
        showList:showList,
        bindEvent:bindEvent
    }
})();
//Dom ready
$(document).ready(function () {
    User.showList()
});