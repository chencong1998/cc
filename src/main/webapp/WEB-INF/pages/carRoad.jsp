<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ page import="com.springmvc.bean.Transcar" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
    途径路线明细
</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/invalid.css" type="text/css" media="screen"/>
    <script language="javascript" src="js/jquery-1.7.2.js"></script>
    <!-- 引入jquery -->
    <script type="text/javascript" src="static/js/jquery.min.js"></script>
    <!-- 引入样式 -->
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="layer/layer.js"></script>
</head>
<body style="background: #cc9999;">
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>途径路线明细</div>
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
                                    <td width="60%">
                                        <%
                                            Date d = new Date();
                                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                            Transcar t = (Transcar) request.getAttribute("transcar");
                                            String d1 = simpleDateFormat.format(t.getSendtime());
                                            String d2 = simpleDateFormat.format(t.getCarroad().getStarttime());
                                            String d3 = simpleDateFormat.format(t.getCarroad().getEndtime());
                                        %>
                                        <p class="left_txt2">途径路线明细:<font
                                                color="red">车牌：${transcar.car.cardno },起点站：${transcar.area1.areaname }=====>终点站：${transcar.area2.areaname }====发出时间：<%=d1%>
                                        </font>
                                        </p>
                                    </td>
                                    <td width="30%" align="right">
                                        <div align="center">
                                            <a href='javascript:self.location.reload();' class="btn btn-success"><span
                                                    class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;刷新</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <A href="javascript:history.go(-1)" class="btn btn-success"><span
                                                    class="glyphicon glyphicon-backward"></span>&nbsp;&nbsp;返回</A>
                                        </div>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <script language="javascript">
                                function check() {
                                    if (form1.startCity.value == form1.endCity.value) {
                                        layer.alert('出发站和下一站不能相同', {
                                            icon: 3,
                                            skin: 'layer-ext-moon'
                                        })
                                        form1.areaname.focus();
                                        return false;
                                    }
                                    return true;
                                }
                            </script>
                            <form action="addCarRoad" method="post" name="form1" onsubmit="return check();">

                               <%-- <input type="hidden" name="action" value="${road.action }"/>
                                <input type="hidden" name="roadid" value="${road.roadid }"/>--%>
                                <input type="hidden" name="transid" value="${transcar.carid }"/>
                                <table border="0" align="left" cellpadding="2" cellspacing="1">
                                    <tr class="input-group">
                                        <%--<td height="30" class="STYLE1" nowrap="nowrap"
                                            style="BORDER-BOTTOM: #c1dad7 1px solid">
                                            <div align="right">出发站：</div>
                                        </td>--%>
                                        <td style="height: 20px" align="right" class="input-group-addon"
                                            id="basic-addon1">出发站：${transcar.carid }
                                        </td>
                                        <td style="height: 20px">
                                            <select name="startcity" style="width:155px;border: none"
                                                    class="form-control">
                                                <c:forEach items="${areas}" var="area">
                                                    <option value="${area.areaid }" ${area.areaid==transcar.area1.areaid?"selected='selected'":""}>${area.areaname }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                        <td style="height: 20px" align="right" class="input-group-addon"
                                            id="basic-addon1">出发时间：
                                        </td>
                                        <td style="height: 20px"><input style="border: none;height: 30px" type="date"
                                                                        name="starttime"
                                                                        class="form-control"
                                                                        value="<%=d2%>" aria-describedby="basic-addon1">
                                        </td>
                                        <td style="height: 20px" align="right" class="input-group-addon"
                                            id="basic-addon1">下一站：
                                        </td>
                                        <td style="height: 20px">
                                            <select name="endcity" style="width:155px;border: none"
                                                    class="form-control">
                                                <c:forEach items="${areas}" var="area">
                                                    <option value="${area.areaid }" ${area.areaid==transcar.area2.areaid?"selected='selected'":""}>${area.areaname }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                        <td style="height: 20px" align="right" class="input-group-addon"
                                            id="basic-addon1">到达时间：
                                        </td>
                                        <td style="height: 20px"><input style="border: none;height: 30px" type="date"
                                                                        name="endtime"
                                                                        class="form-control"
                                                                        value="<%=d3%>" aria-describedby="basic-addon1">
                                        </td>
                                        <td align="center"><input style="margin-top: -30px" id="btnbtn-success"
                                                                  class="btn btn-success"
                                                                  type="submit" value=" 保 存 "></td>
                                    </tr>
                                    <tr>
                                        <td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid" colspan="9"
                                            align="center"><h3>途&nbsp;&nbsp;径&nbsp;&nbsp;路&nbsp;&nbsp;线&nbsp;&nbsp;明&nbsp;&nbsp;细</h3>
                                        </td>
                                    </tr>
                                </table>
                            </form>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <table border="0" align="left" cellpadding="2" cellspacing="1">
                                <tr style="font: 16px bold">
                                    <td height="30" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                                        <div align="center">出发站</div>
                                    </td>
                                    <td class="STYLE1" style="BORDER: #c1dad7 1px solid">
                                        <div align="center">出发时间</div>
                                    </td>
                                    <td class="STYLE1" style="BORDER: #c1dad7 1px solid">
                                        <div align="center">下一站</div>
                                    </td>
                                    <td class="STYLE1" style="BORDER: #c1dad7 1px solid">
                                        <div align="center">到达时间</div>
                                    </td>
                                    <td class="STYLE1" style="BORDER: #c1dad7 1px solid">
                                        <div align="center">操作</div>
                                    </td>
                                </tr>
                                <tr>
                                    <td height="30" class="STYLE1" nowrap="nowrap"
                                        style="BORDER: #c1dad7 1px solid">
                                        <div align="center">${transcar.area1.areaname }</div>
                                    </td>
                                    <td class="STYLE1" style="BORDER: #c1dad7 1px solid">
                                        <div align="center"><%=d2%></div>
                                    </td>
                                    <td class="STYLE1" style="BORDER: #c1dad7 1px solid">
                                        <div align="center">${transcar.area2.areaname }</div>
                                    </td>
                                    <td class="STYLE1" style="BORDER: #c1dad7 1px solid">
                                        <div align="center"><%=d3%></div>
                                    </td>
                                    <td class="STYLE1" style="BORDER: #c1dad7 1px solid">
                                        <div align="center">
                                            <a class="btn btn-warning btn-sm" href="./CarRoadServlet?action=update&roadid=${roads.roadid }">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <a class="btn btn-danger btn-sm" href="./CarRoadServlet?action=del&roadid=${roads.roadid}"
                                               onclick="return confirm('删除确认')">删除</a>
                                    </td>
                                </tr>
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
