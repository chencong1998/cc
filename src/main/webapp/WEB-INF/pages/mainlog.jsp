<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
<style type="text/css">
	#maintitle{height:29px;line-height:29px;background:url(pics/maintitle.jpg) repeat-x;}
	#mainico{height:15px; width:16px; background:url(pics/daohang.jpg) no-repeat;float:left;margin-top:7px;margin-left:10px;}
	#maintip{height:29px;line-height:32px;float:left;margin-left:10px;color:#386487;font-size:12px}
	.content-box{
	margin-bottom:20px;
	background: #eef9ff;
	}
	.content-box-content{
	padding:10px;
	font-size: 12px;
	}
	.searchgrid{padding:2px 5px; clear:both; color:#1D3E83; background:#DBE3FF; border:1px solid #CAD8E5;line-height: 29px;}
	.searchgrid form input,.searchgrid form select,.searchgrid form label{  display:inline} 
	.searchgrid form label{ padding-left:5px;} 
	.box_main,.notification,.department,.post,.role,.userct,.pswd,.trade,.circum,.proprietor,.area,.business,.bracket,.community,.treaty,.gift,.adsite,.idle_adsite,.apply,.apply_ing,.client,.care,.pact,.pastpact,.task,.yettask,.pt,.notice,.staff,.addressbook{ display:one;}
</style>
  </head>
  
  <body>
		     <div id="maintitle"><div id="mainico"></div>
		    <div id="maintip"><strong>位置：</strong>添加修改客户资料</div></div>
		    <div class="content-box role">
			<div class="content-box-content">
        		<img src="images/map.jpg"/>
        	  </div></div>
  </body>
</html>
