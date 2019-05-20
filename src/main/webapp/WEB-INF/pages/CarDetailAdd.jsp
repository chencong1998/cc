<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
<title>订单管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/reset.css" type="text/css"
      media="screen" />
<link rel="stylesheet" href="css/style.css" type="text/css"
      media="screen" />
<link rel="stylesheet" href="css/invalid.css" type="text/css"
      media="screen" />

<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.3.0/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.3.0/themes/icon.css" />
<script type="text/javascript"
	src="js/jquery-easyui-1.3.0/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.3.0/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/DateFormat.js"></script>

</head>
<body>
	<div id="maintitle">
		<div id="mainico"></div>
		<div id="maintip">
			<strong>位置：</strong>订单管理
		</div>
	</div>
	<div class="content-box role">
		<div class="content-box-content">
			<div class="tab-content default-tab" id="form">
				<div>
					<table style="width: 100%;" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td style="BORDER: #c1dad7 1px solid">
								<table style="width: 100%; height: 55px;" border="0"
									cellpadding="0" cellspacing="0">
									<tr>
										<td width="10%" height="55" valign="middle"><img
											src="images/user-info.gif" /></td>
										<td width="70%">
											<p class="left_txt2">订单管理</p>
										</td>
										<td width="20%" align="right">
											<div align="center">
												<img src="images/ico_Form.gif" width="14" height="14" />&nbsp;<a
													href='javascript:self.location.reload();'>刷新</a>&nbsp;&nbsp;&nbsp;&nbsp;
												<img src="images/002.gif" width="14" height="14" /><A
													href="javascript:self.history.back();">返回</A>
											</div>
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td colspan="2"><script type="text/javascript">
								function check() {
									if (form1.detailID.value == "") {
										alert("请输入订单号");
										form1.detailID.focus();
										return false;
									}
									if (form1.sendCustID.value == form1.receCustID.value) {
										alert("发货单位不能和收货单位相同");
										form1.receCustID.focus();
										return false;
									}
									if (form1.sendCity.value == form1.receCity.value) {
										alert("发货城市和收货城市不能相同");
										form1.receCity.focus();
										return false;
									}
									if (form1.sendTime.value == "") {
										alert("请输入发送时间");
										form1.sendTime.focus();
										return false;
									}
									if (form1.goodsname.value == "") {
										alert("请输入货物名称");
										form1.goodsname.focus();
										return false;
									}
									if (form1.gcount.value == "") {
										alert("货号或件数不能为空");
										form1.gcount.focus();
										return false;
									}
									if (isNaN(form1.gcount.value)) {
										alert("货号或件数只能为0~9之间的数字");
										form1.gcount.focus();
										return false;
									}
									if (form1.sendFee.value == "") {
										alert("请输入运输费用");
										form1.sendFee.focus();
										return false;
									}
									if (isNaN(form1.sendFee.value)) {
										alert("运输费用含有非法字符");
										form1.sendFee.focus();
										return false;
									}

									if (form1.insuranceFee.value == "") {
										alert("请输入保险费用");
										form1.insuranceFee.focus();
										return false;
									}
									if (isNaN(form1.insuranceFee.value)) {
										alert("保险费用只能为0~9之间的数字");
										form1.insuranceFee.focus();
										return false;
									}
									if (form1.otherFee.value == "") {
										alert("请输入其他费用");
										form1.otherFee.focus();
										return false;
									}
									if (isNaN(form1.otherFee.value)) {
										alert("费用只能为0~9之间的数字");
										form1.otherFee.focus();
										return false;
									}

									return true;
								}
							</script>
								<form
									action="./CarDetailServlet?action=add&currPage=1&opr=first"
									method="post" name="form1" onsubmit="return check();">
									<table align="center" border="1" cellpadding="2"
										cellspacing="1">
										<tr>
											<td align="right">订单号：</td>
											<td><input type="text" name="detailID"></td>
											<td align="right">托运日期：</td>
											<%
												String strdate = new Date().toLocaleString();
												int pos = strdate.indexOf(' ');
											%>
											<td><input type="text" name="sendTime" id="d_sr"
												cssClass="easyui-datebox"
												value="<%=strdate.substring(0, pos)%>"><font
													size="2" color="red">格式:2008-8-8</font></td>
											<td align="right">运输车辆：</td>
											<td><select name="transID" style="width: 330px">
													<c:forEach items="${transCars}" var="car">
														<option value="${car.transId }">${car.cardno }，${car.sendTime }==${car.sendname }--->${car.recename }</option>
													</c:forEach>
											</select></td>
										</tr>
										<tr>
											<td align="right">发货单位：</td>
											<td><select name="sendCustID" style="width: 255px">
													<c:forEach items="${custs}" var="custs">
														<option value="${custs.customerid }">${custs.customername }|${custs.contactname }|${custs.phone }</option>
													</c:forEach>
											</select></td>
											<td align="right">发货城市：</td>
											<td><select name="sendCity" style="width: 155px">
													<c:forEach items="${areas}" var="area">
														<option value="${area.areaid }">${area.areaname }</option>
													</c:forEach>
											</select></td>
											<td align="right">起止地：</td>
											<td><input type="text" name="startAddr" size="50"></td>
										</tr>
										<tr>
											<td align="right">收货单位：</td>
											<td><select name="receCustID" style="width: 255px">
													<c:forEach items="${custs}" var="custs">
														<option value="${custs.customerid }">${custs.customername }|${custs.contactname }|${custs.phone }</option>
													</c:forEach>
											</select></td>
											<td align="right">收货城市：</td>
											<td><select name="receCity" style="width: 155px">
													<c:forEach items="${areas}" var="area">
														<option value="${area.areaid }">${area.areaname }</option>
													</c:forEach>
											</select></td>
											<td align="right">收货地址：</td>
											<td><input type="text" name="endAddr" size="50"></td>
										</tr>
										<tr>
											<td align="right">收货人：</td>
											<td><input type="text" name="recePerson"></td>
											<td align="right">电话：</td>
											<td><input type="text" name="phone"></td>
											<td align="right">随货通行：</td>
											<td><input type="text" name="sendGoods" size="50"></td>
										</tr>
										<tr>
											<td colspan="6" align="center"><h3>订&nbsp;&nbsp;单&nbsp;&nbsp;明&nbsp;&nbsp;细</h3></td>
										</tr>
										<tr>
											<td colspan="6">
												<table align="center" border="1" cellpadding="0"
													cellspacing="0" width="100%">
													<tr>
														<td style="BORDER: #c1dad7 1px solid" align="center">货物名称</td>
														<td style="BORDER: #c1dad7 1px solid" align="center">包装</td>
														<td style="BORDER: #c1dad7 1px solid" align="center">货号/件数</td>
														<td style="BORDER: #c1dad7 1px solid" align="center">运费</td>
														<td style="BORDER: #c1dad7 1px solid" align="center">保险3%<sub>0</sub></td>
														<td style="BORDER: #c1dad7 1px solid" align="center">其他费用</td>
														<td style="BORDER: #c1dad7 1px solid" align="center">结算方式</td>
													</tr>
													<tr>
														<td style="BORDER: #c1dad7 1px solid"><input
															type="text" name="goodsname"></td>
														<td style="BORDER: #c1dad7 1px solid"><input
															type="text" name="unitName" size="10"></td>
														<td style="BORDER: #c1dad7 1px solid"><input
															type="text" name="gcount" size="10" value="0"></td>
														<td style="BORDER: #c1dad7 1px solid"><input
															type="text" name="sendFee" size="10" value="0"></td>
														<td style="BORDER: #c1dad7 1px solid"><input
															type="text" name="insuranceFee" size="10" value="0"></td>
														<td style="BORDER: #c1dad7 1px solid"><input
															type="text" name="otherFee" size="10" value="0"></td>
														<td style="BORDER: #c1dad7 1px solid"><select
															name="paidid" style="width: 155px">
																<c:forEach items="${paidtypes}" var="paidtype">
																	<option value="${paidtype.paidid }">${paidtype.paidName }</option>
																</c:forEach>
														</select></td>
													</tr>
												</table>
											</td>
										</tr>
										<tr>
											<td align="right">补充说明：</td>
											<td colspan="5"><input type="text" name="demo"
												size="100"></td>

										</tr>
										<tr>
											<td colspan="6" align="center"><input type="submit"
												value="  保 存 "></td>
										</tr>
									</table>
								</form></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
	<SCRIPT src="js/transform.js" type=text/javascript></SCRIPT>
</body>
</html>
