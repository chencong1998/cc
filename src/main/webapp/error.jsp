<%--
  Created by IntelliJ IDEA.
  User: Mr Li
  Date: 2019/5/9
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 引入jquery -->
    <script type="text/javascript" src="../../static/js/jquery.min.js"></script>
    <!-- 引入样式 -->
    <link href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <style type="text/css">
        #ex{
            background: url(images/cxk.png);
            width:50%;
            height:100%;
            background-repeat: no-repeat;
            background-size: 100% 100%;
        }
        #extop{
            height:55%;
        }
    </style>
</head>
<body>
<center>
    <div id="ex">
        <div id="extop">

        </div>
        <div id="ex1">
            <input type="button" class="btn btn-danger" value="鸡你太美" onclick="javascript:history.go(-1)"/>
        </div>
    </div>
</center>
</body>
</html>
