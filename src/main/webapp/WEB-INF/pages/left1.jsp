<%--
  Created by IntelliJ IDEA.
  User: Mr Li
  Date: 2019/5/8
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>layui垂直导航条</title>
    <link rel="stylesheet" href="../../layui/css/layui.css" media="all" />
    <script type="text/javascript" src="../../layui/layui.js"></script>
    <script>
        //注意：导航 依赖 element 模块，否则无法进行功能性操作
        layui.use('element', function(){
            var element = layui.element;

            //…
        });
    </script>
</head>
<body>
<ul class="layui-nav layui-nav-tree" lay-filter="test" style="width:150px;background: #cc9999">
<%--侧边导航: <ul class="layui-nav layui-nav-tree layui-nav-side" style="width:160px;background: #cc9999">--%>
       <br/>
       <li>
           &nbsp;&nbsp;&nbsp;&nbsp;<img src="images/daohang.jpg"/>&nbsp;<span>系统菜单</span>
       </li>
       <br/>
       <li class="layui-nav-item">
           <a href="javascript:;">&nbsp;&nbsp;<img src="images/ico_System.gif"/>&nbsp;用户管理</a>
        <dl class="layui-nav-child">
            <dd><a href="addUser" target="mainFrame">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <img src="images/send.jpg"/>&nbsp;新增用户</a></dd>
            <dd><a href="listUser" target="mainFrame">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <img src="images/ico_System.gif"/>&nbsp;用户列表</a></dd>
            <dd><a href="getUNAndP" target="mainFrame">
                &nbsp;&nbsp;&nbsp;&nbsp;
                <img src="images/ico_Search.gif"/>&nbsp;修改密码</a></dd>
        </dl>
    </li>

       <li class="layui-nav-item">
           <a href="javascript:;">&nbsp;&nbsp;<img src="images/ico_Log.gif"/>&nbsp;客户管理</a>
           <dl class="layui-nav-child">
               <dd><a href="addCus" target="mainFrame">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_DecisionMaking.gif"/>&nbsp;新增客户</a></dd>
               <dd><a href="customerlist" target="mainFrame">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_DataDict.gif"/>&nbsp;客户资料</a></dd>
           </dl>
       </li>
       <li class="layui-nav-item">
           <a href="javascript:;">&nbsp;&nbsp;<img src="images/ico_MaterialClass.gif"/>&nbsp;运输工具</a>
           <dl class="layui-nav-child">
               <dd><a href="addCar" target="mainFrame">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_Page.gif"/>&nbsp;新增汽车</a></dd>
               <dd><a href="carlist" target="mainFrame">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_Passenger.gif"/>&nbsp;资料列表</a></dd>
           </dl>
       </li>

       <li class="layui-nav-item">
           <a href="javascript:;">&nbsp;&nbsp;<img src="images/ico_User.gif"/>&nbsp;运输管理</a>
           <dl class="layui-nav-child">
               <dd><a href="transCarlist" target="mainFrame">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_Role.gif"/>&nbsp;车辆调度</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_EventSign.gif"/>&nbsp;订单管理</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_Expert.gif"/>&nbsp;未发车</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_Expert.gif"/>&nbsp;已发车</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_Expert.gif"/>&nbsp;已到站</a></dd>
               <dd><a href="selectOrd" target="mainFrame">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_Excel.gif"/>&nbsp;订单明细</a></dd>
           </dl>
       </li>
       <li class="layui-nav-item">
           <a href="javascript:;">&nbsp;&nbsp;<img src="images/Zxmxtj.gif"/>&nbsp;财务管理</a>
           <dl class="layui-nav-child">
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/yw.gif"/>&nbsp;收付款管理</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/Zxtj.gif"/>&nbsp;客户往来明细</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/Zxtj.gif"/>&nbsp;客户往来统计</a></dd>
           </dl>
       </li>
       <li class="layui-nav-item">
           <a href="javascript:;">&nbsp;&nbsp;<img src="images/ico_Resource.gif"/>&nbsp;系统管理</a>
           <dl class="layui-nav-child">
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_Refresh.gif"/>&nbsp;区域设置</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/sound.gif"/>&nbsp;运输工具类别</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/2.gif"/>&nbsp;客户类型设置</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/xtyh.gif"/>&nbsp;付款方式类设置</a></dd>
               <dd><a href="javascript:;">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/xtyh.gif"/>&nbsp;订单状态设置</a></dd>
           </dl>
       </li>
       <li class="layui-nav-item">
           <a href="javascript:;">&nbsp;&nbsp;<img src="images/ico_MaterialClass.gif"/>&nbsp;安全管理</a>
           <dl class="layui-nav-child">
               <dd><a href="/accmodule/acc" target="mainFrame">
                   &nbsp;&nbsp;&nbsp;&nbsp;
                   <img src="images/ico_Passenger.gif"/>&nbsp;权限设置</a></dd>
           </dl>
       </li>

</ul>
</body>
</html>
