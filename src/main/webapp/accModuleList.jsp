<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">
<title>权限设置</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/invalid.css" type="text/css"
	media="screen" />
	<%--<script src="${pageContext.request.contextPath}/layui/layui.js"></script>--%>
	<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
</head>
<body>
	<div id="maintitle">
		<div id="mainico"></div>
		<div id="maintip">
			<strong>位置：</strong>权限设置
		</div>
	</div>
	<div class="content-box role">
		<div class="content-box-content">
			<div class="tab-content default-tab" id="form">
				<div>
					<table style="width: 100%;" border="0" cellpadding="0"
						cellspacing="0">

						<tr>
							<td colspan="2">
							<c:forEach items="${listAcc}" var="accmoudle">
								<c:if test="${accmoudle.module.moduleid==48}">
									<form action="#" method="post"
										  name="form1" onsubmit="return false;">
										<table border="0" align="left" cellpadding="2" cellspacing="1">
											<tr>
												<td height="30" class="STYLE1" nowrap="nowrap"
													style="BORDER-BOTTOM: #c1dad7 1px solid" colspan="3"
													align="right">用户名称： <select name="userid"
																				style="width: 100px">
													<c:forEach items="${userList}" var="user">
														<c:if test="${users.id==user.id}">
															<option value="${user.id }" selected>${user.username }</option>
														</c:if>
														<c:if test="${users.id !=user.id}">
															<option value="${user.id }">${user.username }</option>
														</c:if>
													</c:forEach>
												</select> <input type="submit" onclick="chakan(form1.userid.value)" value="查看权限"></td>
											</tr>

												<%--<script language="javascript">
                                                    function selAll() {
                                                        var len = form2.moduleid.length;
                                                        alert(len)
                                                        for (var i = 0; i < len; i++) {
                                                            form2.moduleid[i].checked = true;
                                                        }
                                                    }
                                                    function unselAll() {
                                                        var len = form2.moduleid.length;
                                                        for (var i = 0; i < len; i++) {
                                                            form2.moduleid[i].checked = false;
                                                        }
                                                    }
                                                    function chk1state(chk) {
                                                        alert(chk)
                                                        if (chk) {
                                                            alert("1")
                                                            selAll();
                                                        } else {
                                                            alert("2")
                                                            unselAll();
                                                        }
                                                    }
                                                    //accid
                                                    function UserselAll() {
                                                        var len = form3.accid.length;
                                                        for (var i = 0; i < len; i++) {
                                                            form3.accid[i].checked = true;
                                                        }
                                                    }
                                                    function UserunselAll() {
                                                        var len = form3.accid.length;
                                                        for (var i = 0; i < len; i++) {
                                                            form3.accid[i].checked = false;
                                                        }
                                                    }
                                                    function chk2state() {
                                                        if (form3.chk2.checked) {
                                                            UserselAll();
                                                        } else {
                                                            UserunselAll();
                                                        }
                                                    }
                                                </script>--%>

										</table>
									</form>
								</c:if>
							</c:forEach>

							</td>
						</tr>
						<tr>

							<td colspan="2">

										<form  class="layui-form" method="post"
											   name="form2">
											<table align="center" width="800" cellpadding="3"
												   cellspacing="1" border="1">
												<tr>
													<td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid"
														colspan="5">
														<h3>系&nbsp;&nbsp;统&nbsp;&nbsp;权&nbsp;&nbsp;限</h3>
													</td>
													<td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid" align="right">
														<input type="checkbox" id="chk1" name="chk1" lay-filter="chk1" value="全选" onclick="chk1state();" />全选 用户名称：
														<div style="width: 100px;display: inline-block" class="layui-input-block"  >
															<select name="userid" id="userid1" lay-filter="userid1"  >
																<c:forEach items="${userList}" var="user">
																	<c:if test="${users.id==user.id}">
																		<option value="${user.id }" selected >${user.username }</option>
																	</c:if>
																	<c:if test="${users.id !=user.id}">
																		<option value="${user.id }">${user.username }</option>
																	</c:if>
																</c:forEach>
															</select>
														</div>
<c:forEach items="${listAcc}" var="accmoudle">
    <c:if test="${accmoudle.module.moduleid==49}">
														<input type="button" id="insert"  value="授于权限"   style="display: inline-block">
    </c:if>

