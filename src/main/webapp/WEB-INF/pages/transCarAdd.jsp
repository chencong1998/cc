<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
	添加运输车辆管理
</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/invalid.css" type="text/css" media="screen" />	
</head>
<body>
     <div id="maintitle"><div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>运输车辆管理</div></div>
    <div class="content-box role">
	<div class="content-box-content">
	<div class="tab-content default-tab" id="form">
    <div>
    <table style="width:100%;" border="0" cellpadding="0" cellspacing="0">
        <tr>
            <td  style="BORDER-BOTTOM: #c1dad7 1px solid">
            <table style="width:100%;height:55px;" border="0" cellpadding="0" cellspacing="0">
            <tr>
            <td width="10%" height="55" valign="middle"><img src="images/user-info.gif" /></td>
            <td width="70%">
                <p class="left_txt2">运输车辆管理</p>
            </td>
            <td width="20%" align="right">
            <div align="center">
            <img src="images/ico_Form.gif" width="14" height="14" />&nbsp;<a href='javascript:self.location.reload();' >刷新</a>&nbsp;&nbsp;&nbsp;&nbsp;
            <img src="images/002.gif" width="14" height="14" /><A href="javascript:self.history.back();">返回</A></div>
           </td>
            </tr>
            </table>
            </td>
        </tr>
        <tr>
            <td  colspan="2">
		<script type="text/javascript">
			function check(){
				if(form1.sendTime.value=="")
				{
					alert("请输入发送时间");
					form1.sendTime.focus();
					return false;
				}
				if(form1.carFee.value==""){
					alert("请输入运输费用");
					form1.carFee.focus();
					return false;
				}
				if(isNaN(form1.carFee.value)){
					alert("运输费用含有非法字符");
					form1.carFee.focus();
					return false;
				}
				if(form1.sendCity.value==form1.receCity.value)
				{
					alert("发货城市和收货城市不能相同");
					form1.receCity.focus();
					return false;
				}
				return true;
			}
		</script>
	<form action="./TransCarServlet?action=add&currPage=1&opr=first" method="post" name="form1" onsubmit="return check();">
    	<table align="center" border="1" cellpadding="2" cellspacing="1">
    		<tr>
    			<td align="right">运输车辆：</td>
    			<td>
						<select name="carID" style="width:155px">
						<c:forEach items="${cars}" var="car">
							<option value="${car.carID }">${car.cardNo }|${car.carName }</option>
						</c:forEach>
						</select>
				</td>
    			<td><font size="2" color="red">*必填</font></td>
    		</tr>
    		<tr>
    			<td align="right">出发地：</td>
    			<td>
						<select name="sendCity" style="width:155px">
						<c:forEach items="${areas}" var="area">
							<option value="${area.areaid }">${area.areaname }</option>
						</c:forEach>
						</select>
				</td>
    			<td><font size="2" color="red">&nbsp;</font></td>
    		</tr>
    		<tr>
    			<td align="right">目的地：</td>
    			<td>
					<select name="receCity" style="width:155px">
						<c:forEach items="${areas}" var="area">
							<option value="${area.areaid }">${area.areaname }</option>
						</c:forEach>
						</select>
				</td>
    			<td><font size="2" color="red">&nbsp;</font></td>
    		</tr>
    		<tr>
    			<td align="right">司机姓名：</td>
    			<td><input type="text" name="driver" ></td>
    			<td><font size="2" color="red">&nbsp;</font></td>
    		</tr>
    		<tr>
    			<td align="right">司机电话：</td>
    			<td><input type="text" name="driverTel"></td>
    			<td><font size="2" color="red">&nbsp;</font></td>
    		</tr>
    		<tr>
    			<td align="right">跟车负责人：</td>
    			<td><input type="text" name="master"></td>
    			<td><font size="2" color="red">&nbsp;</font></td>
    		</tr>
    		<tr>
    			<td align="right">负责人电话：</td>
    			<td><input type="text" name="masterTel"></td>
    			<td><font size="2" color="red">&nbsp;</font></td>
    		</tr>
    		<tr>
    			<td align="right">运输工具：</td>
    			<td>
						<select name="sendTypeId" style="width:155px">
						<c:forEach items="${sendtypes}" var="sendtype">
							<option value="${sendtype.sendTypeId }">${sendtype.sendTypeName }</option>
						</c:forEach>							

						</select>
				</td>
    			<td><font size="2" color="red">*必填</font></td>
    		</tr>
    		<tr>
    			<td align="right">发车时间：</td>
    			<%
    				String strdate=new Date().toLocaleString();
    				int pos = strdate.indexOf(' ');
    				
    			 %>
    			<td><input type="text" name="sendTime"   id="d_sr" cssClass="easyui-datebox"/ value="<%=strdate.substring(0,pos) %>"><font size="2" color="red">格式:2008-8-8</font>
    			</td>
    			<td>&nbsp;</td>
    		</tr>
    		<tr>
    			<td align="right">运输费用：</td>
    			<td><input type="text" name="carFee" value="0"></td>
    			<td><font size="2" color="red">&nbsp;</font></td>
    		</tr>
    		<tr>
    			<td align="right">补充说明：</td>
    			<td><input type="text" name="demo" size="50"></td>
    			<td><font size="2" color="red">&nbsp;</font></td>
    		</tr>
    		<tr>
    			<td colspan="3" align="center"><input type="submit" value="  保 存 "></td>
    		</tr>
    	</table>
    </form>
            </td>
        </tr>
    </table>
  </div></div></div></div>
    <SCRIPT src="js/transform.js" type=text/javascript></SCRIPT>
</body>
</html>
