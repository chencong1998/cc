<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
    修改密码
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
<body style="background-color:#cc9999 ">
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>修改密码</div>
</div>
<div class="content-box role">
    <div class="content-box-content">
        <div class="tab-content default-tab" id="form">
            <div align="center">
                <center>
                <table style="width:100%;" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td style="BORDER-BOTTOM: #c1dad7 1px solid">
                            <table style="width:100%;height:55px;" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td width="10%" height="55" valign="middle"><img src="images/user-info.gif"/></td>
                                    <td width="50%">
                                        <p class="left_txt2">修改密码</p>
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
                                    if (form1.oldpwd.value == "") {
                                        layer.alert('请输入旧密码', {
                                            icon : 3,
                                            skin : 'layer-ext-moon'
                                        })
                                        form1.oldpwd.focus();
                                        return false;
                                    }
                                    if (form1.password.value == "") {
                                        layer.alert('请输入新密码', {
                                            icon : 3,
                                            skin : 'layer-ext-moon'
                                        })
                                        form1.password.focus();
                                        return false;
                                    }
                                    if (form1.password.value != form1.cfgpwd.value) {
                                        layer.alert('新密码与确认密码不符', {
                                            icon : 3,
                                            skin : 'layer-ext-moon'
                                        })
                                        form1.cfgpwd.focus();
                                        return false;
                                    }
                                    return true;

                                }
                            </script>
                            <center>
                            <form action="modifyuserpwd?id=${sessionScope.users.id}" method="post" name="form1"
                                  onsubmit="return check();">
                                <table style="width: 300px" border="0" cellpadding="2" cellspacing="1">
                                    <caption>
                                        <font color="red" size="2">
                                            <%
                                                String ret = (String)request.getAttribute("ret");
                                                System.out.println("ret:"+ret);
                                                if (ret != null && ret.equals("failed")) {
                                                    out.print("旧密码错误，请确认");
                                                }
                                                if (ret != null && ret.equals("succ")) {
                                                    out.print("修改密码成功！");
                                                }

                                            %>
                                        </font>
                                    </caption>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon1">用户名称：</td>
                                        <td style="font: 32px bold"><input style="border: none;height: 30px" type="text" class="form-control"
                                                                          readonly="readonly" aria-describedby="basic-addon1" value="${sessionScope.users.username }"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon2">旧密码：</td>
                                        <td><input style="border: none;height: 30px" type="password" name="oldpwd" class="form-control" placeholder="Oldpwd"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon3">新密码：</td>
                                        <td><input style="border: none;height: 30px" type="password" name="password" class="form-control" placeholder="Newpwd"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr class="input-group" style="width: 300px;height:42px">
                                        <td align="right" class="input-group-addon" id="basic-addon4">确认密码：</td>
                                        <td><input style="border: none;height: 30px" type="password" name="cfgpwd" class="form-control" placeholder="Surepwd"
                                                   aria-describedby="basic-addon1"></td>
                                    </tr>
                                    <tr style="border: none">
                                        <td colspan="2" align="center"><input type="submit" class="btn btn-success" value="  修改  "></td>
                                    </tr>
                                </table>
                            </form>
                            </center>
                        </td>
                    </tr>
                </table>
                </center>
            </div>
        </div>
    </div>
</div>
<SCRIPT src="js/transform.js" type=text/javascript></SCRIPT>
</body>
</html>