</c:forEach>

                                                    </td>
												</tr>

												<c:forEach items="${Modules}" var="module" varStatus="m">
													<c:if test="${m.index % 6==0}">
														<tr>
													</c:if>
													<td class="STYLE1" nowrap="nowrap"
														style="BORDER: #c1dad7 1px solid">
															<%--<input type="checkbox" name="moduleid" value="${module.moduleid}" />${module.modulename}--%>
														<input type="checkbox" class="moduleid" name="moduleid1" value="${module.moduleid}" title="${module.modulename}" >
													</td>
													<c:if test="${m.index % 6==5}">
														</tr>
													</c:if>
												</c:forEach>
											</table>
										</form>


								<script type="text/javascript">
									$(function () {
										$("#insert").click(function () {
										    var modules="";
                                            $("[name='moduleid1']").each(function (index, element) {

                                                if($(this).get(0).checked == true)
												{
                                                    modules += $(this).val() + ",";
												}

                                            });
                                            var userId=$("#userid1").val();
                                            if (modules.length > 0) //如果获取到
                                                modules = modules.substring(0, modules.length - 1); //把最后一个逗号去掉
                                            $.ajax({
                                                url:'${pageContext.request.contextPath}/accmodule/accmoduleAdd.action',
                                                data:{'module':modules,'userId':userId},
												type:'post',
                                                success:function (res) {
                                                    if (res>0){
                                                        alert("授权成功")
                                                        //刷新
                                                        insert(userId);
                                                    } else
													    alert("授权失败")
                                                }
											})
                                        })



                                    })

								</script>
								<script>

										function chakan(usersId) {
											$.ajax({
												url:'${pageContext.request.contextPath}/accmodule/accmoduleModify.action',
												data:"usersId="+usersId,
                                                dataType:'json',
												success:function (res) {
                                                    var moduleid=$(".moduleid").length; //获取所有权限数量

                                                    for (i=0;i<moduleid;i++){
                                                        $(".moduleid").get(i).checked = false; //清除所有模块

                                                        $.each(res,function (index,accmodule) {
                                                            if($(".moduleid").get(i).value==accmodule.module.moduleid){ //判断用户的模块

                                                                $(".moduleid").get(i).checked = true;
                                                       		 }


                                                        })

                                                    }

                                                    $("#delete tr:gt(0)").text("");
                                                    $.each(res,function (index,accmodule) {

                                                        //删除权限显示
                                                        var module="<td><input type='checkbox' class='moduleid2' name='moduleid2' value='"+
                                                            accmodule.id+"' title='"+accmodule.module.modulename+"'/></td>";
                                                        var tr="<tr></tr>";

                                                        if (index%6==0){
                                                            $("#delete").append(tr);
                                                        }
                                                        $("#delete tr:last").append(module);


                                                    })


                                                    document.getElementById('userid1').value=usersId;

                                                    document.getElementById('userid2').value=usersId;
                                                    layui.use('form', function(){
                                                        var form = layui.form;
                                                        form.render(); //刷新select选择框渲染
                                                    });

                                                }
											})
                                        }

                                        //授予权限查看
                                        function insert(userId) {
                                            $.ajax({
                                                url:'${pageContext.request.contextPath}/accmodule/accmoduleModify.action',
                                                data:"usersId="+userId,
                                                dataType:'json',
                                                success:function (res) {
                                                    var moduleid = $(".moduleid").length; //获取所有权限数量

                                                    for (i = 0; i < moduleid; i++) {
                                                        $(".moduleid").get(i).checked = false; //清除所有模块

                                                        $.each(res, function (index, accmodule) {
                                                            if ($(".moduleid").get(i).value == accmodule.module.moduleid) { //判断用户的模块

                                                                $(".moduleid").get(i).checked = true;
                                                            }
                                                        })
                                                        layui.use('form', function(){
                                                            var form = layui.form;
                                                            form.render('checkbox'); //刷新select选择框渲染
                                                        });


                                                    }
                                                }
                                            })
                                        }
                                        //删除权限查看
                                        function del(userId){
                                            $.ajax({
                                                url:'${pageContext.request.contextPath}/accmodule/accmoduleModify.action',
                                                data:"usersId="+userId,
                                                dataType:'json',
                                                success:function (res) {

                                                    $("#delete tr:gt(0)").text("");
                                                    $.each(res,function (index,accmodule) {

                                                        //删除权限显示
                                                        var module="<td><input type='checkbox' class='moduleid2' name='moduleid2' value='"+
                                                            accmodule.id+"' title='"+accmodule.module.modulename+"'/></td>";
                                                        var tr="<tr></tr>";

                                                        if (index%6==0){
                                                            $("#delete").append(tr);
                                                        }
                                                        $("#delete tr:last").append(module);


                                                    })
                                                    layui.use('form', function(){
                                                        var form = layui.form;
                                                        form.render('checkbox'); //刷新select选择框渲染
                                                    });

                                                }
                                            })
                                        }

                                    layui.use('form', function(){
                                        var form = layui.form;

                                        //授权全选设置
                                        form.on('checkbox(chk1)', function(data){
                                            /*console.log(data.elem); //得到checkbox原始DOM对象
                                            console.log(data.elem.checked); //是否被选中，true或者false
                                            console.log(data.value); //复选框value值，也可以通过data.elem.value得到
                                            console.log(data.othis); //得到美化后的DOM对象*/

                                            var moduleid=$(".moduleid").length; //获取所有权限数量
                                            for (i=0;i<moduleid;i++){
                                                if(data.elem.checked==true){
                                                    $(".moduleid").get(i).checked = true;
                                                }else {
                                                    $(".moduleid").get(i).checked = false;
												}
											}
                                            form.render('checkbox'); //刷新select选择框渲染

                                        });

                                        //授予权限查看事件
                                        form.on('select(userid1)', function (data) {

                                            insert($("#userid1").val());


                                        })

                                        //删除全选设置
                                        form.on('checkbox(chk2)', function(data){
                                            /*console.log(data.elem); //得到checkbox原始DOM对象
                                            console.log(data.elem.checked); //是否被选中，true或者false
                                            console.log(data.value); //复选框value值，也可以通过data.elem.value得到
                                            console.log(data.othis); //得到美化后的DOM对象*/

                                            var moduleid=$(".moduleid2").length; //获取所有权限数量
                                            for (i=0;i<moduleid;i++){
                                                if(data.elem.checked==true){
                                                    $(".moduleid2").get(i).checked = true;
                                                }else {
                                                    $(".moduleid2").get(i).checked = false;
                                                }
                                            }
                                            form.render('checkbox'); //刷新select选择框渲染

                                        });

                                        //删除权限查看
                                        form.on('select(userid2)', function (data) {
                                            del($("#userid2").val());


                                        })
                                    });
								</script>
							</td>
						</tr>
						<tr>
							<script type="text/javascript">
                                $(function () {
                                    $("#delete2").click(function () {
                                        var modules="";
                                        $("[name='moduleid2']").each(function (index, element) {

                                            if($(this).get(0).checked == true)
                                            {
                                                modules += $(this).val() + ",";
                                            }

                                        });
                                        var userId=$("#userid2").val();
                                        if (modules.length > 0) //如果获取到
                                            modules = modules.substring(0, modules.length - 1); //把最后一个逗号去掉
                                        $.ajax({
                                            url:'${pageContext.request.contextPath}/accmodule/accmoduleDelete.action',
                                            data:{'module':modules,'userId':userId},
                                            type:'post',
                                            success:function (res) {
                                                if (res>0){
                                                    alert("删除权限成功")
                                                    //刷新
                                                    del(userId);
                                                    if(userId==$("#userid1").val()){
                                                        insert(userId);
                                                    }
                                                } else
                                                    alert("删除权限失败")
                                            }
                                        })
                                    })
                                })

							</script>
							<td colspan="2">


										<form action="#"  class="layui-form"  method="post"
											  name="form3">
											<table align="center" width="800" cellpadding="3"
												   cellspacing="1" border="1" id="delete">

												<tr >
													<td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid"
														colspan="5">
														<h3>当&nbsp;&nbsp;前&nbsp;&nbsp;用&nbsp;&nbsp;户&nbsp;&nbsp;权&nbsp;&nbsp;限</h3>
													</td>
													<td class="STYLE1" style="BORDER-BOTTOM: #c1dad7 1px solid" align="right">
														<input type="checkbox" lay-filter="chk2" name="chk2"  onclick="chk2state();" />全选 用户名称：

														<div style="width: 100px;display: inline-block" class="layui-input-block"  >
															<select name="userid" id="userid2" style="width: 100px" lay-filter="userid2">
																<c:forEach items="${userList}" var="user">
																	<c:if test="${users.id==user.id}">
																		<option value="${user.id }" selected>${user.username }</option>
																	</c:if>
																	<c:if test="${users.id != user.id}">
																		<option value="${user.id }">${user.username }</option>
																	</c:if>
																</c:forEach>
															</select>
														</div>
<c:forEach items="${listAcc}" var="accmoudle">
    <c:if test="${accmoudle.module.moduleid==50}">

														<input type="button" id="delete2" value="删除权限"   style="display: inline-block">
    </c:if>

</c:forEach>


                                                    </td>
												</tr>

													<%--<c:forEach items="${usermod}" var="module" varStatus="m">
                                                        <c:if test="${m.index % 6==0}">
                                                            <tr>
                                                        </c:if>
                                                        <td class="STYLE1" nowrap="nowrap"
                                                            style="BORDER: #c1dad7 1px solid"><input
                                                            type="checkbox" name="accid" value="${module.id}" />${module.modulename}
                                                        </td>
                                                        <c:if test="${m.index % 6==5}">
                                                            </tr>
                                                        </c:if>
                                                    </c:forEach>--%>
											</table>
										</form>

							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
	<SCRIPT src="${pageContext.request.contextPath}/js/transform.js" type=text/javascript></SCRIPT>
</body>
</html>
