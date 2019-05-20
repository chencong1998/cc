<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
<title>客户账目往来统计</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/reset.css" type="text/css"
      media="screen" />
<link rel="stylesheet" href="css/style.css" type="text/css"
      media="screen" />
<link rel="stylesheet" href="css/invalid.css" type="text/css"
      media="screen" />
</head>
<body>
	<div id="maintitle">
		<div id="mainico"></div>
		<div id="maintip">
			<strong>位置：</strong>客户账目往来统计
		</div>
	</div>
	<div class="content-box role">
		<div class="content-box-content">
			<div class="tab-content default-tab" id="form">
				<div>
					<table style="width: 100%;" border="0" cellpadding="0"
						cellspacing="0">

						<tr>
							<td colspan="2">
								<form
									action="./BalanceServlet?action=statics&currPage=1&opr=first&customerid=1"
									method="post" name="form1">
									<table border="0" align="left" cellpadding="2" cellspacing="1">
										<tr>
											<td height="30" class="STYLE1" nowrap="nowrap"
												style="BORDER-BOTTOM: #c1dad7 1px solid"><div
													align="right">付款时间：</div></td>
											<td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid">
												<%
													Calendar cal = Calendar.getInstance();//获取当前时间
													int maxday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
													int nyear = cal.get(Calendar.YEAR) - 1900;
													int nmonth = cal.get(Calendar.MONTH);

													String strmin = nyear + "-" + nmonth + "-01";
													String strmax = nyear + "-" + nmonth + "-" + maxday;
													Date date1 = new Date(nyear, nmonth, 1);
													Date date2 = new Date(nyear, nmonth, maxday);
													SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
													strmin = sdf.format(date1);
													strmax = sdf.format(date2);
												%> <input type="text" name="paidtime1" size="20"
												value="<%=strmin%>" />到 <input type="text" name="paidtime2"
												size="20" value="<%=strmax%>" />
											</td>
											<td align="right"><input type="submit" value=" 搜 索 "></td>
										</tr>
										<tr>
											<td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid"
												colspan="9" align="center"><h3>客&nbsp;&nbsp;户&nbsp;&nbsp;收&nbsp;&nbsp;（付）&nbsp;&nbsp;款&nbsp;&nbsp;统&nbsp;&nbsp;计</h3></td>
										</tr>
									</table>
								</form>
							</td>
						</tr>
						<tr>
							<td colspan="2">

								<table align="center" width="800" cellpadding="3"
									cellspacing="1" border="1">
									<tr>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">客户名称</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">收(付)款类别</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">收(付)款小计</td>
									</tr>
									<c:forEach items="${bals}" var="bal">
										<tr>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${bal.customername }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${bal.paidType }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${bal.faceFee }</td>
										</tr>
									</c:forEach>
								</table>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
	<SCRIPT src="js/transform.js" type=text/javascript></SCRIPT>
</body>
</html>
