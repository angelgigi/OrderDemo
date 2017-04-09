/**
 * Created by angelqiqi on 2017/3/4.
 */


//全局变量
var isShow = false;


//dom ready
$(document).ready(function () {
    City.showList();
    City.bindEvent();
    City.add();
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



//单实例对象  普通模式创建
var PageEl={
    cityul:$("#cityul"),
    btn_cityList:$("#btn_cityList"),
    content:$("#content"),
    btn_update:$("#btn_update"),
    country:$("#country"),
    country_text:$("#country_text"),
    myform:$("#myform"),
    btn:$("#btn")
};

//单实例对象  闭包
var City = (function () {

    //实例化对象
    var  citymodel=new cityModel();
    citymodel.setCityName("sdd");

    //ajax 获取数据对象
    function getCityList() {
        var list = new Array();
        $.ajax({
            type: "post",
            url: "/city/getcitylist",
            async: false,
            success: function (data) {
                list = data.list;

            },

        });
        return list;
    };

    //循环输出html 渲染页面
    function forTest(cityList) {
        if (!isShow) {
            for (var i = 0; i < cityList.length; i++) {
                //alert(cityList[i].id);
                PageEl.cityul.append("<li>" + i + "</li>")

            }
            ;

            isShow = true;
        }
        else {
            PageEl.cityul.html("");
            isShow = false;
        }
    };


    //循环输出html 下拉列表显示cityName
    function add() {
        var cityList=getCityList();//获取列表
        addOption(cityList);
        addCheckbox(cityList);
    }
    function addOption(cityList) {
        for(var i=0; i<cityList.length; i++){
            PageEl.country.append("<option>"+ cityList[i].name + "</option>")
        }
    };
    //循环输出html 复选框加载Population
    function addCheckbox(cityList) {
        for(var i=0; i<cityList.length; i++){
           PageEl.myform.append("<input type='checkbox' value="+cityList[i].population+">"+cityList[i].population+"</>")

        }
    }

    //绑定页面元素事件
    function bindEvent() {
        PageEl.btn_cityList.bind("click", function () {
            forTest(getCityList());
        });

        PageEl.btn_update.bind("click",function () {
            updateCity();
        });
        PageEl.country.bind("change",function () {
            var value=$('#country option:selected').text();
            PageEl.country_text.val(value);
            }

        )
        PageEl.btn.bind("click",function () {
             for(i=0 ; i<myform.length ; i++){
                 if (myform[i].type=="checkbox" && myform[i].checked){
                     alert(myform[i].value)
                 }
             }
            }

        )
    };

    //渲染citylist
    function showList() {
        var tempData = [];
        tempData.list = getCityList();
        var html = template('testtm', tempData);
        PageEl.content.html(html);

    }

   function updateCity () {
       $.ajax({
           type: "post",
           url: "/city/updateCity",
           async: false,
           success: function (data) {
               showList();
               alert(data);
           },

       });
   }

    //return 公共方法
    return{
        getCityList:getCityList,
        bindEvent:bindEvent,
        showList:showList,
        cityModel:citymodel,
        updateCity:updateCity,
        add:add,
        addCheckbox:addCheckbox
    }

})();


//单实例对象
var person =(function () {

    var  citymodel=new cityModel();

    return{
        citymodel:citymodel,
    }

})();



