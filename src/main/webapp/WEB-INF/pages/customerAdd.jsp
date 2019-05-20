<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
    新增客户资料
</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/invalid.css" type="text/css" media="screen"/>
    <!-- 引入jquery -->
    <script type="text/javascript" src="../../static/js/jquery.min.js"></script>
    <!-- 引入样式 -->
    <link href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../layer/layer.js"></script>
    <script type="text/javascript" SRC="../../js/jquery-1.7.2.js"></script>
</head>
<body style="background-color: #cc9999">
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>新增客户资料</div>
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
                                        <p class="left_txt2">新增客户资料</p>
                                    </td>
                                    <td width="40%" align="right">
                                        <div>
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
                                    if (form1.customername.value == "") {
                                        layer.alert('请输入客户名称', {
                                            icon: 3,
                                            skin: 'layer-ext-moon'
                                        })
                                        form1.customername.focus();
                                        return false;
                                    }
                                    if (form1.facemoney.value == "") {
                                        layer.alert('应收账款不能为空', {
                                            icon: 3,
                                            skin: 'layer-ext-moon'
                                        })
                                        form1.facemoney.focus();
                                        return false;
                                    }
                                    if (isNaN(form1.facemoney.value)) {
                                        layer.alert('应收账款含有非法字符', {
                                            icon: 3,
                                            skin: 'layer-ext-moon'
                                        })
                                        form1.facemoney.focus();
                                        return false;
                                    }
                                    if (form1.paidmoney.value == "") {
                                        layer.alert('应付账款不能为空', {
                                            icon: 3,
                                            skin: 'layer-ext-moon'
                                        })
                                        form1.paidmoney.focus();
                                        return false;
                                    }
                                    if (isNaN(form1.paidmoney.value)) {
                                        layer.alert('应付账款含有非法字符', {
                                            icon: 3,
                                            skin: 'layer-ext-moon'
                                        })
                                        form1.paidmoney.focus();
                                        return false;
                                    }
                                    return true;
                                }
                            </script>
                            <CENTER>
                            <form action="addCusDo" method="post" name="form1"
                                  onsubmit="return check();">
                                <table align="center" border="1" cellpadding="2" cellspacing="1" style="width: 300px">
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon1">客户名称：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="customername" class="form-control" placeholder="Customername"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon2">联系人：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="contactname" class="form-control" placeholder="Contactname"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon3">联系电话：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="phone" class="form-control" placeholder="Phone"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon4">客户类型：</td>
                                        <td>
                                            <select name="customertypeid" style="width:155px;border: none"
                                                    class="form-control">
                                                <c:forEach items="${custtypes}" var="custtype">
                                                    <option value="${custtype.customertypeid }" ${custtype.customertypeid==cust.customertypeid?"selected='selected'":""}>${custtype.customertypename }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon5">结算方式：</td>
                                        <td>
                                            <select name="paidid" style="width:155px;border: none" class="form-control">
                                                <c:forEach items="${paidtypes}" var="paidtype">
                                                    <option value="${paidtype.paidid }" ${paidtype.paidid==cust.paidid?"selected='selected'":""}>${paidtype.paidname }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon6">用户区域：</td>
                                        <td>
                                            <select name="areaid" style="width:155px;border: none" class="form-control">
                                                <c:forEach items="${areas}" var="area">
                                                    <option value="${area.areaid }" ${area.areaid==user.areaid?"selected='selected'":""}>${area.areaname }</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon7">应收账款：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="factmoney" class="form-control" placeholder="FaceMoney"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon8">应付账款：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="paidmoney" class="form-control" placeholder="PaidMoney"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon9">通讯地址：</td>
                                        <td><input style="border: none;height: 30px" type="text" name="addr" class="form-control" placeholder="Addr"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr style="border: none">
                                        <td colspan="3" align="center"><input id="btnbtn-success"
                                                                              class="btn btn-success" type="submit"
                                                                              value="  保 存 "></td>
                                    </tr>
                                </table>
                            </form>
                            </CENTER>
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
