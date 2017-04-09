/**
 * Created by angelqiqi on 2017/3/12.
 */
//全局变量

//Dom ready
$(document).ready(function () {
    City.showList();
    //City.deleteCity();
    //City.bindEvent();
    });

//多实例对象  闭包
var cityModel=function () {
    var cityName="";

    function setCityName(cityname) {
        this.cityName=cityname;
    }

    return{
        cityName:cityName,
        setCityName:setCityName,
    }
};

//单实例对象 普通模式创建
var Page = {
    content:$("#content")
};

//单实例对象 闭包
var City = (function(){

    //实例化对象
    var  citymodel=new cityModel();
    citymodel.setCityName("sdd");
    //Ajax 获取数据对象
    function getCityList() {
        var list= new Array();
        $.ajax({
               type:"post",
               url:"/city/getcitylist",
               async:false,  //同步请求
               success:function (data) {
                   list = data.list;
               }
        });
        return list
    }

    //渲染citylist
    function showList() {
        var tempData = [];
        tempData.list = getCityList();
        var html = template('testtm', tempData);
        Page.content.html(html);
        bindEvent();
    }
    //修改方法
    function updateCity(city) {
        //var city={id:1,name:"sdsd",countryCode:'ssd',district:'erwre',population:214324};
        $.ajax({
            type:"post",
            url:"/city/updateCity",
            contentType: 'application/json',
            data:JSON.stringify(city),
            async:false,  //同步请求
            success:function (data) {
                alert(data)
            }
        });

    }

    //删除方法
    function deleteCity(id) {
        // var id=1;
        $.ajax({
            type:"post",
            url:"/city/deleteCity",
            contentType: 'application/json',
            data:JSON.stringify(id),
            async:false,  //同步请求
            success:function (data) {
                //alert(data)
            }
        });

    }

    //添加方法
    function addCity() {
        var city={name:"3432",countryCode:'ssd',district:'gfg',population:5435};
        $.ajax({
            type:"post",
            url:"/city/addCity",
            contentType: 'application/json',
            data:JSON.stringify(city),
            async:false,  //同步请求
            success:function (data) {
                alert(data)
            }
        });

    }
    //绑定页面元素事件
    function bindEvent() {
        $(".del").each(function (i) {
            $(this).bind("click",function () {
                if(confirm("确定删除该记录？")){
                    deleteCity($(this).attr("cityid"));
                    showList();

                }else {
                    return false;
                }
            })

        })

    }
    //return 公共方法
    return{
        bindEvent:bindEvent,
        showList:showList,
        cityModel:citymodel,
    }
})();


//单实例对象
var person =(function () {

    var  citymodel=new cityModel();

    return{
        citymodel:citymodel,
    }

})();



