<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@page import="java.net.URLDecoder" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" >
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>系统登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link media="screen" href="../../css/login.css" type="text/css"
          rel="stylesheet"/>
    <style type="text/css">
        .input-val {
            float: left;
            width: 60px;
            background: #ffffff;
            height: 2.7rem;
            padding: 0 2%;
            border-radius: 5px;
            border: none;
            border: 1px solid rgba(0, 0, 0, .2);
            font-size: 14px;
            margin-right: 10px;
        }

        #canvas {
            float: left;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
    <script language="javascript" src="<%=basePath %>js/jquery-1.7.2.js"></script>
    <!-- 引入jquery -->
    <script type="text/javascript" src="../../static/js/jquery.min.js"></script>
    <!-- 引入样式 -->
    <link href="../../static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../../layer/layer.js"></script>
    <script language="javascript">
        window.history.forward(-1);
        window.history.forward(1);
        $(function () {
            var show_num = [];
            draw(show_num);
            $("#canvas").on('click', function () {
                draw(show_num);
            })
            $("#change").on('click', function () {
                draw(show_num);
            })
            $("#dl").on('click', function () {
                if (form1.username.value == "") {
                    /* alert("请输入用户名");*/
                    $("#username").popover();
                    form1.username.focus();
                    return false;
                }
                if (form1.password.value == "") {
                    //alert("请输入密码");
                    $("#password").popover();
                    form1.password.focus();
                    return false;
                }
                if (form1.yzm.value == "") {
                    //alert("请输入验证码");
                    $("#yzm").popover();
                    form1.yzm.focus();
                    return false;
                }
                var val = $(".input-val").val().toLowerCase();
                var num = show_num.join("");
                if (val == num) {
                    /*alert('验证成功');*/
                    /*$(".input-val").val('');
                    draw(show_num);*/
                    form1.submit();
                } else {
                    //alert('验证码错误');
                    layer.alert('验证码错误', {
                        icon : 3,
                        skin : 'layer-ext-moon'
                    })
                    $(".input-val").val('');
                    draw(show_num);
                    return false;
                }
            })
            /*$(".btn").on('click', function () {
                var val = $(".input-val").val().toLowerCase();
                var num = show_num.join("");
                if (val == '') {
                    alert('请输入验证码');
                } else if (val == num) {
                    alert('验证成功');
                    $(".input-val").val('');
                    draw(show_num);

                } else {
                    alert('验证失败');
                    $(".input-val").val('');
                    draw(show_num);
                }
            })*/
        })

        function draw(show_num) {
            var canvas_width = $('#canvas').width();
            var canvas_height = $('#canvas').height();
            var canvas = document.getElementById("canvas");
            var context = canvas.getContext("2d");
            canvas.width = canvas_width;
            canvas.height = canvas_height;
            var sCode = "A,B,C,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,W,X,Y,Z,1,2,3,4,5,6,7,8,9,0";
            var aCode = sCode.split(",");
            var aLength = aCode.length;

            for (var i = 0; i <= 3; i++) {
                var j = Math.floor(Math.random() * aLength);
                var deg = Math.random() * 30 * Math.PI / 180;
                var txt = aCode[j];
                show_num[i] = txt.toLowerCase();
                var x = 10 + i * 20;
                var y = 20 + Math.random() * 8;
                context.font = "bold 23px ΢���ź�";

                context.translate(x, y);
                context.rotate(deg);

                context.fillStyle = randomColor();
                context.fillText(txt, 0, 0);

                context.rotate(-deg);
                context.translate(-x, -y);
            }
            for (var i = 0; i <= 5; i++) {
                context.strokeStyle = randomColor();
                context.beginPath();
                context.moveTo(Math.random() * canvas_width, Math.random() * canvas_height);
                context.lineTo(Math.random() * canvas_width, Math.random() * canvas_height);
                context.stroke();
            }
            for (var i = 0; i <= 30; i++) {
                context.strokeStyle = randomColor();
                context.beginPath();
                var x = Math.random() * canvas_width;
                var y = Math.random() * canvas_height;
                context.moveTo(x, y);
                context.lineTo(x + 1, y + 1);
                context.stroke();
            }
        }

        function randomColor() {
            var r = Math.floor(Math.random() * 256);
            var g = Math.floor(Math.random() * 256);
            var b = Math.floor(Math.random() * 256);
            return "rgb(" + r + "," + g + "," + b + ")";
        }

        /*function check() {
            var show_num = [];
            draw(show_num);
            if (form1.username.value == "") {
                alert("请输入用户名");
                form1.username.focus();
                return false;
            }
            if (form1.password.value == "") {
                alert("请输入密码");
                form1.password.focus();
                return false;
            }

            if (form1.yzm.value == "") {
                alert("请输入验证码");
                form1.yzm.focus();
                return false;
            }
            var val = $(".input-val").val().toLowerCase();
            var num = show_num.join("");
            if (val == num) {
                alert('验证成功');
                /!*$(".input-val").val('');
                draw(show_num);*!/
                return true;
            } else {
                alert('验证失败');
                $(".input-val").val('');
                draw(show_num);
                return false;
            }*/

            /*var code = document.getElementById("yzm").value;
            var input = document.getElementById("yz").value;
            alert(input);
            alert(code);
            if (input == code) {
                alert("验证成功");
                return false;
            } else {
                alert("验证失败");
                return false;
            }
        }*/

       /* $(function () {
            $("#randImage").click(function () {
                var dt = new Date();
                this.src = 'code?dt=' + dt;
            })
        })*/
    </script>
