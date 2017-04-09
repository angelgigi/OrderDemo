/**
 * Created by angelqiqi on 2017/3/16.
 */
//Domready
$(document).ready(function(){
 //  City.getCityList();
    City.showList();
});

//多实例对象闭包
//单实例对象普通模式创建
var Page={
    content:$("#content")
};
//单实例对象闭包
var City=(function(){
//Ajax获取数据对象
        function getCityList(){
            var list=new Array();
            $.ajax({
                type:"post",
                url:"/city/getcitylist",
                async:false,//同步请求
                success:function(data){
                    list=data.list;
                }

            });
            return list
        }
//渲染citylist
        function showList(){
            var tempData=[];
            tempData.list=getCityList();
            var html=template('testtm',tempData);
            Page.content.html(html);

        }
//return公共方法
        return{
            getCityList:getCityList,
            showList:showList,

        }
})();//自执行函数

