<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
</head>
<body>
<h3>添加员工信息</h3>
<form action="addEmp"  method="post">
 LastName: <input type="text"  name="lastName"  /><br/>
 Gender: <select name="gender" size="1">
   <option value="1">male</option>
   <option value="0">female</option>
 </select><br/>
 Email: <input type="text"  name="email"  /><br/>
 <input type="submit"  value="添加"/>
</form>
</body>
</html>