</head>
<BODY class=bg>
<%
    String userid = "", password = "";
    Cookie[] cookies = request.getCookies();
    //System.out.println("cookies ="+cookies.length);
    if (cookies != null) {
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals("userid")) {
                //读取有中文的cookie
                userid = URLDecoder.decode(cookies[i].getValue(), "utf-8");
            }
            if (cookies[i].getName().equals("password")) {
                password = cookies[i].getValue();
            }
        }
    }
    if (userid == null)
        userid = "";
    if (password == null)
        password = "";
%>
<form name="form1" method="post" action="./UserServlet?action=login"
      id="form1"><%--onsubmit="return check();"--%>
    <DIV class=loginmian></DIV>
    <DIV style="MARGIN: -55px auto 0px; WIDTH: 1024px; HEIGHT: 231px">
        <DIV></DIV>
        <DIV class=logininner style="margin-top: -300px">
            <DIV id=logintip>
                <%
                    String log = request.getParameter("islogin");
                    if (log != null && log.equals("failed")) {
                        out.print("用户名或密码错误，请重新登录.");
                    }
                    if (log != null && log.equals("dis")) {
                        out.print("用户名已禁止登录.");
                    }
                    if (log != null && log.equals("expire")) {
                        out.print("系统已过期，QQ：21257638");
                    }
                %>
            </DIV>
            <DIV class=login>
                <%--<DIV style="LINE-HEIGHT: 35px; HEIGHT: 35px" class="input-group">
                    <LABEL class="input-group-addon">用户名</LABEL> <input name="username" type="text" maxlength="25"
                                              id="uname" class="form-control" style="height: 18px;"
                />
                </DIV>--%>
                <center><div style="color: red">${errorinfo}</div></center>
                <div class="input-group">
                    <span class="input-group-addon" id="basic-addon1">用户名</span>
                    <input data-content="用户名不能为空" data-trigger="focus" title="温馨提示" data-toggle="popover" type="text"
                           name="username" id="username" data-placement="top" class="form-control" placeholder="Username"
                           aria-describedby="basic-addon1"/>
                </div>

                <%-- <DIV style="LINE-HEIGHT: 35px; HEIGHT: 35px">
                 <LABEL>密 码</LABEL> <input name="password" type="password"
                                           maxlength="25" id="password" class="form-control"
                                           style="height: 18px;"/>
             </DIV>--%>
                <div class="input-group" style="margin-top: 10px;">
                    <span class="input-group-addon" id="basic-addon2">密码</span>
                    <input data-content="密码不能为空" data-trigger="focus" title="温馨提示" data-toggle="popover"
                           id="password" data-placement="top" type="password" name="password" class="form-control" placeholder="Password"
                           aria-describedby="basic-addon1">
                </div>

                <DIV style="margin-top: 10px;width: 290px">
                    <LABEL style="margin-top: 10px">验证码</LABEL> <input data-content="验证码不能为空" data-trigger="focus" title="温馨提示" data-toggle="popover" type="text"
                                                                       id="yzm" data-placement="top" name="yzm" type="text" maxlength="4"
                                                                       id="yzm" class="input-val" style="height: 46px"/>&nbsp;
                    <%--<span style="color: Red; font-size: 14px; HEIGHT: 35px;"><span
                            id="code">--%> <%--<img name="randImage" id="randImage"
                                            src="code" width="60" height="25" border="0"
                                            align="absmiddle"/>--%>
                    <canvas id="canvas" width="100" height="43" vertical-align="middle"></canvas>
                    <%--<button class="btn">验证</button>--%>
                    <%--<jsp:include flush="true" page="/yz.jsp"></jsp:include>--%>
                    <%--<a href="#" onclick="javascript:var dt=new Date();document.getElementById('randImage').src='code?dt='+dt;">换</a>--%>

                    <a href="#" id="change" style="text-decoration: none;line-height:45px;">换一个</a>
                    </span></span> <%--&nbsp;&nbsp;<span style="display:none">
                    <input name="yz"
                           type="text" id="yz"
                           value=""/>
						</span>--%>
                </DIV>

                <DIV style="LINE-HEIGHT: 30px; HEIGHT: 30px;margin-top: 10px;">
                    <LABEL>&nbsp;</LABEL>
                    <input type="submit" name="dl" value="登录系统"
                           onclick="return sub();" id="dl" class="btn btn-success"/>
                    <input type="checkbox" name="remember" value="1"/>记住密码
                </DIV>
            </DIV>
        </DIV>
        <div style="width: 100%; text-align: center;color:rgba(0,0,0,0.7)">版权所有&copy;
            2019-2022&nbsp;&nbsp;&nbsp;&nbsp; 联系电话: 18379551763
            &nbsp;&nbsp;&nbsp;&nbsp; 中国 江西 南昌
        </div>
    </DIV>
</form>
</BODY>
</html>