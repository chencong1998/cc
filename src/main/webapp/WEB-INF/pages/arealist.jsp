<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
<title>区域资料列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="../../css/reset.css" type="text/css"
      media="screen" />
<link rel="stylesheet" href="../../css/style.css" type="text/css"
      media="screen" />
<link rel="stylesheet" href="../../css/invalid.css" type="text/css"
      media="screen" />
</head>
<body>
	<div id="maintitle">
		<div id="mainico"></div>
		<div id="maintip">
			<strong>位置：</strong>区域资料列表
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
												区域资料列表&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red">${delErrror }</font>
											</p>
										</td>
										<td width="20%" align="right">
											<div align="center">
												<img src="images/ico_Form.gif" width="14" height="14" />&nbsp;<a
													href='areaAdd.jsp'>新增</a>&nbsp;&nbsp;&nbsp;&nbsp; <img
                                                    src="images/ico_Form.gif" width="14" height="14" />&nbsp;<a
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
								href="./AreaServlet?action=list&currPage=1&opr=first">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./AreaServlet?action=list&currPage=${pages.currPage }&opr=prev">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./AreaServlet?action=list&currPage=${pages.currPage }&opr=next">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./AreaServlet?action=list&currPage=${pages.pageCount }&opr=last">末页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								第${pages.currPage }页&nbsp;&nbsp;&nbsp;&nbsp; 共${pages.pageCount }页&nbsp;&nbsp;&nbsp;&nbsp;
								共${pages.rowCount }个区域&nbsp;&nbsp;&nbsp;&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2">

								<table width="70%" border="0" align="left" cellpadding="2"
									cellspacing="1">
									<tr>
										<td width="130" height="30" class="STYLE1" nowrap="nowrap"
											style="BORDER: #c1dad7 1px solid"><div align="center">区域编号</div></td>
										<td class="STYLE1" style="BORDER: #c1dad7 1px solid"><div
												align="center">区域名称</div></td>
										<td class="STYLE1" style="BORDER: #c1dad7 1px solid"><div
												align="center">操作</div></td>
									</tr>
									<c:forEach items="${areas}" var="area">
										<tr>
											<td width="130" height="30" class="STYLE1" nowrap="nowrap"
												style="BORDER: #c1dad7 1px solid"><div align="center">${area.areaid }</div></td>
											<td class="STYLE1" style="BORDER: #c1dad7 1px solid"><div
													align="center">${area.areaname}</div></td>
											<td class="STYLE1" style="BORDER: #c1dad7 1px solid"><div
													align="center">
													<a
														href="./AreaServlet?action=update&areaid=${area.areaid }">修改</a>&nbsp;&nbsp;
													<a
														href="./AreaServlet?action=del&areaid=${area.areaid }&currPage=1&opr=first"
														onclick="return confirm('删除确认')">删除</a>&nbsp;&nbsp;

												</div></td>
										</tr>
									</c:forEach>
								</table>
							</td>
						</tr>
						<tr>
							<td colspan="2"><a
								href="./AreaServlet?action=list&currPage=1&opr=first">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./AreaServlet?action=list&currPage=${pages.currPage }&opr=prev">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./AreaServlet?action=list&currPage=${pages.currPage }&opr=next">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								<a
								href="./AreaServlet?action=list&currPage=${pages.pageCount }&opr=last">末页</a>&nbsp;&nbsp;&nbsp;&nbsp;
								第${pages.currPage }页&nbsp;&nbsp;&nbsp;&nbsp; 共${pages.pageCount }页&nbsp;&nbsp;&nbsp;&nbsp;
								共${pages.rowCount }个区域&nbsp;&nbsp;&nbsp;&nbsp;</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
	<SCRIPT src="js/transform.js" type=text/javascript></SCRIPT>
</body>
</html>
