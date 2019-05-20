<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
    用户资料列表
</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="css/reset.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/invalid.css" type="text/css" media="screen"/>
    <script language="javascript" src="js/jquery-1.7.2.js"></script>
    <!-- 引入jquery -->
    <script type="text/javascript" src="static/js/jquery.min.js"></script>
    <!-- 引入样式 -->
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="layer/layer.js"></script>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
</head>
<body style="background: #cc9999;" onload="return ifadd('${id}','${pn}')">
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>用户资料列表</div>
</div>
<div class="content-box role">
    <div class="content-box-content">
        <div class="tab-content default-tab" id="form">
            <div>
                <p style="float: left;margin:-16px 10px"><img src="images/user-info.gif"/></p>
                <p style="float: left;" class="left_txt2">用户资料列表</p>
                <div align="center" style="float: left;margin-left: 40%">
                    <%--<img src="images/ico_Form.gif" width="14" height="14"/>&nbsp;--%><a
                        href='addUser' class="btn btn-success"><span
                        class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;新增</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <%--<img src="images/ico_Form.gif" width="14" height="14"/>&nbsp;--%><a
                        href='javascript:self.location.reload();' class="btn btn-success"><span
                        class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;刷新</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <%--<img src="images/002.gif" width="14" height="14"/>--%><A
                        href="right" class="btn btn-success"><span
                        class="glyphicon glyphicon-backward"></span>&nbsp;&nbsp;返回</A>
                </div>
                <table style="background-color: white" id="user_table" align="center" width="800" cellpadding="3"
                       cellspacing="1" border="1">
                    <thead style="font:16px bold">
                    <tr>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            用户名称
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            部门名称
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            工作岗位
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            联系电话
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            状态
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            公司名称
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            操作
                        </td>
                    </tr>
                    </thead>
                    <tbody style="border: 1px" align="center">
                    </tbody>

                </table>
                <table style="color: white">
                    <tr>
                        <td>
                            <div class="row">
                                <!-- 分页文字信息 -->
                                <div class="col-md-6" id="page_info_area"></div>
                                <!-- 分页条信息 -->
                                <div class="col-md-6" id="page_nav_area"></div>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</div>
