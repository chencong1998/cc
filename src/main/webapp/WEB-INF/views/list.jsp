<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示页面</title>
</head>
<body>
<h3>--显示所有员工信息--</h3>
<c:if test="${empty employees}">
无记录
</c:if>
<c:if test="${! empty employees}">
<table border="1" cellpadding="5">
  <tr><th>ID</th><th>lastName</th><th>Gend</th><th>Email</th><th>Edit</th><th>Del</th></tr>
  <c:forEach items="${employees }" var="emp">
  <tr><td>${emp.id }</td><td>${emp.lastName}</td><td>${emp.gender }</td><td>${emp.email }</td>
  <th><a href="${pageContext.request.contextPath }/findByEmpId?id=${emp.id }">Edit</a></th>
  <th><a href="${pageContext.request.contextPath }/deleteEmp?id=${emp.id }">Del</a></th>
  </tr>
  </c:forEach>
</table>
</c:if>
<h3><a href="${pageContext.request.contextPath }/add">Add</a></h3>
</body>
</html>