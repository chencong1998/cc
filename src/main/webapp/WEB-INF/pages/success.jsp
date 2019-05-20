<%--
  Created by IntelliJ IDEA.
  User: Mr Li
  Date: 2019/5/9
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- 引入jquery -->
    <script type="text/javascript" src="../../static/js/jquery.min.js"></script>
    <script type="text/javascript" src="../../layer/layer.js"></script>
    <script type="text/javascript" SRC="../../js/jquery-1.7.2.js"></script>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript">
        function tips(message) {
            layer.alert(message, {
                icon : 3,
                skin : 'layer-ext-moon'
            })
        }
    </script>
</head>
<body onload="return tips('${message}')">
        <%
            String u=(String)request.getAttribute("urla");
            String op=(String)request.getAttribute("op");
            session.setAttribute("op",op);
            if("1".equals(op)){
                String id=((String)request.getAttribute("id"));
                response.setHeader("refresh","1;url="+u+"?nb="+id);
            }else if("2".equals(op)){
                String pn=((String)request.getAttribute("pn"));
                response.setHeader("refresh","1;url="+u+"?nb="+pn);
            }else if("3".equals(op)){
                String pn=((String)request.getAttribute("pn"));
                response.setHeader("refresh","1;url="+u+"?nb="+pn);
            }else if("4".equals(op)){
                String id=((String)request.getAttribute("id"));
                response.setHeader("refresh","1;url="+u+"?nb="+id);
            }else if("5".equals(op)){
                String id=((String)request.getAttribute("id"));
                response.setHeader("refresh","1;url="+u+"?nb="+id);
            }else if("6".equals(op)){
                String pn=((String)request.getAttribute("pn"));
                response.setHeader("refresh","1;url="+u+"?nb="+pn);
            }
        %>
</body>
</html>
