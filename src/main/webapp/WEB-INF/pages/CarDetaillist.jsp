<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
<title>订单明细列表</title>
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
			<strong>位置：</strong>订单明细列表
		</div>
	</div>
	<div class="content-box role">
		<div class="content-box-content">
			<div class="tab-content default-tab" id="form">
				<div>
					<table style="width: 100%;" border="0" cellpadding="0"
						cellspacing="0">
						<tr>
							<td style="BORDER-BOTTOM: #c1dad7 1px solid">
								<table style="width: 100%; height: 55px;" border="0"
									cellpadding="0" cellspacing="0">
									<tr>
										<td width="10%" height="55" valign="middle"><img
											src="images/user-info.gif" /></td>
										<td width="70%">
											<p class="left_txt2">
												订单明细列表&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red">${delErrror }
											</p>
										</td>
										<td width="20%" align="right">
											<div align="center">
												<img src="images/ico_Form.gif" width="14" height="14" />&nbsp;<a
													href='./CarDetailServlet?action=init'>新增</a>&nbsp;&nbsp;&nbsp;&nbsp;
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
							<td colspan="2"><a
								href="./CarDetailServlet?action=list&currPage=1&opr=first">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./CarDetailServlet?action=list&currPage=${pages.currPage }&opr=prev">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./CarDetailServlet?action=list&currPage=${pages.currPage }&opr=next">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./CarDetailServlet?action=list&currPage=${pages.pageCount }&opr=last">末页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								第${pages.currPage }页&nbsp;&nbsp;&nbsp;&nbsp; 共${pages.pageCount }页&nbsp;&nbsp;&nbsp;&nbsp;
								共${pages.rowCount }笔订单&nbsp;&nbsp;&nbsp;&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2">

								<table align="center" width="800" cellpadding="3"
									cellspacing="1" border="1">
									<tr>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">订单号</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">托运日期</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">车牌号</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">发货单位</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">收货单位</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">货物名称</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">包装</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">件数</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">运输费</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">保险费</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">其他费</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">出发地</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">目的地</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">是否发货</td>
										<td align="center" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid">操作</td>
									</tr>
									<c:forEach items="${carDetail}" var="car">
										<tr>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.detailID }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.sendTime }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.cardno }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.sendcustname }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.rececustname }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.goodsname}</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.unitName }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.gcount }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.sendFee }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.insuranceFee }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.otherFee }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.sendcityname }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.rececityname }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid">${car.orderid }</td>
											<td class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid" align="center"><a
												href="./CarDetailServlet?action=update&detailID=${car.detailID }">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
												<a
												href="./CarDetailServlet?action=del&currPage=1&opr=first&detailID=${car.detailID }"
												onclick="return confirm('删除确认')">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;
											</td>
										</tr>
									</c:forEach>
								</table>
							</td>
						</tr>
						<tr>
							<td colspan="2"><a
								href="./CarDetailServlet?action=list&currPage=1&opr=first">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./CarDetailServlet?action=list&currPage=${pages.currPage }&opr=prev">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./CarDetailServlet?action=list&currPage=${pages.currPage }&opr=next">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./CarDetailServlet?action=list&currPage=${pages.pageCount }&opr=last">末页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								第${pages.currPage }页&nbsp;&nbsp;&nbsp;&nbsp; 共${pages.pageCount }页&nbsp;&nbsp;&nbsp;&nbsp;
								共${pages.rowCount }笔订单&nbsp;&nbsp;&nbsp;&nbsp;</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
	<SCRIPT src="js/transform.js" type=text/javascript></SCRIPT>
</body>
</html>
