<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
    <title>收/付款开单</title>
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
<body style="background-color:#cc9999">
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip">
        <strong>位置：</strong>收/付款开单
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
                                        <p class="left_txt2">收/付款开单</p>
                                    </td>
                                    <td width="40%" align="right">
                                        <div align="center">
                                            <a href='javascript:self.location.reload();'
                                               class="btn btn-success"><span
                                                    class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;重置</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                            <%--<img src="images/002.gif" width="14" height="14"/>--%><A
                                                href="right" class="btn btn-success"><span
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
                                                if (form1.faceFee.value == "") {
                                                    alert("请输入收/付款金额");
                                                    form1.faceFee.focus();
                                                    return false;
                                                }
                                                if (isNaN(form1.faceFee.value)) {
                                                    alert("收/付款金额含有非法字符");
                                                    form1.faceFee.focus();
                                                    return false;
                                                }
                                                if (parseInt(form1.faceFee.value) <= 0) {
                                                    alert("收付款金额必须大于0");
                                                    form1.faceFee.focus();
                                                    return false;
                                                }
                                                if (form1.paidtime.value == "") {
                                                    alert("请输入收/付款时间，格式如：2014-08-08");
                                                    form1.paidtime.focus();
                                                    return false;
                                                }
                                                return true;
                                            }
                                        </script>
                                        <form action="./BalanceServlet?action=add&currPage=1&opr=first"
                                              method="post" name="form1" onsubmit="return check();">
                                            <center>
                                            <table style="width: 300px" align="center" border="1" cellpadding="2"
                                                   cellspacing="1">
                                                <input type="hidden" name="customerid"
                                                       value="${cust.customerid }"/>
                                                <tr class="input-group" style="width: 300px;height:42px">
                                                    <td align="right" class="input-group-addon" id="basic-addon1">
                                                        客户名称：
                                                    </td>
                                                    <td>
                                                        <font size="2"
                                                              color="red">${cust.customername }&nbsp;&nbsp;&nbsp;&nbsp;联系人：${cust.contactname}&nbsp;&nbsp;&nbsp;&nbsp;电话：${cust.phone}&nbsp;&nbsp;&nbsp;&nbsp;应收金额：${cust.faceMoney }&nbsp;&nbsp;&nbsp;&nbsp;应付金额${cust.paidMoney}</font>
                                                    </td>
                                                </tr>
                                                <tr class="input-group" style="width: 300px;height:42px">
                                                    <td align="right" class="input-group-addon" id="basic-addon2">类别：
                                                    </td>
                                                    <td><select name="paidType" style="width:155px;border: none"
                                                                class="form-control">
                                                        <option value="收款">收款</option>
                                                        <option value="付款">付款</option>
                                                    </select></td>
                                                </tr>
                                                <tr class="input-group" style="width: 300px;height:42px">
                                                    <td align="right" class="input-group-addon" id="basic-addon3">
                                                        收付款金额：
                                                    </td>
                                                    <td><input style="border: none;height: 30px" type="text"
                                                               name="faceFee"
                                                               class="form-control"></td>
                                                </tr>
                                                <tr class="input-group" style="width: 300px;height:42px">
                                                    <td align="right" class="input-group-addon" id="basic-addon4">
                                                        收付款时间：
                                                    </td>
                                                    <td><input style="border: none;height: 30px" type="date"
                                                               name="paidtime"
                                                               class="form-control"></td>
                                                </tr>
                                                <tr class="input-group" style="width: 300px;height:42px">
                                                    <td align="right" class="input-group-addon" id="basic-addon5">
                                                        补充说明：
                                                    </td>
                                                    <td><input style="border: none;height: 30px" type="text" name="demo"
                                                               class="form-control"></td>
                                                </tr>
                                                <tr style="border: none">
                                                    <td colspan="3" align="center"><input id="btnbtn-success"
                                                                                          class="btn btn-success"
                                                                                          type="submit"
                                                                                          value="  收（付）款 "></td>
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
