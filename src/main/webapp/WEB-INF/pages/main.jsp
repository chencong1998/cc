<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD><TITLE>物流管理信息系统</TITLE>
    <META http-equiv=Content-Type content="text/html;charset=gbk">
    <LINK media=screen href="../../css/reset.css" type=text/css rel=stylesheet>
    <LINK media=screen href="../../css/index.css" type=text/css rel=stylesheet>
    <LINK media=screen href="../../css/invalid.css" type=text/css rel=stylesheet>
    <LINK href="../../css/jquery_dialog.css" type=text/css rel=stylesheet>
   <link rel="stylesheet" href="../../css/style1.css">

    <SCRIPT>
        window.history.forward(1);
        window.history.forward(-1);
        function logoutsys() { //用户退出登录
            if (!confirm('您确实要退出系统吗？')) {
                return false;
            }
            return true;
        }

        function enterindex() {
            window.frames['mainFrame'].location = "Default.aspx";
        }

        function show5() {
            if (!document.layers && !document.all) {
                return
            }
            var Digital = new Date();
            var years = Digital.getYear();
            var months = Digital.getUTCMonth() + 1;
            var days = Digital.getDate();
            var hours = Digital.getHours();
            var minutes = Digital.getMinutes();
            var seconds = Digital.getSeconds();
            var dn = "上午";
            if (hours > 12) {
                dn = "下午"
                hours = hours - 12;
            }
            if (hours == 0) {
                hours = 12;
            }
            if (minutes <= 9) {
                minutes = "0" + minutes;
            }
            if (seconds <= 9) {
                seconds = "0" + seconds;
            }

            var myclock = "<font color='#333333'>当前时间:" + years + "-" + months + "-" + days + " " + hours + ":" + minutes + ":" + seconds + " " + dn + "</font>";

            if (document.layers) {
                document.layers.liveclock.document.write(myclock);
                document.layers.liveclock.document.close();
            } else if (document.all) {
                document.getElementById("liveclock").innerHTML = myclock;
            }
            setTimeout("show5()", 1000);
        }

        function dispalyss(i) {
            var time = new Date();
            var returnVal = window.showModalDialog('mesage.aspx?id=' + i + '&time=' + time, "window", "dialogHeight:380px;dialogWidth:650px;resizable:no;location:no;help:yes;status:no;scroll:yes");
        }

    </SCRIPT>

    <STYLE type=text/css>
        #infozone {
            FONT-SIZE: 12px;
            OVERFLOW: hidden;
            WIDTH: 300px;
            COLOR: #aa6;
            HEIGHT: 30px
        }

        #infozone DIV {
            OVERFLOW: hidden;
            LINE-HEIGHT: 26px;
            WHITE-SPACE: nowrap;
            HEIGHT: 30px
        }
    </STYLE>

    <META content="MSHTML 6.00.6000.21311" name=GENERATOR>
</HEAD>
<BODY style="BACKGROUND-COLOR: #cc9999">
<DIV class=body_header>
    <DIV class=header_left>
        <H1 class=header_logo><A><IMG id=logo alt=物流信息平台 src="../../images/mylogo1.png"></A></H1>
    </DIV>
    <DIV class=shortcut-buttons-set style="MARGIN-RIGHT: 40px;margin-top: 50px">
        <a href="./UserServlet?action=exit" onclick="return logoutsys();">
            <button style="background-color: red;font:16px bold;color: white" title=退出系统 border="0" alt=退出系统>退出系统</button></a>
    </DIV>
    <DIV class=shortcut-buttons-set style="margin-top: 50px"><a href="right" target="mainFrame" >
        <img src="" alt=""/><button style="background-color: green;font:16px bold;color: white" alt=系统首页 title=系统首页>系统首页</button></a>
    </DIV>
    <DIV id=profile-links>
        <DIV id=usertip style="font:16px bold;margin-top: -4px;color: green">当前用户: ${sessionScope.users.username } </DIV>
        <DIV id=smstip style="font:16px bold;color: green">所在部门: ${sessionScope.users.depname }</DIV>
    </DIV>
