/**
 * Created by angelqiqi on 2017/3/15.
 */

//Dom ready
$(document).ready(function () {
    City.bindEvent();

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
    btn:$("#btn"),
    Name:$("#Name"),
    District:$("#District"),
    CountryCode:$("#CountryCode"),
    Population:$("#Population"),
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

    }

    function updateCity(city) {

        //var city={id:1,name:"sdsd",countryCode:'ssd',district:'erwre',population:214324};

        $.ajax({
            type:"post",
            url:"/city/updateCity",
            contentType: 'application/json',
            data:JSON.stringify(city),
            async:false,  //同步请求
            success:function (data) {
               // alert(data)
            }
        });

    }


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

    function addCity(city) {
     //   var city={name:"3432",countryCode:'ssd',district:'gfg',population:5435};
        $.ajax({
            type:"post",
            url:"/city/addCity",
            contentType: 'application/json',
            data:JSON.stringify(city),
            async:false,  //同步请求
            success:function (data) {
             //   alert(data)
                window.location.href="/city/list";
            }
        });

    }
    //addlist 添加一条数据
    function add() {

    }

    //绑定页面元素事件
    function bindEvent() {
        Page.btn.bind("click",function () {
          var txtVal=$("input[type='text']").val();
        if(txtVal !=null && txtVal !=""){
            var citymodel={name:null,countryCode:null,district:null,population:null};
            citymodel.name=Page.Name.val();
            citymodel.countryCode=Page.CountryCode.val();
            citymodel.district =Page.District.val();
            citymodel.population=Page.Population.val();
            addCity(citymodel);

        }
        else {
            alert("内容不能为空")
        }
    });
    }
    //return 公共方法
    return{
        getCityList:getCityList,
        bindEvent:bindEvent,
        showList:showList,
        cityModel:citymodel,
        addCity:addCity,
    }
})();


//单实例对象
var person =(function () {

    var  citymodel=new cityModel();

    return{
        citymodel:citymodel,
    }

})();