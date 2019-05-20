<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
	订单状态设置
</title><meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/invalid.css" type="text/css" media="screen" />	
</head>
<body>
     <div id="maintitle"><div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>订单状态设置</div></div>
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
                <p class="left_txt2">订单状态设置</p>
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
            <script language="javascript">
            	function check(){
            		if(form1.ordername.value=="")
            		{
            			alert("请输入订单状态名称");
            			form1.ordername.focus();
            			return false;
            		}
            		return true;
            	}
            </script>
            <form action="./OrderStatusServlet?action=add&currPage=1&opr=first" method="post" name="form1" onsubmit="return check();">
            <table width="70%" border="0" align="left" cellpadding="2" cellspacing="1" >
			  <tr>
			    <td width="130" height="30" class="STYLE1" nowrap="nowrap" style="BORDER-BOTTOM: #c1dad7 1px solid"><div align="right">订单状态名称：</div></td>
			    <td class="STYLE1"  style="BORDER-BOTTOM: #c1dad7 1px solid"><input type="text" name="ordername"></td>
			  </tr>
			   <tr>
			    <td width="130" height="30" class="STYLE1" nowrap="nowrap" style="BORDER-BOTTOM: #c1dad7 1px solid"><div align="right">&nbsp;</div></td>
			    <td class="STYLE1"  style="BORDER-BOTTOM: #c1dad7 1px solid"><input type="submit" value=" 保 存 "></td>
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
