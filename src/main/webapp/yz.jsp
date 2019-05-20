<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<!-- head -->
<head>
    <meta charset="utf-8">
    <title>js验证码֤</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">


    <style>
        .code {
            width: 400px;
            margin: 0 auto;
        }

        .input-val {
            float: left;
            width: 100px;
            background: #ffffff;
            height: 2.2rem;
            padding: 0 2%;
            border-radius: 5px;
            border: none;
            border: 1px solid rgba(0, 0, 0, .2);
            font-size: 14px;
            margin-right: 100px;
        }

        #canvas {
            float: left;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>

<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>

<body cz-shortcut-listen="true" class="layui-layout-body">
<div class="layui-layer-move">

    <div class="code">
        <p>验证码</p> <input type="text" style="margin-top:-30px;margin-left: 100px" value="" placeholder="" class="input-val">
        <canvas id="canvas" width="100" style="margin-top:-30px;margin-left:-40px" height="43"></canvas>
        <button class="btn">验证</button>
    </div>

</div>
<div style="height:10000px;"></div>

<div class="suspension">
    <div class="suspension-box">
        <a href="#" class="a a-service "><i class="i"></i></a>
        <a href="javascript:;" class="a a-service-phone "><i class="i"></i></a>
        <a href="javascript:;" class="a a-qrcode"><i class="i"></i></a>
        <a href="#" class="a a-cart"><i class="i"></i></a>
        <a href="javascript:;" class="a a-top"><i class="i"></i></a>
        <div class="d d-service">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="d-service-item clearfix">
                    <a href="#" class="clearfix"><span class="circle"><i class="i-qq"></i></span><h3>咨询在线客服</h3></a>
                </div>
            </div>
        </div>
        <div class="d d-service-phone">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="d-service-item clearfix">
                    <span class="circle"><i class="i-tel"></i></span>
                    <div class="text">
                        <p>服务热线</p>
                        <p class="red number">4001-021-758</p>
                    </div>
                </div>
                <div class="d-service-intro clearfix">
                    <p><i></i>功能和特性</p>
                    <p><i></i>价格和优惠</p>
                    <p><i></i>获取内部资料</p>
                </div>
            </div>
        </div>
        <div class="d d-qrcode">
            <i class="arrow"></i>
            <div class="inner-box">
                <div class="qrcode-img"><img src="images/side_ewm.jpg" alt=""></div>
                <p>微信服务号</p>
            </div>
        </div>

    </div>
</div>

<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
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
</body>


<script>
    $(function () {
        var show_num = [];
        draw(show_num);

        $("#canvas").on('click', function () {
            draw(show_num);
        })
        $(".btn").on('click', function () {
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
        })
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
</script>
</html>