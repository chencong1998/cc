<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
    <title>新增汽车资料</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/reset.css" type="text/css"
          media="screen"/>
    <link rel="stylesheet" href="css/style.css" type="text/css"
          media="screen"/>
    <link rel="stylesheet" href="css/invalid.css" type="text/css"
          media="screen"/>
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
    <div id="maintip">
        <strong>位置：</strong>新增汽车资料
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
                                            src="images/user-info.gif"/></td>
                                    <td width="50%">
                                        <p class="left_txt2">新增汽车资料</p>
                                    </td>
                                    <td width="40%" align="right">
                                        <div align="center">
                                            <a href='javascript:self.location.reload();' class="btn btn-success"><span
                                                    class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;重置</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <A href="javascript:self.history.back();" class="btn btn-success"><span
                                                    class="glyphicon glyphicon-backward"></span>&nbsp;&nbsp;返回</A></div>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <script type="text/javascript">
                                function check() {
                                    if (form1.cardno.value == "") {
                                        layer.alert('请输入车牌号', {
                                            icon : 3,
                                            skin : 'layer-ext-moon'
                                        })
                                        form1.cardNo.focus();
                                        return false;
                                    }
                                    return true;
                                }
                            </script>
                            <form action="addCarDo"
                                  method="post" name="form1" onsubmit="return check();">
                                <center>
                                <table style="width: 300px" align="center" border="1" cellpadding="2"
                                       cellspacing="1">
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon1">车牌号：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="cardno"
                                                   class="form-control" placeholder="CardNo"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon2">车主姓名：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="carname"
                                                   class="form-control" placeholder="CarName"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon3">车辆型号：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="model"
                                                   class="form-control" placeholder="Model"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon4">公司名称：</td>
                                        <td>
                                            <select name="customerid" style="width:155px;border: none"
                                                    class="form-control">
                                                <c:forEach items="${customer}" var="customers">
                                                    <option value="${customers.customerid }">${customers.customername }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon5">车辆状态：</td>
                                        <td>
                                            <select name="status" style="width:155px;border: none" class="form-control">
                                                <option value="空闲中">空闲中</option>
                                                <option value="运货中">运货中</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon6">所属地区：</td>
                                        <td>
                                            <select name="areaid" style="width:155px;border: none" class="form-control">
                                                <c:forEach items="${areas}" var="area">
                                                    <option value="${area.areaid }">${area.areaname }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon7">联系人：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="contact"
                                                   class="form-control" placeholder="Contact"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon8">联系电话：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="mobile"
                                                   class="form-control" placeholder="Mobile"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon9">QQ号码：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="qq"
                                                   class="form-control" placeholder="QQ"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon10">邮箱地址：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="email"
                                                   class="form-control" placeholder="Email"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon11">补充说明：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="demo"
                                                   class="form-control" placeholder="Demo"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr style="border: none">
                                        <td colspan="3" align="center"><input id="btnbtn-success" class="btn btn-success" type="submit" value="  保 存 "></td>
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