</DIV>
<DIV id=body-wrapper>



    <DIV id=left>
        <%--<DIV id=menutop><IMG src="../../images/menu-ico.jpg" border=0>&nbsp;系统主菜单</DIV>--%>
        <DIV id=menubg style="width: 500px">
           <IFRAME width="500px" id=leftFrame name=leftFrame src="left" frameBorder=0
                    onload="Javascript:SetCwinHeight('leftFrame')"></IFRAME>
            <%--<frameset rows="60,*" cols="*" frameborder="no" border="0" framespacing="0">
                <frame src="/carticketsystem/auser/top.jsp" name="topFrame" scrolling="no">
                <frameset cols="180,*" name="btFrame" frameborder="NO" border="0" framespacing="0">
                    <frame id=leftFrame name=leftFrame src="left" frameBorder=0 scrolling="yes">&lt;%&ndash;noresize:无法调整框架大小&ndash;%&gt;
                    <frame src="/carticketsystem/auser/index/sysPro.jsp" noresize name="main" scrolling="yes">
                </frameset>
            </frameset>--%>
        </DIV>
    </DIV>

    <DIV id=main>
        <IFRAME id=mainFrame width="45"
                style="border: #cccc99 1px solid"
                name=mainFrame src="right" frameBorder=0 onload="Javascript:SetCwinHeight('mainFrame')"></IFRAME>
    </DIV>
</DIV>

