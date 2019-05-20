<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
    用户资料列表
</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/invalid.css" type="text/css" media="screen"/>
    <script language="javascript" src="../../js/jquery-1.7.2.js"></script>
    <!-- 引入jquery -->
    <script type="text/javascript" src="../../static/js/jquery.min.js"></script>
    <!-- 引入样式 -->
    <link href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../layer/layer.js"></script>
</head>
<body>
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>用户资料列表</div>
</div>
<div class="content-box role">
    <div class="content-box-content">
        <div class="tab-content default-tab" id="form">
            <div>
                <table style="width:100%;" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td style="BORDER-BOTTOM: #c1dad7 1px solid">
                            <table style="width:100%;height:55px;" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td width="10%" height="55" valign="middle"><img src="images/user-info.gif"/></td>
                                    <td width="70%">
                                        <p class="left_txt2">用户资料列表</p>
                                    </td>
                                    <td width="20%" align="right">
                                        <div align="center">
                                            <img src="images/ico_Form.gif" width="14" height="14"/>&nbsp;<a
                                                href='./UserServlet?action=init'>新增</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <img src="images/ico_Form.gif" width="14" height="14"/>&nbsp;<a
                                                href='javascript:self.location.reload();'>刷新</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <img src="images/002.gif" width="14" height="14"/><A
                                                href="javascript:self.history.back();">返回</A></div>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <a href="./UserServlet?action=list&currPage=1&opr=first">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="./UserServlet?action=list&currPage=${pages.currPage }&opr=prev">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="./UserServlet?action=list&currPage=${pages.currPage }&opr=next">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="./UserServlet?action=list&currPage=${pages.pageCount }&opr=last">末页</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            第${pages.currPage }页&nbsp;&nbsp;&nbsp;&nbsp;
                            共${pages.pageCount }页&nbsp;&nbsp;&nbsp;&nbsp;
                            共${pages.rowCount }个用户&nbsp;&nbsp;&nbsp;&nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">

                            <table align="center" width="800" cellpadding="3" cellspacing="1" border="1">
                                <tr>
                                    <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                                        用户名称
                                    </td>
                                    <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                                        部门名称
                                    </td>
                                    <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                                        工作岗位
                                    </td>
                                    <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                                        联系电话
                                    </td>
                                    <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                                        状态
                                    </td>
                                    <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                                        公司名称
                                    </td>
                                    <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                                        操作
                                    </td>
                                </tr>
                                <c:forEach items="${users}" var="user">
                                    <tr>
                                        <td class="STYLE1" nowrap="nowrap"
                                            style="BORDER: #c1dad7 1px solid">${user.userid }</td>
                                        <td class="STYLE1" nowrap="nowrap"
                                            style="BORDER: #c1dad7 1px solid">${user.depname }</td>
                                        <td class="STYLE1" nowrap="nowrap"
                                            style="BORDER: #c1dad7 1px solid">${user.degree }</td>
                                        <td class="STYLE1" nowrap="nowrap"
                                            style="BORDER: #c1dad7 1px solid">${user.mobile }</td>
                                        <td class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                                            <c:if test="${user.status==1}">启用</c:if>
                                            <c:if test="${user.status==0}">禁用</c:if>
                                        </td>
                                        <td class="STYLE1" nowrap="nowrap"
                                            style="BORDER: #c1dad7 1px solid">${user.companyname }</td>
                                        <td class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid"
                                            align="center">
                                            <a href="./UserServlet?action=update&id=${user.id }">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <a href="./UserServlet?action=del&currPage=1&opr=first&id=${user.id }"
                                               onclick="return confirm('删除确认')">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <a href="./UserServlet?action=status&currPage=1&opr=first&id=${user.id }&status=${user.status }">&nbsp;&nbsp;&nbsp;&nbsp;
                                                <c:if test="${user.status==1}">禁用</c:if>
                                                <c:if test="${user.status==0}">启用</c:if>
                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <a href="./UserServlet?action=list&currPage=1&opr=first">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="./UserServlet?action=list&currPage=${pages.currPage }&opr=prev">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="./UserServlet?action=list&currPage=${pages.currPage }&opr=next">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="./UserServlet?action=list&currPage=${pages.pageCount }&opr=last">末页</a>&nbsp;&nbsp;&nbsp;&nbsp;
                            第${pages.currPage }页&nbsp;&nbsp;&nbsp;&nbsp;
                            共${pages.pageCount }页&nbsp;&nbsp;&nbsp;&nbsp;
                            共${pages.rowCount }个用户&nbsp;&nbsp;&nbsp;&nbsp;
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
