<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
		border: 1px solid rgba(0,0,0,.2);
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
            <input type="text" value="" placeholder="" class="input-val">
            <canvas id="canvas" width="100" height="43"></canvas>
            <button class="btn">验证</button>
        </div>
        
        </div>
    </body>

    
    
<script>

    $(function(){
        var show_num = [];
        draw(show_num);

        $("#canvas").on('click',function(){
            draw(show_num);
        })
        $(".btn").on('click',function(){
            var val = $(".input-val").val().toLowerCase();
            var num = show_num.join("");
            if(val==''){
                alert('请输入验证码');
            }else if(val == num){
                alert('验证成功');
                $(".input-val").val('');
                draw(show_num);

            }else{
                alert('验证失败');
                $(".input-val").val('');
                draw(show_num);
            }
        })
    })

    function draw(show_num) {
        var canvas_width=$('#canvas').width();
        var canvas_height=$('#canvas').height();
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