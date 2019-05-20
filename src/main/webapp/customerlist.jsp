<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1"><title>
    客户资料列表
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
</head>
<body style="background-color: #cc9999">
<div id="maintitle">
    <div id="mainico"></div>
    <div id="maintip"><strong>位置：</strong>客户资料列表</div>
</div>
<div class="content-box role">
    <div class="content-box-content">
        <div class="tab-content default-tab" id="form">
            <div>
                <p style="float: left;margin:-16px 10px"><img src="images/user-info.gif"/></p>
                <p style="float: left;" class="left_txt2">客户资料列表</p>
                <div align="center" style="float: left;margin-left: 40%">
                    <%--<img src="images/ico_Form.gif" width="14" height="14"/>&nbsp;--%><a
                        href='addUser' class="btn btn-success"><span
                        class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;新增</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <%--<img src="images/ico_Form.gif" width="14" height="14"/>&nbsp;--%><a
                        href='javascript:self.location.reload();' class="btn btn-success"><span
                        class="glyphicon glyphicon-refresh"></span>&nbsp;&nbsp;刷新</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <%--<img src="images/002.gif" width="14" height="14"/>--%><A
                        href="javascript:self.history.back();" class="btn btn-success"><span
                        class="glyphicon glyphicon-backward"></span>&nbsp;&nbsp;返回</A>
                </div>
                <table id="cus" style="background-color: white" align="center" width="800" cellpadding="3"
                       cellspacing="1" border="1">
                    <thead style="font:16px bold">
                    <tr>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            客户名称
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            联系人
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            联系电话
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            结算方式
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            所在区域
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            客户类型
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            应收金额
                        </td>
                        <td align="center" class="STYLE1" nowrap="nowrap" style="BORDER: #c1dad7 1px solid">
                            应付金额
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
<script type="text/javascript">
    var totalRecode, currentPage;
    /* 1.页面加载完成以后，直接去发送一个ajax请求，要到分页数据 */
    $(function () {
        //去首页
        to_page(1);
    });

    function to_page(pn) {
        $.ajax({
            url: "customer",
            data: "pn=" + pn,
            type: "GET",
            success: function (result) {
                console.log(result);
                //1.解析并显示员工数据
                build_cus_table(result);
                //2.解析并显示分页信息
                build_page_info(result);
                //3.解析显示分页条数据
                build_page_nav(result);
            }
        });
    }

    function build_cus_table(result) {
        //清空table表格
        $("#cus tbody").empty();
        var cuss = result.extend.pageInfo.list;
        $.each(cuss, function (index, item) {
            var customername = $("<td></td>").append(item.customername);
            var contactname = $("<td></td>").append(item.contactname);
            var phone = $("<td></td>").append(item.phone);
            var paidname = $("<td></td>").append(item.paidtype.paidname);
            var areaname = $("<td></td>").append(item.area.areaname);
            var customertypename = $("<td></td>").append(item.customertype.customertypename);
            var factmoney = $("<td></td>").append(item.factmoney);
            var paidmoney = $("<td></td>").append(item.paidmoney);
            var b1 = $("<button></button>").addClass(
                "btn btn-primary btn-sm").append("收/付款");
            var b2 = $("<button></button>").addClass(
                "btn btn-danger btn-sm").append("收付款明细");
            var b3 = $("<button></button>").addClass(
                "btn btn-warning btn-sm").append("订单明细");
            var b4 = $("<button></button>").addClass(
                "btn btn-warning btn-sm").append("修改");
            var b5 = $("<button></button>").addClass(
                "btn btn-warning btn-sm").append("删除");
            var btnTd = $("<td></td>").append(b1).append(" ").append(
                b2).append(" ").append(b3).append(" ").append(b4).append(" ").append(b5);
            $("<tr></tr>").append(customername).append(contactname).append(phone).
            append(paidname).append(areaname).append(customertypename).append(factmoney).
            append(paidmoney).
            append(btnTd).appendTo("#cus tbody");
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
                    layer.msg('已禁用', {icon: 2});
                    to_page(currentPage);
                }
            });
        }, function () {

        });
    });
</script>
</body>
</html>