<DIV id=bottom-tip>
    <DIV class=middle style="WIDTH: 750px">
        <DIV id=infozone>

        </DIV>
    </DIV>
    <DIV style="FLOAT: left; WIDTH: 440px;margin-left: -800px">&nbsp;&nbsp;&nbsp;&nbsp;当前时间：
        <script language=JavaScript>
            today = new Date();

            function initArray() {
                this.length = initArray.arguments.length;//传递参数给当前函数的参数个数
                for (var i = 0; i < this.length; i++)
                    this[i + 1] = initArray.arguments[i];
            }

            var d = new initArray("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
            document.write(today.getYear() + 1900, "年", today.getMonth() + 1, "月", today.getDate(), "日 ", d[today.getDay() + 1]);
        </script>
        <span id="liveclock" style="width:109px; height: 15px"></span>  <!--显示时间-->
        <SCRIPT language=javascript>
            function www_mdrcw_com() {
                var Digital = new Date();
                var hours = Digital.getHours();
                var minutes = Digital.getMinutes();
                var seconds = Digital.getSeconds();
                if (minutes <= 9)
                    minutes = "0" + minutes;
                if (seconds <= 9)
                    seconds = "0" + seconds;
                myclock = "<font>" + hours + ":" + minutes + ":" + seconds + "</font>";
                if (document.layers) {
                    document.layers.liveclock.document.write(myclock);
                    document.layers.liveclock.document.close();
                } else if (document.all)
                    liveclock.innerHTML = myclock;
                setTimeout("www_mdrcw_com()", 1000);
            }

            www_mdrcw_com();
        </SCRIPT>
    </DIV>
    <DIV style="BACKGROUND: url(pics/buttonright.jpg) no-repeat; FLOAT: right; WIDTH: 140px;margin-left: -800px">版本号:V2017</DIV>
</DIV>

<SCRIPT>
    function SetCwinHeight(divid) {
        var cwin = document.getElementById(divid);
        if (document.getElementById) {
            if (cwin && !window.opera) {
                if (cwin.contentDocument && cwin.contentDocument.body.offsetHeight) {
                    cwin.height = cwin.contentDocument.body.offsetHeight;
                }
                else if (cwin.Document && cwin.Document.body.scrollHeight) {
                    cwin.height = cwin.Document.body.scrollHeight;
                }
            }
        }
    }

    function setPhone(phone) {
        if (document.all) {//IE
            document.frames["mainFrame"].setPhone(phone);
        } else {//Firefox
            document.getElementById("mainFrame").contentWindow.setPhone(phone);
        }
        JqueryDialog.Close();
    }

    //
    function setMsg(phone, phonecount, msgcount) {
        if (document.all) {//IE
            document.frames["mainFrame"].setMsg(phone, phonecount, msgcount);
        } else {//Firefox
            document.getElementById("mainFrame").contentWindow.setMsg(phone, phonecount, msgcount);
        }
        JqueryDialog.Close();
    }

    function selectUser(users) {
        if (document.all) {//IE
            document.frames["mainFrame"].selectUser(users);
        } else {//Firefox
            document.getElementById("mainFrame").contentWindow.selectUser(users);
        }
        JqueryDialog.Close();
    }

    function setMmsPic(picurl, id) {
        if (document.all) {//IE
            document.frames["mainFrame"].setPicUrl(picurl, id);
        } else {//Firefox
            document.getElementById("mainFrame").contentWindow.setPicUrl(picurl, id);
        }
        JqueryDialog.Close();

    }

    function showupload(type, id, name, size) {
        if (document.all) {//IE
            document.frames["mainFrame"].showupload(type, id, name, size);
        } else {//Firefox
            document.getElementById("mainFrame").contentWindow.showupload(type, id, name, size);
        }
        JqueryDialog.Close();
    }

    function locationhref(url) {
        window.frames['mainFrame'].location = url;
        JqueryDialog.Close();
    }

    function closeDialog() {
        JqueryDialog.Close();
    }

    function setSms(remainpoint) {
        document.getElementById("remainpoint").innerHTML = remainpoint;
    }

    document.getElementById("left").style.height = document.documentElement.clientHeight - 127 + "px";
    document.getElementById("leftFrame").style.height = document.documentElement.clientHeight - 175 + "px";
    document.getElementById("main").style.height = document.documentElement.clientHeight - 127 + "px";
    document.getElementById("mainFrame").style.height = document.documentElement.clientHeight - 127 + "px";
    document.getElementById("left").style.width = 200 + "px";
    document.getElementById("leftFrame").style.width = 170 + "px";
    document.getElementById("main").style.width = document.documentElement.clientWidth - 221 + "px";
    document.getElementById("mainFrame").style.width = document.documentElement.clientWidth - 221 + "px";
    window.onresize = function () {
        document.getElementById("left").style.height = document.documentElement.clientHeight - 127 + "px";
        document.getElementById("leftFrame").style.height = document.documentElement.clientHeight - 175 + "px";
        document.getElementById("main").style.height = document.documentElement.clientHeight - 127 + "px";
        document.getElementById("mainFrame").style.height = document.documentElement.clientHeight - 127 + "px";
        document.getElementById("left").style.width = 200 + "px";
        document.getElementById("leftFrame").style.width = 170 + "px";
        document.getElementById("main").style.width = document.documentElement.clientWidth - 221 + "px";
        document.getElementById("mainFrame").style.width = document.documentElement.clientWidth - 221 + "px";

    }

    function scrollup(o, d, c) {
        if (document.all) {
            if (d == c) {
                var t = o.firstChild.cloneNode(true);
                o.removeChild(o.firstChild);
                o.appendChild(t);
                t.style.marginTop = o.firstChild.style.marginTop = '0px';
            }
            else {
                var s = 3, c = c + s, l = (c >= d ? c - d : 0);
                o.firstChild.style.marginTop = -c + l + 'px';
                window.setTimeout(function () {
                    scrollup(o, d, c - l)
                }, 100);
            }
        }
        else {
            if (d == c) {
                var t = o.childNodes[1].cloneNode(true);
                o.removeChild(o.childNodes[1]);
                o.appendChild(t);
                t.style.marginTop = o.childNodes[1].style.marginTop = '0px';
            }
            else {
                var s = 3, c = c + s, l = (c >= d ? c - d : 0);
                o.childNodes[1].style.marginTop = -c + l + 'px';
                window.setTimeout(function () {
                    scrollup(o, d, c - l)
                }, 100);
            }
        }
    }

    var o = document.getElementById('infozone');
    window.setInterval(function () {
        scrollup(o, 20, 0);
    }, 5000);

</SCRIPT>

<DIV id=winpop>
    <DIV class=title>消息提示<SPAN class=closeTip onclick=closeTip()>X</SPAN></DIV>
    <DIV class=con id=showContent></DIV>
</DIV>
<SCRIPT language=javascript type=text/javascript>
    var http_requestres;
    function makeRequestRes() {
        http_requestres = false;
        if (window.XMLHttpRequest) {
            http_requestres = new XMLHttpRequest();
            if (http_requestres.overrideMimeType) {
                http_requestres.overrideMimeType('text/xml');
            }
        }
        else if (window.ActiveXObject) {
            try {
                http_requestres = new ActiveXObject('Msxml2.XMLHTTP');
            }
            catch (e) {
                try {
                    http_requestres = new ActiveXObject('Microsoft.XMLHTTP');
                }
                catch (e) {
                }
            }
        }

        http_requestres.onreadystatechange = alertContentsRes;
        http_requestres.open('GET', 'checknewtask.aspx', true);
        http_requestres.send(null);
    }

    function alertContentsRes() {
        if (http_requestres.readyState == 4) {
            if (http_requestres.status == 200) {
                eval(http_requestres.responseText);
            }
            else {
            }
            http_request2 = false;
            //setTimeout("makeRequestRes()", 10000);
        }
    }

    var http_requestmain;

    function makeRequestremain() {
        http_requestmain = false;
        if (window.XMLHttpRequest) {
            http_requestmain = new XMLHttpRequest();
            if (http_requestmain.overrideMimeType) {
                http_requestmain.overrideMimeType('text/xml');
            }
        }
        else if (window.ActiveXObject) {
            try {
                http_requestmain = new ActiveXObject('Msxml2.XMLHTTP');
            }
            catch (e) {
                try {
                    http_requestmain = new ActiveXObject('Microsoft.XMLHTTP');
                }
                catch (e) {
                }
            }
        }

        http_requestmain.onreadystatechange = function () {
            alertContentsmain()
        };
        http_requestmain.open('GET', 'getremain.aspx', true);
        http_requestmain.send(null);
    }

    function alertContentsmain() {
        if (http_requestmain.readyState == 4) {
            if (http_requestmain.status == 200) {
                document.getElementById("remainpoint").innerHTML = http_requestmain.responseText;
            }
            else {
            }
            http_requestmain = false;
            setTimeout("makeRequestremain('getremain.aspx')", 4000);
        }
    }

    makeRequestremain();

    function tips_pop(content) {
        var MsgPop = document.getElementById("winpop");
        var popH = parseInt(MsgPop.style.height);
        if (popH == 0) {
            MsgPop.style.display = "block";
            show = setInterval("changeH('up')", 2);
            $("#showContent").html(content);

        }
    }

    function changeH(str) {
        var MsgPop = document.getElementById("winpop");
        var popH = parseInt(MsgPop.style.height);
        if (str == "up") {
            if (popH <= 100) {
                MsgPop.style.height = (popH + 4).toString() + "px";
            }
            else {
                clearInterval(show);
            }
        }
        if (str == "down") {
            if (popH >= 4) {
                MsgPop.style.height = (popH - 4).toString() + "px";
            }
            else {
                clearInterval(hide);
                MsgPop.style.display = "none";
                $("#showplay").html("");
            }
        }
    }

    window.onload = function () {
        document.getElementById('winpop').style.height = '0px';
    }

    function closeTip() {
        // hide = setInterval("changeH('down')", 20000000000); //开始以每0.002秒调用函数changeH("up"),即每0.002秒向上移动一次
    }

    //makeRequestRes();
</SCRIPT>
<div style="height:10px;"></div>

<div class="suspension">
    <div class="suspension-box">
        <a href="#" class="a a-service "><i class="i"></i></a>
        <a href="javascript:;" class="a a-service-phone "><i class="i"></i></a>
        <a href="javascript:;" class="a a-qrcode"><i class="i"></i></a>
       <%-- &lt;%&ndash;<a href="#" class="a a-cart"><i class="i"></i></a>&ndash;%&gt;--%>
        <a href="javascript:;" class="a a-top"><i class="i"></i></a>
        <div class="d d-service">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="d-service-item clearfix" style="height: 30px">
                    <a href="tencent://message/?uin=21257638&amp;Site=www.xxx.com&amp;Menu=yes" class="clearfix"><span class="circle"><i class="i-qq"></i></span><h3>
                        咨询在线客服
                        </h3></a>
                </div>
            </div>
        </div>
        <div class="d d-service-phone">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="d-service-item clearfix">
                    <span class="circle"><i class="i-tel"></i></span>
                    <div class="text" style="height: 30px">
                        <span>服务热线</span>
                        <p class="red number">183 7955 1763</p>
                    </div>
                </div>
                <div class="d-service-intro clearfix" style="height: 30px">
                    <center>
                    <span>功能和特性</span>
                    <span>价格和优惠</span><br/>
                    <span>获取内部资料</span>
                    </center>
                </div>
            </div>
        </div>
        <div class="d d-qrcode">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="qrcode-img" style="height: 50px"><img style="height: 60px" src="../../images/side_ewm.jpg" alt=""></div>
                <p>微信服务号</p>
            </div>
        </div>

    </div>
</div>
<script type="text/javascript" src="../../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){

        /* ----- 侧边悬浮 ---- */
        $(document).on("mouseenter", ".suspension .a", function(){
            var _this = $(this);
            var s = $(".suspension");
            var isService = _this.hasClass("a-service");
            var isServicePhone = _this.hasClass("a-service-phone");
            var isQrcode = _this.hasClass("a-qrcode");
            if(isService){ s.find(".d-service").show().siblings(".d").hide();}
            if(isServicePhone){ s.find(".d-service-phone").show().siblings(".d").hide();}
            if(isQrcode){ s.find(".d-qrcode").show().siblings(".d").hide();}
        });
        $(document).on("mouseleave", ".suspension, .suspension .a-top", function(){
            $(".suspension").find(".d").hide();
        });
        $(document).on("mouseenter", ".suspension .a-top", function(){
            $(".suspension").find(".d").hide();
        });
        $(document).on("click", ".suspension .a-top", function(){
            $("html,body").animate({scrollTop: 0});
        });
        $(window).scroll(function(){
            var st = $(document).scrollTop();
            var $top = $(".suspension .a-top");
            if(st > 400){
                $top.css({display: 'block'});
            }else{
                if ($top.is(":visible")) {
                    $top.hide();
                }
            }
        });
    });
</script>
</BODY>
</HTML>