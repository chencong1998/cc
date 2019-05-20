<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
    <title>权限设置</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/reset.css" type="text/css"
          media="screen"/>
    <link rel="stylesheet" href="css/style.css" type="text/css"
          media="screen"/>
    <link rel="stylesheet" href="css/invalid.css" type="text/css"
          media="screen"/>
</head>
<body>
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip">
        <strong>位置：</strong>权限设置
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
                            <form action="getAllacc" method="post"
                                  name="form1">
                                <table border="0" align="left" cellpadding="2" cellspacing="1">
                                    <tr>
                                        <td height="30" class="STYLE1" nowrap="nowrap"
                                            style="BORDER-BOTTOM: #c1dad7 1px solid" colspan="3"
                                            align="right">用户名称：
                                            <select name="userid" style="width: 100px">
                                                <c:forEach items="${userList}" var="user">
                                                    <option value="${user.id }">${user.username }</option>
                                                </c:forEach>
                                            </select>
                                            <input type="submit" value="查看权限">
                                        </td>
                                    </tr>
                                    <script language="javascript">
                                        function selAll() {
                                            var len = form2.moduleid.length;
                                            for (var i = 0; i < len; i++) {
                                                form2.moduleid[i].checked = true;
                                            }
                                        }
                                        function unselAll() {
                                            var len = form2.moduleid.length;
                                            for (var i = 0; i < len; i++) {
                                                form2.moduleid[i].checked = false;
                                            }
                                        }

                                        function chk1state() {
                                            if (form2.chk1.checked) {
                                                selAll();
                                            } else {
                                                unselAll();
                                            }
                                        }
                                        //accid
                                        function UserselAll() {
                                            var len = form3.accid.length;
                                            for (var i = 0; i < len; i++) {
                                                form3.accid[i].checked = true;
                                            }
                                        }

                                        function UserunselAll() {
                                            var len = form3.accid.length;
                                            for (var i = 0; i < len; i++) {
                                                form3.accid[i].checked = false;
                                            }
                                        }

                                        function chk2state() {
                                            if (form3.chk2.checked) {
                                                UserselAll();
                                            } else {
                                                UserunselAll();
                                            }
                                        }
                                    </script>

                                </table>
                            </form>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <form action="./AccModuleServlet?action=add" method="post"
                                  name="form2">
                                <table align="center" width="800" cellpadding="3"
                                       cellspacing="1" border="1">
                                    <tr>
                                        <td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid"
                                            colspan="5">
                                            <h3>系&nbsp;&nbsp;统&nbsp;&nbsp;权&nbsp;&nbsp;限</h3>
                                        </td>
                                        <td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid"
                                            align="right"><input type="checkbox" name="chk1"
                                                                 value="全选" onclick="chk1state();"/>全选 用户名称： <select
                                                name="userid" style="width: 100px">
                                            <c:forEach items="${userList}" var="user">
                                                <c:if test="${userid==user.id}">
                                                    <option value="${user.id }" selected>${user.userid }</option>
                                                </c:if>
                                                <c:if test="${userid !=user.id}">
                                                    <option value="${user.id }">${user.userid }</option>
                                                </c:if>
                                            </c:forEach>
                                        </select> <input type="submit" value="授于权限"></td>
                                    </tr>
                                    <c:forEach items="${Modules}" var="module" varStatus="m">
                                        <c:if test="${m.index % 6==0}">
                                            <tr>
                                        </c:if>
                                        <td class="STYLE1" nowrap="nowrap"
                                            style="BORDER: #c1dad7 1px solid"><input
                                                type="checkbox" name="moduleid"
                                                value="${module.moduleid}"/>${module.moduleName}
                                        </td>
                                        <c:if test="${m.index % 6==5}">
                                            </tr>
                                        </c:if>
                                    </c:forEach>
                                </table>
                            </form>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <form action="./AccModuleServlet?action=del" method="post"
                                  name="form3">
                                <table align="center" width="800" cellpadding="3"
                                       cellspacing="1" border="1">
                                    <tr>
                                        <td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid"
                                            colspan="5">
                                            <h3>当&nbsp;&nbsp;前&nbsp;&nbsp;用&nbsp;&nbsp;户&nbsp;&nbsp;权&nbsp;&nbsp;限</h3>
                                        </td>
                                        <td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid"
                                            align="right"><input type="checkbox" name="chk2"
                                                                 value="全选" onclick="chk2state();"/>全选 用户名称： <select
                                                name="userid" style="width: 100px">
                                            <c:forEach items="${userList}" var="user">
                                                <c:if test="${userid==user.id}">
                                                    <option value="${user.id }" selected>${user.userid }</option>
                                                </c:if>
                                                <c:if test="${userid != user.id}">
                                                    <option value="${user.id }">${user.userid }</option>
                                                </c:if>
                                            </c:forEach>
                                        </select> <input type="submit" value="删除权限"></td>
                                    </tr>

                                    <c:forEach items="${usermod}" var="module" varStatus="m">
                                        <c:if test="${m.index % 6==0}">
                                            <tr>
                                        </c:if>
                                        <td class="STYLE1" nowrap="nowrap"
                                            style="BORDER: #c1dad7 1px solid"><input
                                                type="checkbox" name="accid" value="${module.id}"/>${module.modulename}
                                        </td>
                                        <c:if test="${m.index % 6==5}">
                                            </tr>
                                        </c:if>
                                    </c:forEach>
                                </table>
                            </form>
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
