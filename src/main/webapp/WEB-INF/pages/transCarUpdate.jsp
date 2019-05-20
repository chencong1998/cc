<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.springmvc.bean.Transcar" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
    修改运输车辆
</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/invalid.css" type="text/css" media="screen"/>

    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.0/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.3.0/themes/icon.css"/>
    <script type="text/javascript" src="js/jquery-easyui-1.3.0/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/jquery-easyui-1.3.0/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/DateFormat.js"></script>
    <!-- 引入jquery -->
    <script type="text/javascript" src="../../static/js/jquery.min.js"></script>
    <!-- 引入样式 -->
    <link href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../layer/layer.js"></script>
    <script type="text/javascript" SRC="../../js/jquery-1.7.2.js"></script>

</head>
<body style="background: #cc9999;">
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>运输车辆管理</div>
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
                                    <td width="50%">
                                        <p class="left_txt2">运输车辆管理</p>
                                    </td>
                                    <td width="40%" align="right">
                                        <div align="center">
                                            <a href='javascript:self.location.reload();' class="btn btn-success"><span
                                                    class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;重置</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <A href="javascript:self.history.back();" class="btn btn-success"><span
                                                    class="glyphicon glyphicon-backward"></span>&nbsp;&nbsp;返回</A>
                                        </div>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <script type="text/javascript">
                                function check() {
                                    if (form1.sendtime.value == "") {
                                        layer.alert('请输入发送时间', {
                                            icon : 3,
                                            skin : 'layer-ext-moon'
                                        })
                                        form1.sendtime.focus();
                                        return false;
                                    }
                                    if (form1.carfee.value == "") {
                                        layer.alert('请输入运输费用', {
                                            icon : 3,
                                            skin : 'layer-ext-moon'
                                        })
                                        form1.carfee.focus();
                                        return false;
                                    }
                                    if (isNaN(form1.carFee.value)) {
                                        layer.alert('运输费用含有非法字符', {
                                            icon : 3,
                                            skin : 'layer-ext-moon'
                                        })
                                        form1.carfee.focus();
                                        return false;
                                    }
                                    if (form1.sendcity.value == form1.rececity.value) {
                                        layer.alert('发货城市和收货城市不能相同', {
                                            icon : 3,
                                            skin : 'layer-ext-moon'
                                        })
                                        form1.rececity.focus();
                                        return false;
                                    }
                                    return true;
                                }
                            </script>
                            <form action="modifyTran" method="post"
                                  name="form1" onsubmit="return check();">
                                <input type="hidden" name="transid" value="${transcar.transid }"/>
                                <center>
                                <table style="width: 300px" align="center" border="1" cellpadding="2" cellspacing="1">
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon1">运输车辆：</td>
                                        <td>
                                            <select name="carid" style="width:155px;border: none"
                                                    class="form-control">
                                                <c:forEach items="${cars}" var="car">
                                                    <option value="${car.carid }" ${car.carid ==transcar.carid?"selected='selected'":""}>${car.cardno }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon2">出发地：</td>
                                        <td>
                                            <select name="sendcity" style="width:155px;border: none"
                                                    class="form-control">
                                                <c:forEach items="${areas}" var="area">
                                                    <option value="${area.areaid }" ${area.areaid==transcar.sendcity?"selected='selected'":""}>${area.areaname }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon3">目的地：</td>
                                        <td>
                                            <select name="rececity" style="width:155px;border: none"
                                                    class="form-control">
                                                <c:forEach items="${areas}" var="area">
                                                    <option value="${area.areaid }" ${area.areaid==transcar.rececity?"selected='selected'":""}>${area.areaname }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon6">司机姓名：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="driver"
                                                   class="form-control"
                                                   value="${transcar.driver }" aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon7">司机电话：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="driverTel"
                                                   class="form-control"
                                                   value="${transcar.drivertel }" aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon8">跟车负责人：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="master"
                                                   class="form-control"
                                                   value="${transcar.master }" aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon9">负责人电话：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="masterTel"
                                                   class="form-control"
                                                   value="${transcar.mastertel }" aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon4">运输工具：</td>
                                        <td>
                                            <select name="sendtypeid" style="width:155px;border: none"
                                                    class="form-control">
                                                <c:forEach items="${sendtypes}" var="sendtype">
                                                    <option value="${sendtype.sendtypeid }" ${sendtype.sendtypeid==transcar.sendtypeid?"selected='selected'":""}>${sendtype.sendtypename }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <%
                                        Date d = new Date();
                                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                        Transcar t = (Transcar) request.getAttribute("transcar");
                                        String d1 = simpleDateFormat.format(t.getSendtime());
                                    %>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon10">发车时间：</td>
                                        <td><input style="border: none;height: 30px" type="date" name="sendtime"
                                                   class="form-control"
                                                   value="<%=d1%>" aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon11">车辆状态：</td>
                                        <td>${transcar.carstatus }</td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon12">运输费用：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="carfee"
                                                   class="form-control"
                                                   value="${transcar.carfee }" aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon13">补充说明：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="demo"
                                                   class="form-control"
                                                   value="${transcar.demo }" aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr style="border: none">
                                        <td colspan="3" align="center"><input id="btnbtn-success"
                                                                              class="btn btn-success" type="submit"
                                                                              value="  保 存 "></td>
                                    </tr>
                                </table>
                                </center>
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
