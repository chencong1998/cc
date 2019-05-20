<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改</title>
</head>
<body>
<h3>修改员工信息</h3>
<form action="${pageContext.request.contextPath }/updateEmp"  method="get">
<input type="hidden"  name="id" value="${emp.id }"  /><br/>
 LastName: <input type="text"  name="lastName"  value="${emp.lastName }" /><br/>
 Gender: <select name="gender" size="1">
   <c:if test="${emp.gender==1}">
   <option selected="selected" value="${emp.gender }">male</option>
   </c:if>
   <c:if test="${emp.gender==0}">
   <option selected="selected" value="${emp.gender }">female</option>
   </c:if>
   <option value="1">male</option>
   <option value="0">female</option>
 </select><br/>
 Email: <input type="text"  name="email"  value="${emp.email }" /><br/>
 <input type="submit"  value="修改"/>
</form>
</body>
</html>