<%--<SCRIPT src="js/transform.js" type=text/javascript></SCRIPT>--%>
<script type="text/javascript">
    var totalRecode, currentPage;
    /* 1.页面加载完成以后，直接去发送一个ajax请求，要到分页数据 */
    /* $(function() {
         //去首页
         to_page(1);
     });*/
    function to_page(pn) {
        $.ajax({
            url: "users",
            data: "pn=" + pn,
            type: "GET",
            success: function (result) {
                //console.log(result);
                //1.解析并显示员工数据
                build_emps_table(result);
                //2.解析并显示分页信息
                build_page_info(result);
                //3.解析显示分页条数据
                build_page_nav(result);
            }
        });
    }

    function build_emps_table(result) {
        //清空table表格
        $("#user_table tbody").empty();
        var users = result.extend.pageInfo.list;
        $.each(users, function (index, item) {
            var username = $("<td></td>").append(item.username);
            var depname = $("<td></td>").append(item.depname);
            var degree = $("<td></td>").append(item.degree);
            var mobile = $("<td></td>").append(item.mobile);
            var staus = $("<td></td>").append(item.staus == 1 ? "启用" : "禁用");
            var companyname = $("<td></td>").append(item.companyname);
            var editBtn = $("<button onclick=" + "javascript:window.location.href='userInfo/" + item.id + "'></button>").addClass(
                "btn btn-primary btn-sm").append(
                $("<span></span>").addClass(
                    "glyphicon glyphicon-pencil")).append("修改");
            var delBtn = $("<button class='btn-danger'></button>").addClass(
                "btn btn-danger btn-sm").append(
                $("<span></span>")
                    .addClass("glyphicon glyphicon-trash")).append(
                "删除");
            delBtn.attr("del-id", item.id);
            var disBtn = $("<button class='btn-warning'></button>").addClass(
                "btn btn-warning btn-sm").append(
                $("<span></span>")
                    .addClass("glyphicon glyphicon-remove-circle")).append(
                "禁用");
            disBtn.attr("dis-id", item.id);
            var btnTd = $("<td></td>").append(editBtn).append(" ").append(
                delBtn).append(" ").append(disBtn);
            $("<tr></tr>").append(username).append(depname).append(degree).append(mobile).append(staus).append(companyname).append(btnTd).appendTo("#user_table tbody");
        });
    }

    //解析显示分页信息
    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append(
            "当前" + result.extend.pageInfo.pageNum + "页,总"
            + result.extend.pageInfo.pages + "页,总"
            + result.extend.pageInfo.total + "记录")
        totalRecode = result.extend.pageInfo.total;
        currentPage = result.extend.pageInfo.pageNum;
    }

    function ifadd(id, pn) {
        if (id != "") {
            to_page(id * 2);
            return true;
        }
        if (pn != "") {
            to_page(pn);
            return true;
        }
        if (id == "" || pn == "") {
            to_page(1);
            return true;
        }
    }

    //解析显示分页条,点击分页要能去下一页....
    function build_page_nav(result) {
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        //构建元素
        var firstPageLi = $("<li></li>").append(
            $("<a></a>").append("首页"));
        var prePageLi = $("<li></li>").append(
            $("<a></a>").append("&laquo;"));
        if (result.extend.pageInfo.hasPreviousPage == false) {
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        } else {
            //为元素添加点击翻页的事件
            firstPageLi.click(function () {
                to_page(1);
            });
            prePageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum - 1);
            });
        }
        var nexPageLi = $("<li></li>").append(
            $("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append(
            $("<a></a>").append("末页"));
        if (result.extend.pageInfo.hasNextPage == false) {
            nexPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        } else {
            nexPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum + 1);
            });
            lastPageLi.click(function () {
                to_page(result.extend.pageInfo.pages);
            });
        }
        //添加首页和前一页的提示
        ul.append(firstPageLi).append(prePageLi);
        //回调函数
        //1,2,3,4,5
        $.each(result.extend.pageInfo.navigatepageNums, function (index,
                                                                  item) {
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if (result.extend.pageInfo.pageNum == item) {
                numLi.addClass("active");
            }
            numLi.click(function () {
                to_page(item);
            });
            ul.append(numLi);
        });
        ul.append(nexPageLi).append(lastPageLi);
        //把ul加入到nav
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }

    //删除一条记录
    $(document).on("click", ".btn-danger", function () {
        //弹出是否确认删除对话框
        var userName = $(this).parents("tr").find("td:eq(0)").text();
        var userid = $(this).attr("del-id");
        layer.confirm("确认删除【" + userName + "】吗？", {
            btn: ['确认', '取消'] //按钮
        }, function () {
            //确认，发送ajax请求删除即可
            $.ajax({
                url: "/delUser/" + userid,
                type: "DELETE",
                success: function (result) {
                    layer.msg('删除成功', {icon: 1});
                    to_page(currentPage);
                }
            });
        }, function () {

        });
    });
    //禁用（修改用户状态）dis-id
    $(document).on("click", ".btn-warning", function () {
        //弹出是否确认删除对话框
        var userName = $(this).parents("tr").find("td:eq(0)").text();
        var userid = $(this).attr("dis-id");
        layer.confirm("是否禁用【" + userName + "】？", {
            btn: ['是', '否'] //按钮
        }, function () {
            //确认，发送ajax请求删除即可
            $.ajax({
                url: "/modUserstau/" + userid,
                type: "POST",
                success: function (result) {
                    layer.msg('已禁用', {icon: 1});
                    to_page(currentPage);
                }
            });
        }, function () {

        });
    });
</script>
</body>
</html>
