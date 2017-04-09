/**
 * Created by angelqiqi on 2017/3/15.
 */
/**
 * Created by angelqiqi on 2017/3/12.
 */
//全局变量

//Dom ready
$(document).ready(function () {
    City.initCity();
    City.bindEvent();
});
//单实例对象 普通模式创建
var Page = {
    hdid:$("#hdid"),
    btn_ok:$("#btn_ok"),
    ID:$("#ID"),
    Name:$("#Name"),
    District:$("#District"),
    CountryCode:$("#CountryCode"),
    Population:$("#Population"),
};

//单实例对象 闭包
var City = (function(){
    //Ajax 获取数据对象
    function getCityInfo(id) {
        var cityinfo= null;
        $.ajax({
            type:"post",
            url:"/city/getcityInfo",
            contentType: 'application/json',
            data:JSON.stringify(id),
            async:false,  //同步请求
            success:function (data) {
                cityinfo = data.city;
            }
        });
        return cityinfo;
    }
    //修改方法
    function updateCity(city) {
        // var city={name:"3432",countryCode:'ssd',district:'gfg',population:5435};
        $.ajax({
            type:"post",
            url:"/city/updateCity",
            contentType: 'application/json',
            data:JSON.stringify(city),
            async:false,  //同步请求
            success:function (data) {
                //alert(data)
                if(data==1){
                    initCity();
                    window.location.href="/city/list";
                }
            }
        });
    }

    //绑定页面元素事件
    function bindEvent() {
        Page.btn_ok.bind("click",function () {
            var txtVal=$("input[type='text']").val();
            if(txtVal !=null && txtVal !=""){
                var citymodel={id:null,name:null,countryCode:null,district:null,population:null};
                citymodel.id=Page.ID.val();
                citymodel.name=Page.Name.val();
                citymodel.countryCode=Page.CountryCode.val();
                citymodel.district =Page.District.val();
                citymodel.population=Page.Population.val();
                updateCity(citymodel);
            }
            else {
                alert("内容不能为空")
            }
        })
    }
    
    //初始化城市信息
    function initCity() {
        var cityInfo=getCityInfo(Page.hdid.val());
        if(cityInfo!=null){
            Page.ID.val(cityInfo.id);
            Page.Name.val(cityInfo.name);
            Page.CountryCode.val(cityInfo.countryCode);
            Page.District.val(cityInfo.district);
            Page.Population.val(cityInfo.population)
        }else {
              alert("城市内容为空")
        }
    }
    //return 公共方法
    return{
        bindEvent:bindEvent,
        initCity:initCity
    }
})();




