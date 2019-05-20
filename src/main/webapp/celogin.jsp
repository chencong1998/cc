<%--
  Created by IntelliJ IDEA.
  User: Mr Li
  Date: 2019/5/5
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 验证码图片的生成-->
<img id="code" src="dlimage.jsp"/>
<a href="#" onclick="javascript:var dt=new Date();document.getElementById('code').src='dlimage.jsp?dt='+dt;">&nbsp;
    看不清，换一张</a>（*区分字母大小写）
</body>
</html>
