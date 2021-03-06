<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
    修改用户
</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="../../css/reset.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="../../css/style.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="../../css/invalid.css" type="text/css" media="screen"/>
    <!-- 引入jquery -->
    <script type="text/javascript" src="../../static/js/jquery.min.js"></script>
    <!-- 引入样式 -->
    <link href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../layer/layer.js"></script>
    <script type="text/javascript" SRC="../../js/jquery-1.7.2.js"></script>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
</head>
<body style="background: #cc9999;" id="body">
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>修改用户</div>
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
                                    <td width="10%" height="55" valign="middle"><img src="../../images/user-info.gif"/>
                                    </td>
                                    <td width="50%">
                                        <p class="left_txt2">修改用户</p>
                                    </td>
                                    <td width="40%" align="right">
                                        <div align="center">
                                            <a href='javascript:self.location.reload();' class="btn btn-success"><span
                                                    class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;刷新</a>&nbsp;&nbsp;&nbsp;&nbsp;
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
                                $(function () {
                                    $("#body").mousemove(function () {
                                        //发送ajax请求校验用户名是否可用
                                        var username = document.getElementById("x").value;
                                        var usernameyz = document.getElementById("ajyz").value;
                                        $.ajax({
                                            url: "${APP_PATH}/checkUseraa/",
                                            data: {"username": username},
                                            type: "post",
                                            success: function (result) {
                                                if (result.code == 200) {
                                                    if (result.extend.nameyz == usernameyz) {
                                                        $("#i11").text("");
                                                        $("#btnbtn-success").removeAttr("disabled");
                                                    } else {
                                                        $("#i11").text("用户名已存在");
                                                        $("#i11").css("color", "red");
                                                        $("#btnbtn-success").attr("disabled", "disabled");
                                                    }
                                                } else {
                                                    $("#i11").text(result.extend.va_msg);
                                                    $("#i11").css("color", "green");
                                                    $("#btnbtn-success").removeAttr("disabled");
                                                }
                                            }
                                        });
                                    });
                                    /*function check(){
                                        if(form1.username.value==""){
                                            layer.alert('请输入用户名', {
                                                icon : 3,
                                                skin : 'layer-ext-moon'
                                            })
                                            form1.username.focus();
                                            return false;
                                        }
                                        return true;
                                    }*/
                                });
                            </script>
                            <form action="${APP_PATH}/modifyUser" method="post" name="form1" onsubmit="return check();">
                                <input type="hidden" name="id" value="${user.id }"/>
                                <input type="hidden" id="ajyz" value="${user.username}"/>
                                <center>
                                    <span id="i11" style="font: 16px bold;"></span>
                                    <table align="center" border="1" cellpadding="2" cellspacing="1"
                                           style="width: 300px">
                                        <tr class="input-group" style="width: 300px;height:42px">
                                            <td align="right" class="input-group-addon" id="basic-addon1">用户名称：</td>
                                            <td><input value="${user.username}" style="border: none;height: 30px"
                                                       type="text" id="x" name="username" class="form-control"
                                                       placeholder="Username"
                                                       aria-describedby="basic-addon1"></td>
                                        </tr>
                                        <tr class="input-group" style="width: 300px;height:42px">
                                            <td align="right" class="input-group-addon" id="basic-addon4">用户区域：</td>
                                            <td>
                                                <select name="areaid" style="width:155px;border: none"
                                                        class="form-control">
                                                    <c:forEach items="${areas}" var="area">
                                                        <option value="${area.areaid }" ${area.areaid==user.areaid?"selected='selected'":""}>${area.areaname }</option>
                                                    </c:forEach>
                                                </select>
                                            </td>
                                        </tr>
                                        <tr class="input-group" style="width: 300px;height:42px">
                                            <td align="right" class="input-group-addon" id="basic-addon5">部门名称：</td>
                                            <td><input style="border: none;height: 30px" type="text" name="depname"
                                                       class="form-control"
                                                       value="${user.depname }" aria-describedby="basic-addon1"></td>
                                        </tr>
                                        <tr class="input-group" style="width: 300px;height:42px">
                                            <td align="right" class="input-group-addon" id="basic-addon6">工作岗位：</td>
                                            <td><input style="border: none;height: 30px" value="${user.degree }"
                                                       type="text" name="degree" class="form-control"
                                                       aria-describedby="basic-addon1"></td>
                                        </tr>
                                        <tr class="input-group" style="width: 300px;height:42px">
                                            <td align="right" class="input-group-addon" id="basic-addon7">联系电话：</td>
                                            <td><input style="border: none;height: 30px" value="${user.mobile }"
                                                       type="text" name="mobile" class="form-control"
                                                       aria-describedby="basic-addon1"></td>
                                        </tr>
                                        <tr class="input-group" style="width: 300px;height:42px">
                                            <td align="right" class="input-group-addon" id="basic-addon8">通讯地址：</td>
                                            <td><input style="border: none;height: 30px" value="${user.addr }"
                                                       type="text" name="addr" class="form-control"
                                                       aria-describedby="basic-addon1"></td>
                                        </tr>
                                        <tr class="input-group" style="width: 300px;height:42px">
                                            <td align="right" class="input-group-addon" id="basic-addon9">公司名称：</td>
                                            <td><input style="border: none;height: 30px" value="${user.companyname }"
                                                       type="text" name="companyname" class="form-control"
                                                       aria-describedby="basic-addon1"></td>
                                        </tr>
                                        <tr class="input-group" style="width: 300px;height:42px">
                                            <td align="right" class="input-group-addon" id="basic-addon10">其他说明：</td>
                                            <td>
                                                <textarea class="form-control" rows="1" cols="80"
                                                          name="demo">${user.demo }</textarea>
                                            </td>
                                        </tr>
                                        <tr style="border: none">
                                            <td colspan="3" align="center"><input id="btnbtn-success"
                                                                                  class="btn btn-success" type="submit"
                                                                                  value="  修 改 "></td>
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
